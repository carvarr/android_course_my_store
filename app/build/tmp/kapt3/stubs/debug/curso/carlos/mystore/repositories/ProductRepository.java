package curso.carlos.mystore.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bJ&\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcurso/carlos/mystore/repositories/ProductRepository;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "productDao", "Lcurso/carlos/mystore/database/dao/ProductDao;", "clean", "", "getList", "Ljava/util/ArrayList;", "Lcurso/carlos/mystore/model/Product;", "Lkotlin/collections/ArrayList;", "insert", "product", "toProduct", "entities", "", "Lcurso/carlos/mystore/database/entities/ProductEntity;", "InsertAsyncTask", "app_debug"})
public final class ProductRepository {
    private final curso.carlos.mystore.database.dao.ProductDao productDao = null;
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    curso.carlos.mystore.model.Product product) {
    }
    
    public final void clean() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<curso.carlos.mystore.model.Product> getList() {
        return null;
    }
    
    /**
     * Transform from product entity to product dto
     */
    private final java.util.ArrayList<curso.carlos.mystore.model.Product> toProduct(java.util.List<curso.carlos.mystore.database.entities.ProductEntity> entities) {
        return null;
    }
    
    public ProductRepository(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\'\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\t\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcurso/carlos/mystore/repositories/ProductRepository$InsertAsyncTask;", "Landroid/os/AsyncTask;", "Lcurso/carlos/mystore/database/entities/ProductEntity;", "Ljava/lang/Void;", "productDao", "Lcurso/carlos/mystore/database/dao/ProductDao;", "(Lcurso/carlos/mystore/database/dao/ProductDao;)V", "doInBackground", "products", "", "([Lcurso/carlos/mystore/database/entities/ProductEntity;)Ljava/lang/Void;", "app_debug"})
    static final class InsertAsyncTask extends android.os.AsyncTask<curso.carlos.mystore.database.entities.ProductEntity, java.lang.Void, java.lang.Void> {
        private final curso.carlos.mystore.database.dao.ProductDao productDao = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
        curso.carlos.mystore.database.entities.ProductEntity... products) {
            return null;
        }
        
        public InsertAsyncTask(@org.jetbrains.annotations.NotNull()
        curso.carlos.mystore.database.dao.ProductDao productDao) {
            super();
        }
    }
}