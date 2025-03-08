fun main() {
//    [DESAFIO] Escreva um programa para calcular a redução do tempo
//    de vida de um fumante. Pergunte a quantidade de cigarros fumados
//            por dias e quantos anos ele já fumou. Considere que um fumante
//        perde 10 min de vida a cada cigarro. Calcule quantos dias de vida
//        um fumante perderá e exiba o total em dias.



    println("Quantos cigarros fuma por dia?")
    var fuma: Int = readln().toInt()

    println("Quantos anos ja fuma?")
    var anos = readln()!!.toInt()

    println("Quantos anos você tem?")
    var idade = readln()!!.toInt()

    var fumados_ano = (fuma * 365).toInt()
    var fumados_vida = (fumados_ano * anos).toInt()

    var perda_dias = (((fumados_vida / 10) * 6) / 24)


    println("cigaros fumados por ano:$fumados_ano, cigarros fumados em toda a vida: $fumados_vida")
    println("PERDA DE DIAS FUMANDO: $perda_dias")

    println("Em $idade anos de idade, dos $anos fumando, ${perda_dias / 365} anos e ${perda_dias % 365} dias de sua vida foram perdidos!!!!!!!")

}