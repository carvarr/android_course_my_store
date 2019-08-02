package curso.carlos.mystore.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H&J\b\u0010\b\u001a\u00020\u0003H&\u00a8\u0006\t"}, d2 = {"Lcurso/carlos/mystore/helpers/ProductAsyncListener;", "", "onProductListLoaded", "", "products", "Ljava/util/ArrayList;", "Lcurso/carlos/mystore/model/Product;", "Lkotlin/collections/ArrayList;", "onSeeded", "app_debug"})
public abstract interface ProductAsyncListener {
    
    public abstract void onProductListLoaded(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<curso.carlos.mystore.model.Product> products);
    
    public abstract void onSeeded();
}