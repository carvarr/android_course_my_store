package curso.carlos.mystore.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import curso.carlos.mystore.database.entities.ProductEntity

@Dao
interface ProductDao {

    @Insert
    fun insert(product: ProductEntity)

    @Query("SELECT * FROM " + ProductEntity.TABLE_NAME + " ORDER BY pro_id DESC" )
    fun getOrderedProducts(): List<ProductEntity>

    @Query("DELETE FROM " + ProductEntity.TABLE_NAME)
    fun removeAllProducts()
}