package mx.edu.uthermosillo.a21311118.comandas.data.models

data class User(
    val id: Int,
    val name: String,
    val email: String,
    val password: String
) {
    override fun toString(): String {
        return name
    }
}
