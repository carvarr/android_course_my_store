package curso.carlos.mystore.model

data class Product(
    val name: String = TODO(),
    val description: String = TODO(),
    val image: String = TODO(),
    val price: Double = TODO()
) {
    companion object {
        const val PRODUCT_PARAM_NAME = "PRODUCT_NAME"
        const val PRODUCT_PARAM_DESC = "PRODUCT_DESC"
        const val PRODUCT_PARAM_IMG = "PRODUCT_IMG"
        const val PRODUCT_PARAM_PRICE = "PRODUCT_PRICE"

    }
}