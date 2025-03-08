
fun main() {

//    • 70 - [DESAFIO] Desenvolva um programa que leia o primeiro termo e a
//    razão de uma PA (Progressão Aritmética), mostrando na tela os 10
//    primeiros elementos da PA e a soma entre todos os valores da sequência.

    println("DESONVOLVENDO UMA PROGRESSÃO ARITMÉTIA (PA)\n")
    println("----------------------------------------------------\n")
    println("INFORME QUAL SERÁ O PRIMEIRO TERMO DA PA: ")
    var A = readln()!!.toInt()
    println("E QUAL SERÁ A RAZÃO DELA (O INTERVALO DE NUMEROS QUE SERÁ PULADO): ")
    var razao = readln()!!.toInt()

    var PA = mutableListOf(A)
    var soma = A
    for (i in 1..8){
        val fazendo_pa = PA[i - 1] + razao
        PA.add(fazendo_pa)
        soma += fazendo_pa

    }
    println("$PA\n-----------------")
    println("--> $soma <-- \nesta é a soma dos 10 primeiros termos")
}

