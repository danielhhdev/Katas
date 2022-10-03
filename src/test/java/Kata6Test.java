import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata6Test {

    @Test
    public void testkata6(){
        assertEquals(true,Kata6.esPrimo(2));
        assertEquals(true,Kata6.esPrimo(11));
        assertEquals(false,Kata6.esPrimo(18));
        assertEquals(true,Kata6.esPrimo(97));
        assertEquals(false,Kata6.esPrimo(256));

    }
}
