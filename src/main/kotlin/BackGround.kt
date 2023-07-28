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
        "guiana francesa", "Guiana francesa", "guiana Francesa", "Guiana Francesa", "GUIANA francesa", "guiana FRANCESA", "Guiana FRANCESA", "GUIANA Francesa"-> "Calena"
        else -> "País inválido"
    }
    return capital
}
