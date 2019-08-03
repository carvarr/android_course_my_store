package curso.carlos.mystore;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0010H\u0014J \u0010!\u001a\u00020\u00102\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0016J\u0018\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0016H\u0016J\b\u0010%\u001a\u00020\u0010H\u0016J\b\u0010&\u001a\u00020\u0010H\u0002J\b\u0010\'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"}, d2 = {"Lcurso/carlos/mystore/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcurso/carlos/mystore/helpers/ProductAsyncListener;", "Lcom/google/android/gms/security/ProviderInstaller$ProviderInstallListener;", "()V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "productRepo", "Lcurso/carlos/mystore/repositories/ProductRepository;", "products", "Ljava/util/ArrayList;", "Lcurso/carlos/mystore/model/Product;", "Lkotlin/collections/ArrayList;", "retryProviderInstall", "", "loadProductsAsync", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPostResume", "onProductListLoaded", "onProviderInstallFailed", "errorCode", "recoveryIntent", "onProviderInstalled", "onProviderInstallerNotAvailable", "onSeeded", "redirectToLogin", "seed", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements curso.carlos.mystore.helpers.ProductAsyncListener, com.google.android.gms.security.ProviderInstaller.ProviderInstallListener {
    private com.google.firebase.auth.FirebaseAuth auth;
    private java.util.ArrayList<curso.carlos.mystore.model.Product> products;
    private curso.carlos.mystore.repositories.ProductRepository productRepo;
    private boolean retryProviderInstall;
    private static final int ERROR_DIALOG_REQUEST_CODE = 1;
    public static final curso.carlos.mystore.MainActivity.Companion Companion = null;
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
    
    /**
     * llamado cuando se carga la lista de productos
     */
    @java.lang.Override()
    public void onProductListLoaded(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<curso.carlos.mystore.model.Product> products) {
    }
    
    /**
     * llamado cuando se realiza el seeding de la base de datos
     */
    @java.lang.Override()
    public void onSeeded() {
    }
    
    /**
     * Provider Security
     */
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    /**
     * On resume, check to see if we flagged that we need to reinstall the
     * provider.
     */
    @java.lang.Override()
    protected void onPostResume() {
    }
    
    /**
     * This method is only called if the provider is successfully updated
     * (or is already up-to-date).
     */
    @java.lang.Override()
    public void onProviderInstalled() {
    }
    
    /**
     * This method is called if updating fails; the error code indicates
     * whether the error is recoverable.
     */
    @java.lang.Override()
    public void onProviderInstallFailed(int errorCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent recoveryIntent) {
    }
    
    private final void onProviderInstallerNotAvailable() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcurso/carlos/mystore/MainActivity$Companion;", "", "()V", "ERROR_DIALOG_REQUEST_CODE", "", "showFullImage", "", "imageUrl", "", "context", "Landroid/content/Context;", "showProductDetail", "product", "Lcurso/carlos/mystore/model/Product;", "app_debug"})
    public static final class Companion {
        
        public final void showProductDetail(@org.jetbrains.annotations.NotNull()
        curso.carlos.mystore.model.Product product, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        public final void showFullImage(@org.jetbrains.annotations.NotNull()
        java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
        
        private Companion() {
            super();
        }
    }
}