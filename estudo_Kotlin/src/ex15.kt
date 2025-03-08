fun main() {
//    15 - Crie um programa que leia o número de dias trabalhados em um
//            mês e mostre o salário de um funcionário, sabendo que ele trabalha
//    8 horas por dia e ganha R$25 por hora trabalhada.

    println("Quantos dias foram trabalhados?")
    var days: Int = readln().toInt()

    println("O SALARIO DO FUNCIONÁRIO É DÊ: ${(days / 3) * 8 * 25}")
}
