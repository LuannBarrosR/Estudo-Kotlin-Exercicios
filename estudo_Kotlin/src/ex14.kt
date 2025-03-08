fun main() {
//    14 A locadora de carros precisa da sua ajuda para cobrar seus
//            serviços. Escreva um programa que pergunte a quantidade de Km
//    percorridos por um carro alugado e a quantidade de dias pelos quais
//            ele foi alugado. Calcule o preço total a pagar, sabendo que o carro
//    custa R$90 por dia e R$0,20 por Km rodado.

    println("Quantos dias foi alugado o carro?")
    var dias: Int = readln().toInt()

    println("Quantos KM foi percorrido?")
    var kms: Float = readln().toFloat()

    print("O PREÇO TOTAL A SER PAGO É DÊ: ${dias * 90 + kms * 0.20}")

}
