
fun main() {

//    32 - [DESAFIO] Crie um jogo onde o computador vai sortear um número
//    entre 1 e 5 o jogador vai tentar descobrir qual foi o valor
//    sorteado.

    var numero = kotlin.random.Random.nextInt(1,6)
    println("------------------------------------\n")
    println("ADVINHE O NUMERO DE 1 A 5")
    var chute = readln()!!.toInt()

    if (chute == numero){
        println("PARABÉNS VOCÊ ACERTOU!!!!!!!!!!!!")
    }
    else{
        println("POXA QUE PENA :(\n NÃO FOI DESSA VEZ")
    }

}