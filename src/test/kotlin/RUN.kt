@file:Suppress("JoinDeclarationAndAssignment")

fun main() {
    var pais: String
    println("ATENÇÃO: Este Programa Não Aceita Acentos\n")
    println("qual é seu nome?")
    val nome = readlnOrNull()
    println("Para sair do programa tecle s")
    while (true) {
        println("Qual o país da américa do sul que você quer saber a capital ${nome}?")
        pais = readlnOrNull().toString()
        if (pais == "s"){
            break
        }
        println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n${Capital(pais)}\nQuer saber a capital de outro país da américa do sul?\n[n/y]:")
        pais = readlnOrNull().toString()
        if (pais == "n"){
            break
        }
    }
    println("Bye Bye")
}