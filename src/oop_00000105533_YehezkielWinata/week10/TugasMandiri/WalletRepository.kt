class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): T? {
        return items.find { 
            it is NamedEntity && it.name.equals(query, ignoreCase = true) 
        }
    }
}