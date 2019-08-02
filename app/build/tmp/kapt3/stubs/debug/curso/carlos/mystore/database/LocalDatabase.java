package curso.carlos.mystore.database;

import java.lang.System;

@androidx.room.Database(entities = {curso.carlos.mystore.database.entities.ProductEntity.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcurso/carlos/mystore/database/LocalDatabase;", "Landroidx/room/RoomDatabase;", "()V", "productDao", "Lcurso/carlos/mystore/database/dao/ProductDao;", "Companion", "app_debug"})
public abstract class LocalDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "store_database";
    private static curso.carlos.mystore.database.LocalDatabase INSTANCE;
    public static final curso.carlos.mystore.database.LocalDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract curso.carlos.mystore.database.dao.ProductDao productDao();
    
    public LocalDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcurso/carlos/mystore/database/LocalDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcurso/carlos/mystore/database/LocalDatabase;", "getInstance", "contex", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final curso.carlos.mystore.database.LocalDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context contex) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}