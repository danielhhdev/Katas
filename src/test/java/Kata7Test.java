import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata7Test {

    @Test
    public void testkata7(){
        assertEquals("odnum aloH",Kata7.invertidorCadena("Hola mundo"));
        assertEquals("leinad",Kata7.invertidorCadena("daniel"));

    }
}
