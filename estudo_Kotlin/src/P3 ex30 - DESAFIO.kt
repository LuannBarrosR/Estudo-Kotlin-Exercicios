
fun main() {

//    • 30 - [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de
//    mostrar que tipo de triângulo será formado:
//    • EQUILÁTERO: todos os lados iguais
//    • ISÓSCELES: dois lados iguais
//    • ESCALENO: todos os lados diferentes

    println("DIGITE TRÊS MEDIDAS DE RETAS: ")
    println("Reta A: ")
    var A = readln()!!.toInt()
    println("Reta B: ")
    var B = readln()!!.toInt()
    println("Reta C: ")
    var C = readln()!!.toInt()

    if (A + B > C && B + C > A && A + C > B){
        println("É POSSÍVEL FORMAR UM TRIÂNGULO")
        if (A == B && B == C){
            println("UM TRIÂNGULO EQUILÁTERO")
        }
        else if ((A == B && B != C) || (A == C && B != A)){
            println("UM TRIÂNGULO ISÓCELES")
        }
        else{
            println("UM TRIÂNGULO ESCALENO")
        }
    }
    else{
        println("NÃO É POSSÍVEL FORMAR UM TRIÂNGULO")
    }


}