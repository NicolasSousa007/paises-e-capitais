@file:Suppress("UNUSED_EXPRESSION", "IMPLICIT_CAST_TO_ANY")

fun Capital(pais:String): String {
    val capital: String = when (pais) {
        "brasil", "Brasil", "BRASIL" -> "Brasilia"
        "argentina", "Argentina", "ARGENTINA" -> "Buenos Aires"
        "chile", "Chile", "CHILE" -> "Santiago"
        "peru", "Peru", "PERU" -> "Lima"
        "equador", "Equador", "EQUADOR" -> "Quito"
        "bolivia", "Bolivia", "BOLIVIA" -> "La Paz"
        "paraguai", "Paraguai", "PARAGUAI" -> "Assunção"
        "colombia", "Colombia", "COLOMBIA" -> "Bogotá"
        "venezuela", "Venezuela", "VENEZUELA" -> "Caracas"
        "guiana", "Guiana", "GUIANA" -> "Georgetown"
        "suriname", "Suriname", "SURINAME" -> "Paramaribo"
        "guiana francesa", "Guiana francesa", "guiana Francesa", "Guiana Francesa", "GUIANA FRANCESA" -> "Calena"
        else -> "País inválido"
    }
    return capital
}


fun main() {
    val pais: String
    println("ATENÇÃO: Este Programa Não Aceita Acentos\n")
    println("qual é seu nome?")
    val nome = readLine()
    println("Para sair do programa tecle s")
    println("Qual o país da américa do sul que você quer saber a capital ${nome}?")
    pais = readLine().toString()
    println(Capital(pais))
}