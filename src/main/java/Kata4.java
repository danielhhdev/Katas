
/*
Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

public class Kata4 {

    public static Boolean isAnagrama (String word1, String word2){

        StringBuilder newWord= new StringBuilder("");
        word2.toLowerCase();
        for (int i=word2.length();i>=0;i--){
            newWord.append(word2.charAt(i));
        }

        if (word1.toLowerCase().equals(newWord)){
            return true;
        }else {
            return false;
        }

    }


}
