
fun main() {

//    25 - [DESAFIO] Crie um programa que leia o tamanho de três segmentos
//    de reta. Analise seus comprimentos e diga se é possível formar um
//    triângulo com essas retas. Matematicamente, para três segmentos
//    formarem um triângulo, o comprimento de cada lado deve ser menor
//    que a soma dos outros dois.

    println("DIGITE TRÊS MEDIDAS DE RETAS: ")
    println("Reta A: ")
    var A = readln()!!.toInt()
    println("Reta B: ")
    var B = readln()!!.toInt()
    println("Reta C: ")
    var C = readln()!!.toInt()

    if (A + B > C && B + C > A && A + C > B){
        println("É POSSÍVEL FORMAR UM TRIÂNGULO")
    }
    else{
        println("NÃO É POSSÍVEL FOR MAR UM TRIÂNGULO")
    }

}