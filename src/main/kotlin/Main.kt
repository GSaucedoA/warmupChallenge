val direccion1 = Direccion(
    "example",
    "",
    "",
    mapOf("nombreDeCalle" to "", "numero" to "", "entreCalle1" to "", "entreCalle2" to ""),
    "",
    ""
)

val direccion2 = Direccion(
    "example",
    "",
    "",
    mapOf("nombreDeCalle" to "", "numero" to "", "entreCalle1" to "", "entreCalle2" to ""),
    "",
    ""
)

val direccion3 = Direccion(
    "example",
    "",
    "",
    mapOf("nombreDeCalle" to "", "numero" to "", "entreCalle1" to "", "entreCalle2" to ""),
    "",
    ""
)

data class Direccion(
    val ciudad: String,
    val partido: String,
    val provincia: String,
    val calle: Map<String, String>,
    val pais: String,
    val codigoPostal: String,
    val piso: String? = null,
    val departamento: String? = null
)

fun printDireccion(direccion: Direccion) {
    println(
        "Ciudad: ${direccion.ciudad}, partido: ${direccion.partido}, provincia: ${direccion.provincia}, calle: ${direccion.calle}, pais: ${direccion.pais},codigo postal: ${direccion.codigoPostal}${
            if (direccion.piso != null) ", piso" else {
                ","
            }
        }${direccion.codigoPostal}${
            if (direccion.piso != null) "piso" else {
                ","
            }
        }"
    )
}

fun printArrayDirecciones(direcciones: Array<Direccion>): String {
    var response: String = ""
    direcciones.forEach {
        val direccion = it;
        if (direccion.piso != null && direccion.departamento != null) {
            response += "piso: \\(${direccion.piso}); departamento: \\(${direccion.departamento})"
        }
    }
    return response
}

