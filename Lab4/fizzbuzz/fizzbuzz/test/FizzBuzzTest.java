import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    
    @Test
    void testPass1(){
        fizzbuzzCode fb  =  new fizzbuzzCode();
        assertEquals("Fizz", fb.fizzBuzz(3));
    }

    @Test
    void testPass2(){
        fizzbuzzCode fb  =  new fizzbuzzCode();
        assertEquals("Buzz", fb.fizzBuzz(5));
    }

    @Test
    void testPass3(){
        fizzbuzzCode fb  =  new fizzbuzzCode();
        assertEquals("FizzBuzz", fb.fizzBuzz(15));
    }

    @Test
    void testFail1(){
        fizzbuzzCode fb  =  new fizzbuzzCode();
        assertEquals("Fizz", fb.fizzBuzz(5));
    }

    

   
}
