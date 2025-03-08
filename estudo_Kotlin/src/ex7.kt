fun main() {
    //    7 Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro e a sua terça parte.

    println("Coloque um numero: ")
    var numReal: Float = readln().toFloat()
    var dobro: Float = numReal * 2
    var tercaParte: Float = numReal / 3

    println("O numero digitado foi ( $numReal ), o dobro do numero digitado é de ( $dobro ), e a terça parte do numero é ( $tercaParte )")

}
