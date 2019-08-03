package curso.carlos.mystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import curso.carlos.mystore.model.Product

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val tvName = findViewById<TextView>(R.id.pro_detail_name)
        tvName.text = intent.extras.getString(Product.PRODUCT_PARAM_NAME)
        val tvPrice = findViewById<TextView>(R.id.pro_detail_price)
        tvPrice.text = "Price: ${intent.extras.getString(Product.PRODUCT_PARAM_PRICE)} $"
        val tvDesc = findViewById<TextView>(R.id.pro_detail_description)
        tvDesc.text = intent.extras.getString(Product.PRODUCT_PARAM_DESC)
        val image = findViewById<ImageView>(R.id.pro_detail_image)
        Picasso.get().load(intent.extras.getString(Product.PRODUCT_PARAM_IMG)).into(image)
    }
}
