package curso.carlos.mystore.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\'J\b\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcurso/carlos/mystore/database/dao/ProductDao;", "", "getOrderedProducts", "", "Lcurso/carlos/mystore/database/entities/ProductEntity;", "insert", "", "product", "removeAllProducts", "app_debug"})
public abstract interface ProductDao {
    
    @androidx.room.Insert()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    curso.carlos.mystore.database.entities.ProductEntity product);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM products ORDER BY pro_id DESC")
    public abstract java.util.List<curso.carlos.mystore.database.entities.ProductEntity> getOrderedProducts();
    
    @androidx.room.Query(value = "DELETE FROM products")
    public abstract void removeAllProducts();
}