package curso.carlos.mystore.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\'\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u000b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\rR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcurso/carlos/mystore/helpers/SeedProductsAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "productRepo", "Lcurso/carlos/mystore/repositories/ProductRepository;", "context", "Landroid/content/Context;", "(Lcurso/carlos/mystore/repositories/ProductRepository;Landroid/content/Context;)V", "productAsyncListener", "Lcurso/carlos/mystore/helpers/ProductAsyncListener;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Void;", "app_debug"})
public final class SeedProductsAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
    private curso.carlos.mystore.helpers.ProductAsyncListener productAsyncListener;
    private curso.carlos.mystore.repositories.ProductRepository productRepo;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Void doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    public SeedProductsAsyncTask(@org.jetbrains.annotations.NotNull()
    curso.carlos.mystore.repositories.ProductRepository productRepo, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}