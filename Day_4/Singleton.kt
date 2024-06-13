fun main() {
    // companion object can be used in order to avoid using class name everytime
    DatabaseConnection.ConnectDB.connect()
    DatabaseConnection.ConnectDB.disconnect()
}

class DatabaseConnection {
    object ConnectDB {           // singleton object
        fun connect() {
            println("Connecting to DB.")
        }

        fun disconnect() {
            println("Disconnecting from DB.")
        }
    }
}