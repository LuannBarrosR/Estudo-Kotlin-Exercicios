fun main() {
    //    9 Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//    e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou cotação atual)

    print("INFORME QUANTO DE DINHEIRO VOCê POSSUI: ")
    var saldo: Float = readln().toFloat()

    var dolar: Float = (saldo / 3.45.toFloat()).toFloat()

    println("O SALDO QUE VOCÊ TERÁ EM DOLAR É DE: $dolar")

}
