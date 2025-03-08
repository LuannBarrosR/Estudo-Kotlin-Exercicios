
fun main() {
//
//    • [DESAFIO] Desenvolva um aplicativo que tenha um procedimento
//            chamado Fibonacci() que recebe um único valor inteiro como
//            parâmetro, indicando quantos termos da sequência serão mostrados
//            na tela. O seu procedimento deve receber esse valor e mostrar a
//            quantidade de elementos solicitados.
//            Obs: Use os exercícios 70 e 75 para te ajudar
//            na solução Ex:
//            Fibonacci(5) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> FIM
//            Fibonacci(9) vai gerar 1 >> 1 >> 2 >> 3 >> 5 >> 8 >> 13 >> 21 >> 34 >> FIM


    println("ESTE PROGRAMA EXIBE A QUANTIDADE DE NUMEROS QUE VOCÊ DESEJAR DA SEQUÊNCIA DE FIBONACCI\n--------------------------------------\n\n")
    var fibonacci = mutableListOf(1, 1)

    println("QUANTOS NUMEROS DA SEQUECIA VOCÊ DESEJA VER? ")
    var quantidade = readln()!!.toInt()

    fun Fibonacci(qtd: Int){
        if (qtd <= 0) {
            println("Por favor, insira um número maior que zero.")
            return
        }

        var elemento1 = 1
        var elemento2 = 1

        print("Sequência de Fibonacci: $elemento1 >> ")

        if (qtd > 1) {
            print("$elemento2 >> ")
        }

        for (i in 3..qtd) {
            val prox_elemento = elemento1 + elemento2
            print("$prox_elemento >> ")
            elemento1 = elemento2
            elemento2 = prox_elemento
        }

        println("FIM")
    }

    Fibonacci(quantidade)



}





