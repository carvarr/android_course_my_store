package curso.carlos.mystore.repositories

import android.app.Application
import android.os.AsyncTask
import curso.carlos.mystore.database.LocalDatabase
import curso.carlos.mystore.database.dao.ProductDao
import curso.carlos.mystore.database.entities.ProductEntity
import curso.carlos.mystore.model.Product

class ProductRepository(application: Application) {

    private val productDao: ProductDao? = LocalDatabase.getInstance(application)?.productDao()

    fun insert(product: Product) {
        val productEntity = ProductEntity(
            product.name,
            product.description,
            product.price,
            product.image
        )

        InsertAsyncTask(productDao!!).execute(productEntity)
    }

    fun clean() {
        productDao?.removeAllProducts()
    }

    fun getList(): ArrayList<Product> {
        val productsEntity = productDao?.getOrderedProducts() ?: ArrayList()
        return toProduct(productsEntity)
    }

    /**
     * Transform from product entity to product dto
     */
    private fun toProduct(entities: List<ProductEntity>): ArrayList<Product> {
        val products = ArrayList<Product>()
        for (entity in entities) {
            products.add(
                Product(
                    entity.name,
                    entity.description,
                    entity.image.toString(),
                    entity.price
                )
            )
        }
        return products;
    }

    private class InsertAsyncTask(private val productDao: ProductDao) :
        AsyncTask<ProductEntity, Void, Void>() {
        override fun doInBackground(vararg products: ProductEntity?): Void? {
            for (product in products) {
                if (product != null) productDao.insert(product)
            }
            return null
        }
    }

}