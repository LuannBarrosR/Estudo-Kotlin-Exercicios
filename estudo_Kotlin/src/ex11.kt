import kotlin.math.pow

fun main() {

//    11 Desenvolva uma lógica que leia os valores de A, B e C de
//    uma equação do segundo grau e mostre o valor de Delta.



    print("DIGITE O VALOR DE A: ")
    var a: Float = readln().toFloat()

    print("DIGITE O VALOR DE B: ")
    var b: Float = readln().toFloat()

    print("DIGITE O VALOR DE C: ")
    var c: Float = readln().toFloat()

    var delta: Float = (b.pow(2) - 4*a*c).toFloat()

    print("$delta ESTE É O VALOR")


}
