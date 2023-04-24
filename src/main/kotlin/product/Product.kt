package product

import db.Manager

data class Product(
    val id: Int, val name: String, val price: Float, val description: String, val brand: String, val category: String
)


fun createProduct(p: Product): Int {
    val db = Manager()
    val query = "INSERT INTO products (id, name, price, description, brand, category) VALUES (?, ?, ?, ?, ?, ?)"
    db.stmt(query).use {
        it.setInt(1, p.id)
        it.setString(1, p.name)
        it.setFloat(1, p.price)
        it.setString(1, p.description)
        it.setString(1, p.brand)
        it.setString(1, p.category)
        p
    }
    return p.id
}