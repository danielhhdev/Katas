

/*
Debe escribir una función patternque devuelva el siguiente patrón
(consulte Patrón y ejemplos) hasta nel número de filas.
patrón (5):

    1
    22
    333
    4444
    55555
 */
public class Kata1 {
    public static void main(String[] args) {

        System.out.println(pattern(1));

    }

    public static String pattern (int n){
        String cadena ="";
        if (n<1){
            return cadena;
        }
        if (n==1){
            return "1";
        }
        cadena+="1";
        for (int i = 2; i <=n ; i++) {
            String variable = String.valueOf(i);
            cadena +="\n"+variable.repeat(i);
        }

        return cadena;
    }



}
