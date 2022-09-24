
/*
Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Kata5 {

    public static void main(String[] args) {
        

    }

    public static void fibonacci(){


        int num1=numInicio+1;
        int num2=0;
        System.out.println(numInicio);
        for (int i=numInicio+1;i<=numFinal;i++){
            System.out.println(", "+num1);
        }
    }

}
