import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    void testPass1(){
        fizzbuzzCode fb  =  new fizzbuzzCode();
        assertEquals("Fizz", fb.fizzBuzz(3));
    }

   
}
