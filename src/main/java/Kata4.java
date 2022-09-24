
/*
Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
 * Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
 * NO hace falta comprobar que ambas palabras existan.
 * Dos palabras exactamente iguales no son anagrama.
 */

public class Kata4 {

    public static void main(String[] args) {
        System.out.println(isAnagrama("roma", "aMor"));
    }

    public static Boolean isAnagrama (String word1, String word2){

        String newWord ="";
        for (int i=word2.length()-1;i>=0;i--){
            newWord+=word2.charAt(i);
        }

        if (word1.equalsIgnoreCase(newWord)){
            return true;
        }else {
            return false;
        }

    }


}
