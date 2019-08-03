package curso.carlos.mystore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.ConfirmationPrompt
import android.widget.ImageView
import com.squareup.picasso.Picasso
import curso.carlos.mystore.helpers.ImageConfirmationCallback
import curso.carlos.mystore.helpers.ImageConfirmationPromptData
import curso.carlos.mystore.model.Product
import java.util.concurrent.Executor

class ProductImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_image)

        val imageUrl = intent.extras.getString(Product.PRODUCT_PARAM_IMG)

        val myExtraData = byteArrayOf()
        val myDialogData = ImageConfirmationPromptData(imageUrl)
        val threadReceivingCallback = Executor { runnable -> runnable.run() }
        val callback = ImageConfirmationCallback()
        val dialog = ConfirmationPrompt.Builder(this)
            .setPromptText("uri: ${imageUrl}")
            .setExtraData(myExtraData)
            .build()

        dialog.presentPrompt(threadReceivingCallback, callback)

        val image = findViewById<ImageView>(R.id.pro_full_image)
        Picasso.get().load(imageUrl).into(image)
    }
}
