package curso.carlos.mystore.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = ProductEntity.TABLE_NAME )
data class ProductEntity(
    @ColumnInfo(name = "name") @NotNull val name: String,
    @ColumnInfo(name = "description") @NotNull val description: String,
    @ColumnInfo(name = "price") val price: Double,
    @ColumnInfo(name = "image") val image: String? = null
){
    companion object {
        const val TABLE_NAME = "products"
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "pro_id")
    var id: Int = 0
}