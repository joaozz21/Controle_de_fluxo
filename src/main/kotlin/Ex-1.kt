fun main(){
    print("Digite o 1° número inteiro: ")
    val num1 = readLine()!!.toInt()
    print("Digite o 2° número inteiro: ")
    val num2 = readLine()!!.toInt()
    print("Digite o 3° número inteiro: ")
    val num3 = readLine()!!.toInt()

    if(num1>num2 && num1>num3) {
        println("\nO 1° número é o maior!")
    } else if(num2>num1 && num2>num3) {
        println("\nO 2° número é o maior!")
    } else if(num3>num1 && num3>num2) {
        println("\nO 3° número é o maior!")
    } else {
        println("\nNão existe um maior!")
    }
}
//Faça um programa que receba três inteiros e diga qual deles é o maior.