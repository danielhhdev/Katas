
/*
Enunciado: Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Kata6 {

    public static void main(String[] args) {
        for(int i =1; i<100;i++){
            if(esPrimo(i)) System.out.println(i);
        }
    }

    public static boolean esPrimo(int a){
        if(a==2) return true;
        //eliminamos a los pare
        if(a%2==0) return false;
        //comprobamos los impares
        for(int i=3;i<a;i+=2){
            if(a%i==0) return false;
        }
        return true;
    }




}
