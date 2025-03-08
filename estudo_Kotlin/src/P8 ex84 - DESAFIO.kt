
fun main() {

//    • 84 - [DESAFIO] Crie uma lógica que preencha um vetor de 20 posições
//    com números aleatórios (entre 0 e 99) gerados pelo computador.
//    Logo em seguida, mostre os números gerados e depois coloque o
//    vetor em ordem crescente, mostrando no final os valores ordenados.

    println("\n\n\nESTE CODIGO IRÁ ALEATORIAMENTE ADICIONAR 20 VALORES E COLOCA-LOS EM ORDEM\n\n")

    var vetor = mutableListOf<Int>()

    for(i in 1..20){
        vetor.add(kotlin.random.Random.nextInt(100))
    }

    println("$vetor <-- SEM ORDEM")
    println("-----------------------------------------------------------------------------------------------")
    vetor.sort()
    println("$vetor <-- ORDENADOS")

}

