
fun main() {

//    • 56 - [DESAFIO] Vamos melhorar o jogo que fizemos no exercício
//    32. A partir de agora, o computador vai sortear um número entre
//    1 e 10 e o jogador vai ter 4 tentativas para tentar acertar.

    var numero = kotlin.random.Random.nextInt(1,11)
    println("------------------------------------\n")
    println("ADVINHE O NUMERO DE 1 A 10")
    var tentativas = 4
    println("VOCÊ POSSUI $tentativas tentativas")

    for(i in 1..4){
        print("DIGITE SEU CHUTE: ")
        var chute = readln()!!.toInt()
        if (chute == numero) {
            println("------------------\nPARABÉNS VOCÊ ACERTOU!!!!!!!!!!!!\n---------------------------")
            break
        } else {
            println("---------------------\nNÃO É ESTE\n TENTE NOVAMENTE\n TENTATIVAS RESTANTES: ${tentativas - i}\n-------------------------------")
            if (tentativas - i == 0){
                println("---------------\nPOXA QUE PENA :(\nNÃO FOI DESSA VEZ\n------------------------")
            }
        }

    }

}

