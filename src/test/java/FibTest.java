import static org.junit.Assert.*;

public class FibTest {

    @org.junit.Test
    public void fibBase0() {
        assertEquals(1, Fib.fib(0));
    }

    @org.junit.Test
    public void fibBase1() {
        assertEquals(1, Fib.fib(1));
    }
}