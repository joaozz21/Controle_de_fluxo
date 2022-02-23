fun main(){
    print("Digite o 1° número: ")
    val num1 = readLine()!!.toDouble()
    print("Digite o 2° número: ")
    val num2 = readLine()!!.toDouble()
    print("Digite o 3° número: ")
    val num3 = readLine()!!.toDouble()

    if(num1<num2 && num2<num3) {
        print("\nOrdem crescente: $num1,$num2 e $num3")
    }else if(num1<num3 && num3<num2) {
        print("\nOrdem crescente: $num1,$num3 e $num2")
    }else if(num2<num1 && num1<num3) {
        print("\nOrdem crescente: $num2,$num1 e $num3")
    } else if(num2<num3 && num3<num1) {
        print("\nOrdem crescente: $num2,$num3 e $num1")
    }else if(num3<num1 && num1<num2) {
        print("\nOrdem crescente: $num3,$num1 e $num2")
    }else{
        print("\nOrdem crescente: $num3,$num2 e $num1")
    }

}
// Faça um programa que entre com três números e coloque em ordem crescente.
