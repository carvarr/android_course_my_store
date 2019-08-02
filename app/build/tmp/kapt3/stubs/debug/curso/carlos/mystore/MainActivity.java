package curso.carlos.mystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J \u0010\u0018\u001a\u00020\r2\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0016J\b\u0010\u0019\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcurso/carlos/mystore/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcurso/carlos/mystore/helpers/ProductAsyncListener;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "productRepo", "Lcurso/carlos/mystore/repositories/ProductRepository;", "products", "Ljava/util/ArrayList;", "Lcurso/carlos/mystore/model/Product;", "Lkotlin/collections/ArrayList;", "loadProductsAsync", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onProductListLoaded", "onSeeded", "redirectToLogin", "seed", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements curso.carlos.mystore.helpers.ProductAsyncListener {
    private com.google.firebase.auth.FirebaseAuth auth;
    private java.util.ArrayList<curso.carlos.mystore.model.Product> products;
    private curso.carlos.mystore.repositories.ProductRepository productRepo;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void seed() {
    }
    
    /**
     * carga productos de la bd local
     */
    private final void loadProductsAsync() {
    }
    
    /**
     * redirigir a login
     */
    private final void redirectToLogin() {
    }
    
    /**
     * Inflar opciones de menu
     */
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    /**
     * Manejar eventos clic sobre cada opcion del menu
     */
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onProductListLoaded(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<curso.carlos.mystore.model.Product> products) {
    }
    
    @java.lang.Override()
    public void onSeeded() {
    }
    
    public MainActivity() {
        super();
    }
}