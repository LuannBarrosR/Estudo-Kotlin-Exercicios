fun main() {
//    8 Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os valores relativos em outras medidas.

    print("A distância em metros: ")
    var distanciaM: Float = readln().toFloat()

    var distanciaCM: Float = distanciaM * 100
    var distanciaKM: Float = distanciaM / 1000
    var distanciaMM: Float = distanciaM * 1000

    println("Digite o numero conforme o menu: ")
    println(" 1. Converter para centimetros. \n 2. Converter para Quilometros. \n 3. converter para Milimetros")
    var escolha: Int = readln().toInt()

    if (escolha == 1){
        print("$distanciaCM centimetros")
    }
    else if (escolha == 2){
        print("$distanciaKM quilometros")
    }
    else if (escolha == 3){
        print("$distanciaMM Milimetros")
    }
    else{
        print("escolha incorreta!")
    }

}
