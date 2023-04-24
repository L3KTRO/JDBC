package db

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement

class Manager() {

    private val jdbcUrl = "jdbc:postgresql://192.168.0.49:5432/postgres"
    private val connection: Connection = DriverManager.getConnection(jdbcUrl, "postgres", "Test1234")

    init {
        if (!connection.isValid(0)) throw error("No conectado con la base de datos.")
    }

    fun stmt(query: String): PreparedStatement {
        return connection.prepareStatement(query)
    }


}