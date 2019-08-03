package curso.carlos.mystore

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.gms.security.ProviderInstaller
import com.google.firebase.auth.FirebaseAuth
import com.squareup.picasso.Picasso
import curso.carlos.mystore.adapters.ProductAdapter
import curso.carlos.mystore.gateway.LoginActivity
import curso.carlos.mystore.helpers.LoadProductsAsyncTask
import curso.carlos.mystore.helpers.ProductAsyncListener
import curso.carlos.mystore.helpers.SeedProductsAsyncTask
import curso.carlos.mystore.model.Product
import curso.carlos.mystore.repositories.ProductRepository
import io.reactivex.Observable
import io.reactivex.ObservableEmitter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ProductAsyncListener,
    ProviderInstaller.ProviderInstallListener {

    private lateinit var auth: FirebaseAuth
    private var products: ArrayList<Product> = ArrayList()
    private lateinit var productRepo: ProductRepository
    private var retryProviderInstall: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ProviderInstaller.installIfNeededAsync(this, this)

        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        if (auth.currentUser == null) {
            redirectToLogin()
            return
        }

        productRepo = ProductRepository(application)
        rv_products.layoutManager = LinearLayoutManager(this)
        rv_products.adapter = ProductAdapter(products, this)

        loadProductsAsync()
    }

    private fun seed() {
        val seedAsync = SeedProductsAsyncTask(productRepo, this)
        seedAsync.execute()
    }

    /**
     * carga productos de la bd local
     */
    private fun loadProductsAsync() {
        val loadAsync = LoadProductsAsyncTask(productRepo, this)
        loadAsync.execute()
    }

    /**
     * redirigir a login
     */
    private fun redirectToLogin() {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }


    /**
     * Inflar opciones de menu
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    /**
     * Manejar eventos clic sobre cada opcion del menu
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        R.id.action_seed -> {
            seed()
            true
        }
        R.id.action_logout -> {
            auth.signOut()
            redirectToLogin()
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }


    /**
     * llamado cuando se carga la lista de productos
     */
    override fun onProductListLoaded(products: ArrayList<Product>) {
        this.products.addAll(products)
        rv_products.adapter?.notifyDataSetChanged()
    }

    /**
     * llamado cuando se realiza el seeding de la base de datos
     */
    override fun onSeeded() {
        loadProductsAsync()
    }

    /**Provider Security**/

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == ERROR_DIALOG_REQUEST_CODE) {
            // Adding a fragment via GoogleApiAvailability.showErrorDialogFragment
            // before the instance state is restored throws an error. So instead,
            // set a flag here, which will cause the fragment to delay until
            // onPostResume.
            retryProviderInstall = true
        }
    }

    /**
     * On resume, check to see if we flagged that we need to reinstall the
     * provider.
     */
    override fun onPostResume() {
        super.onPostResume()
        if (retryProviderInstall) {
            // We can now safely retry installation.
            ProviderInstaller.installIfNeededAsync(this, this)
        }
        retryProviderInstall = false
    }

    /**
     * This method is only called if the provider is successfully updated
     * (or is already up-to-date).
     */
    override fun onProviderInstalled() {
        // Provider is up-to-date, app can make secure network calls.
    }

    /**
     * This method is called if updating fails; the error code indicates
     * whether the error is recoverable.
     */
    override fun onProviderInstallFailed(errorCode: Int, recoveryIntent: Intent) {
        GoogleApiAvailability.getInstance().apply {
            if (isUserResolvableError(errorCode)) {
                // Recoverable error. Show a dialog prompting the user to
                // install/update/enable Google Play services.
                showErrorDialogFragment(this@MainActivity, errorCode, ERROR_DIALOG_REQUEST_CODE) {
                    // The user chose not to take the recovery action
                    onProviderInstallerNotAvailable()
                }
            } else {
                onProviderInstallerNotAvailable()
            }
        }
    }

    private fun onProviderInstallerNotAvailable() {
        Log.d("Provider", "Provider not installed")
    }


    companion object {
        private const val ERROR_DIALOG_REQUEST_CODE = 1

        fun showProductDetail(product: Product, context: Context) {
            val intent = Intent(context, ProductDetailActivity::class.java)
            intent.putExtra(Product.PRODUCT_PARAM_NAME, product.name)
            intent.putExtra(Product.PRODUCT_PARAM_DESC, product.description)
            intent.putExtra(Product.PRODUCT_PARAM_IMG, product.image)
            intent.putExtra(Product.PRODUCT_PARAM_PRICE, product.price.toString())
            context.startActivity(intent)
        }

        fun showFullImage(imageUrl: String, context: Context) {
            val intent = Intent(context, ProductDetailActivity::class.java)
            intent.putExtra(Product.PRODUCT_PARAM_IMG, imageUrl)
            context.startActivity(intent)
        }
    }
}
