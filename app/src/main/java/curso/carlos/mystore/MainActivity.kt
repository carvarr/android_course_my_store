package curso.carlos.mystore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
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

class MainActivity : AppCompatActivity(), ProductAsyncListener {

    private lateinit var auth: FirebaseAuth
    private var products: ArrayList<Product> = ArrayList()
    private lateinit var productRepo: ProductRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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


    override fun onProductListLoaded(products: ArrayList<Product>) {
        this.products.addAll(products)
        rv_products.adapter?.notifyDataSetChanged()
    }

    override fun onSeeded() {
        loadProductsAsync()
    }

    /*private class LoadProductsAsyncTask(private val productRepo: ProductRepository, var emitter: ObservableEmitter<ArrayList<Product>>) :
        AsyncTask<Void, Void, ArrayList<Product>>() {
        override fun doInBackground(vararg params: Void?): ArrayList<Product> {
            return productRepo.getList()
        }

        override fun onPostExecute(result: ArrayList<Product>?) {

        }
    }

    private class SeedProductsAsyncTask(private val productRepo: ProductRepository) :
        AsyncTask<Void, Void, Void>() {
        override fun doInBackground(vararg params: Void?): Void? {
            productRepo.clean()

            var product = Product(
                "Gigabyte Z390 UD",
                "Este chipset incorpora ahora la capacidad de procesar los datos necesarios para aquellas placas que tengan wifi AC y/o bluetooth",
                "https://media.lifeinformatica.com/contents/Life/GIGABYTE-GAZ39UD-00-G/imgs/GAZ39UD-00-G-01_200x200.jpg",
                200.00
            )
            productRepo.insert(product)
            product = Product(
                "Disco duro Gigabyte / Modelo: GP-GSTFS31240GNTD",
                "Los SSD de gigabyte poseen una alta velocidad de transferencia de datos y una mayor resistencia, brindando un mtbf * duradero de 2,0 millones de horas",
                "https://www.servilab.com.mx/wp-content/uploads/2019/05/10116651.jpg",
                37.50
            )
            productRepo.insert(product)
            product = Product(
                "Gigabyte AORUS H5 Gaming Headset",
                "Auricular de alta potencia de Gigabyte, ideal para videojuegos con tecnología nsync para una experiencia mas profunda",
                "https://www.virtualcomputerrepairs.ie/wp-content/uploads/spgig-gpaorush5.jpg",
                75.20
            )
            productRepo.insert(product)
            product = Product(
                "Gigabyte Teclado Gigabyte Gaming Force K83 USB",
                "Construido con interruptores mecánicos de juego superiores, el FORCE K85 ofrece una respuesta clave increíblemente sensible y precisa con cada pulsación de tecla realizada",
                "https://www.berebere.net/normal/teclado_gigabyte_gaming_force_k83_usb_gk_forcek83_sp.jpg",
                52.50
            )
            productRepo.insert(product)
            product = Product(
                "Gigabyte Aorus M5 RGB Gaming 16000 Dpi",
                "AORUS M5 cuenta con un sensor óptico de 16000 ppp (Pixart 3389) de nivel entusiasta, capaz de 400ips y 50G de aceleración, que le brinda la máxima precisión para juegos competitivos.",
                "https://www.coolmod.com/images/stories/virtuemart/product/resized/gigabyte-aorus-m5-rgb-gaming-16000-dpi-ratan-001_200x200.jpg",
                86.25
            )
            productRepo.insert(product)

            return null
        }
    }*/
}
