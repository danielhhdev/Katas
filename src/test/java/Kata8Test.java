import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata8Test {

    @Test
    public void testkata8(){
        assertEquals("... --- ... ",Kata8.codificarAMorse("SOS"));
        assertEquals(".... --- .-.. .- ",Kata8.codificarAMorse("Hola"));

    }
}
