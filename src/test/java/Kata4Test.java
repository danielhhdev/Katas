import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Kata4Test {
    @Test
    public void testkata4(){
        assertEquals(true,Kata4.isAnagrama("roma","amor"));
        assertEquals(false,Kata4.isAnagrama("hola","alho"));
        assertEquals(true,Kata4.isAnagrama("pela","AlEp"));

    }

}
