
fun main() {

//    71 - [DESAFIO] Faça um programa que mostre os 10 primeiros elementos
//    da Sequência de Fibonacci: 1 1 2 3 5 8 13 21...

    println("ESTE PROGRAMA EXIBE A SEQUÊNCIA DE FIBONACCI\n--------------------------------------")
    var fibonacci = mutableListOf(1, 1)

    for (i in 1..8){
        var proximo = fibonacci[i] + fibonacci[i-1]
        fibonacci.add(proximo)
    }
    println("$fibonacci\n----------")

}

