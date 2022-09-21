import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Kata3Test {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", Kata3.whoLikesIt());
        assertEquals("Peter likes this", Kata3.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Kata3.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Kata3.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", Kata3.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }

}
