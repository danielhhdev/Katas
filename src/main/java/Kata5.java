
/*
Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Kata5 {

    public static void main(String[] args) {
        fibonacci(50);

    }

    public static void fibonacci(int numFinal){


        int num1=0;
        int num2=1;
        System.out.print(num1);
        System.out.print(", "+num2);
        for (int i=1;i<=numFinal;i++){
            int suma =num1+num2;
            System.out.print(", "+suma);
            num1=num2;
            num2=suma;
        }
    }

}
