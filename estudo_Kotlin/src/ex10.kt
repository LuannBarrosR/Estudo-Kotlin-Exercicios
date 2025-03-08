fun main() {
//    10 Faça um algoritmo que leia a largura e altura de uma parede,
//    calcule e mostre a área a ser pintada e a quantidade de tinta
//    necessária para o serviço, sabendo que cada litro de tinta pinta
//    uma área de 2metros quadrados.

    print("DIGITE A LARGURA DA PAREDE: ")
    var largura: Float = readln().toFloat()

    print("DIGITE A ALTURA DA PAREDE: ")
    var altura: Float = readln().toFloat()

    var area: Float = (largura * altura).toFloat()

    var Ltinta: Float = (area / 2).toFloat()

    println("A ÁREA A SER PINTADA É DÊ: $area E A QUANTIDADE DE TINTA NECESSÁRIA SERÁ DÊ: ${String.format("%.0f",Ltinta)}")



}
