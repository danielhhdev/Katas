import java.util.ArrayList;
import java.util.List;

public class Kata2 {
/*
El número 89es el primer entero con más de un dígito que cumple
la propiedad parcialmente introducida en el título de este kata.
¿De qué sirve decir "Eureka"? Porque esta suma da el mismo número.
En efecto:89 = 8^1 + 9^2

El siguiente número en tener esta propiedad es 135.

Vuelva a ver esta propiedad:135 = 1^1 + 3^2 + 5^3

Necesitamos una función para recopilar estos números,
que puede recibir dos enteros a, bque define el rango
[a, b](inclusive) y genera una lista de los números ordenados
en el rango que cumple con la propiedad descrita anteriormente.
 */


    public static List<Long> sumDigPow(long a, long b) {
        List<Long> lista = new ArrayList<>();

        for (Long i=a;i<=b;i++){
            String numero= String.valueOf(i);
            Double resultado=0D;

            for (int j=0;j<numero.length();j++){
                int nu= Integer.parseInt(String.valueOf(numero.charAt(j)));
                resultado+=Math.pow(nu,j+1);
            }
            Long resultadoFinal =Math.round(resultado);
            if (i==resultadoFinal){
                lista.add( resultadoFinal);
            }

        }

        return lista;
    }

    public Long calculo(Long x){

        String numero= String.valueOf(x);
        double resultado=0L;

        for (int i=0;i<numero.length();i++){
            int nu= Integer.parseInt(String.valueOf(numero.charAt(i)));
            resultado+= Math.pow(nu,i+1);
        }

        return null;
    }



}
