fun main() {
    //    5 - Faça um programa em Kotlin que leia as duas notas de um aluno em uma matéria mostre na tela a sua média na disciplina.

    print("Digite a primeira nota do aluno:")
    var nota1: Float = readln().toFloat()
    print("Digite a segunda nota do aluno:")
    var nota2: Float = readln().toFloat()

    println("A média desse aluno com as notas $nota1 e $nota2 é: ${(nota1 + nota2) / 2}")


}
