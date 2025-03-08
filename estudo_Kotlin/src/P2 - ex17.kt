
fun main() {

//    17 -  Escreva um programa que pergunte a velocidade de um carro.
//    Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//    foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
//    cada Km acima da velocidade permitida.

    println("Qual a velocidade do carro? : ")
    var velocidade_carro = readln()!!.toInt()

    if (velocidade_carro > 80){
        var multa = velocidade_carro - 80
        println("A VELOCIDADE PERMITIDA NA VIA É DÊ 80KM/H \n VOCÊ PASSOU À $velocidade_carro. \n A MULTA RECEBIDA É DÊ: ${multa * 5} REAIS")
    }
    else{
        println("VELOCIDADE PERMITIDA NA VIA \n $velocidade_carro km/h")
    }
}