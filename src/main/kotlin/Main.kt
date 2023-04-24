import db.Manager
import product.Product
import product.createProduct
import java.sql.DriverManager


fun main(){
    val product = Product(1, "Smartphone", 999.99f, "The latest smartphone model", "Apple", "Electronics")
    val productId = createProduct(product)
    println("Product ID: $productId")
}
