

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

    }

    public static String pattern (int n){

        int variable =0;
        String cadena ="";
        if (n<1){
            return cadena;
        }else{
            for (int i = 1; i <=n ; i++) {

                variable++;
            }
        }
        return cadena;
    }



}
