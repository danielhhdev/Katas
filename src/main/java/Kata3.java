
/*

Implemente la función que toma una matriz que contiene los nombres de las personas a las que les gusta un artículo.
Debe devolver el texto de la pantalla como se muestra en los ejemplos:

[]                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
 */
public class Kata3 {

    public static String whoLikesIt(String... names) {

        int contador= names.length-2;

        if(names.length==1) return names[0]+" likes this";

        if(names.length==2) return names[0]+" and "+ names[1]+ " like this";

        if(names.length==3) return names[0]+", "+names[1]+" and "+ names[2]+ " like this";

        if(names.length>3) return names[0]+", "+ names[1]+ " and "+contador+" others like this";

        return "no one likes this";


    }


}
