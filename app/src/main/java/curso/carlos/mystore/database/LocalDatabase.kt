package curso.carlos.mystore.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import curso.carlos.mystore.database.dao.ProductDao
import curso.carlos.mystore.database.entities.ProductEntity

@Database(entities = [ProductEntity::class], version = 2)
abstract  class LocalDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        private const val DATABASE_NAME = "store_database"
        private var INSTANCE: LocalDatabase? = null

        fun getInstance(contex: Context): LocalDatabase? {
            INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(contex.applicationContext, LocalDatabase::class.java, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build()
            }

            return INSTANCE
        }
    }
}