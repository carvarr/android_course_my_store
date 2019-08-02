package curso.carlos.mystore.helpers

import android.content.Context
import android.os.AsyncTask
import curso.carlos.mystore.model.Product
import curso.carlos.mystore.repositories.ProductRepository

interface ProductAsyncListener {
    fun onProductListLoaded(products: ArrayList<Product>)
    fun onSeeded()
}

class LoadProductsAsyncTask : AsyncTask<Void, Void, ArrayList<Product>> {

    private var productAsyncListener: ProductAsyncListener
    private var productRepo: ProductRepository

    constructor(productRepo: ProductRepository, context: Context) {
        productAsyncListener = context as ProductAsyncListener
        this.productRepo = productRepo
    }

    override fun doInBackground(vararg params: Void?): ArrayList<Product> {
        return productRepo.getList()
    }

    override fun onPostExecute(result: ArrayList<Product>?) {
        productAsyncListener.onProductListLoaded(result!!)
    }
}

class SeedProductsAsyncTask : AsyncTask<Void, Void, Void> {

    private var productAsyncListener: ProductAsyncListener
    private var productRepo: ProductRepository

    constructor(productRepo: ProductRepository, context: Context) {
        productAsyncListener = context as ProductAsyncListener
        this.productRepo = productRepo
    }

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

        productAsyncListener.onSeeded()

        return null
    }
}