/*
Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */

public class Kata7 {


    public static String invertidorCadena(String s){
        String cadenaNueva="";
        for (int i=s.length()-1;i>=0;i--){
            cadenaNueva+=s.charAt(i);
        }
        
        return cadenaNueva;

    }

}


