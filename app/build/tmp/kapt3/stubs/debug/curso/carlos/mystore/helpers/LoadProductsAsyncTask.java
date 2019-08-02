package curso.carlos.mystore.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002$\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ5\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000f\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u0010J$\u0010\u0011\u001a\u00020\u00122\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\u0005H\u0014R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcurso/carlos/mystore/helpers/LoadProductsAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "Ljava/util/ArrayList;", "Lcurso/carlos/mystore/model/Product;", "Lkotlin/collections/ArrayList;", "productRepo", "Lcurso/carlos/mystore/repositories/ProductRepository;", "context", "Landroid/content/Context;", "(Lcurso/carlos/mystore/repositories/ProductRepository;Landroid/content/Context;)V", "productAsyncListener", "Lcurso/carlos/mystore/helpers/ProductAsyncListener;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/util/ArrayList;", "onPostExecute", "", "result", "app_debug"})
public final class LoadProductsAsyncTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.util.ArrayList<curso.carlos.mystore.model.Product>> {
    private curso.carlos.mystore.helpers.ProductAsyncListener productAsyncListener;
    private curso.carlos.mystore.repositories.ProductRepository productRepo;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.util.ArrayList<curso.carlos.mystore.model.Product> doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.Void... params) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<curso.carlos.mystore.model.Product> result) {
    }
    
    public LoadProductsAsyncTask(@org.jetbrains.annotations.NotNull()
    curso.carlos.mystore.repositories.ProductRepository productRepo, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}