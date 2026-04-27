class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(predicate: (T) -> Boolean): T? {
        return items.find(predicate)
    }
}