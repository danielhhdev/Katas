/*
Crea un programa que sea capaz de transformar texto natural a código morse y viceversa.
 * - Debe detectar automáticamente de qué tipo se trata y realizar la conversión.
 * - En morse se soporta raya "—", punto ".", un espacio " " entre letras o símbolos y dos espacios entre palabras "  ".
 * - El alfabeto morse soportado será el mostrado en https://es.wikipedia.org/wiki/Código_morse.
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata8 {
    public static void main(String[] args) {

    }


    public static void codificarAMorse (String s){

        String palabra = s.toUpperCase();
        Map <String, String> mapa = new HashMap<String, String>();
        mapa.put("A",".-"); mapa.put("B","-..."); mapa.put("C","-.-."); mapa.put("CH","----"); mapa.put("D","-..");
        mapa.put("E","."); mapa.put("F","..-."); mapa.put("G","--."); mapa.put("H","...."); mapa.put("I","..");
        mapa.put("J",".---"); mapa.put("K","-.-"); mapa.put("L",".-.."); mapa.put("M","--"); mapa.put("N","-.");
        mapa.put("Ñ","--.--"); mapa.put("O","---"); mapa.put("P",".--."); mapa.put("Q","--.-"); mapa.put("R",".-.");
        mapa.put("S","..."); mapa.put("T","-"); mapa.put("U","..-"); mapa.put("V","...-"); mapa.put("W",".--");
        mapa.put("X","-..-"); mapa.put("Y","-.--"); mapa.put("Z","--..");
        mapa.put("0","-----"); mapa.put("1",".----"); mapa.put("2","..---"); mapa.put("3","...--"); mapa.put("4","....-");
        mapa.put("5","....."); mapa.put("6","-...."); mapa.put("7","--.."); mapa.put("8","---.."); mapa.put("9","----.");
        mapa.put(".",".-.-.-"); mapa.put(",","--..--"); mapa.put("?","..--.."); mapa.put("/","-..-.");


        for(int i = 0;i<palabra.length();i++){
            
        }


    }



}
