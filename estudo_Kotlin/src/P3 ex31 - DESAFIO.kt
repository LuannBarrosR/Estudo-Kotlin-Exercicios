import java.security.Principal

fun main() {

//    31 [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)

    println("----------------------------")
    println("BEM VINDO AO JOGO DO JOKENPÔ\n")
    println("Escolha:\n (1) PEDRA \n (2) PAPEL \n (3) TESOURA \n")
    var escolha = readln()!!.toInt()
    var escolha_maquina = kotlin.random.Random.nextInt(1,4)


    if(escolha == 1 && escolha_maquina == 1 || escolha == 2 && escolha_maquina == 2 || escolha == 3 && escolha_maquina == 3){
        println("VOCÊ ESCOLHEU PEDRA E A MAQUINA ESCOLHEU PEDRA\n\n")
        println("----   O JOGO EMPATOU   ----")
    }
    else if(escolha == 1 && escolha_maquina == 2 || escolha == 2 && escolha_maquina == 3 || escolha == 3 && escolha_maquina == 1){
        println("VOCÊ ESCOLHEU PEDRA E A MAQUINA ESCOLHEU PAPEL\n\n")
        println("----   VOCÊ PERDEU   ----")
    }
    else if(escolha == 1 && escolha_maquina == 3 || escolha == 2 && escolha_maquina == 1 || escolha == 3 && escolha_maquina == 2){
        println("VOCÊ ESCOLHEU PEDRA E A MAQUINA ESCOLHEU TESOURA\n\n")
        println("----   VOCÊ GANHOU   ----")
    }


}