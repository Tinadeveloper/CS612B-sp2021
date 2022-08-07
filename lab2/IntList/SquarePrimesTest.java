package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(14, 15, 16, 17, 18);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("14 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple1() {
        IntList lst = IntList.of(2, 10, 14, 17, 19);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 10 -> 14 -> 289 -> 361", lst.toString());
        assertTrue(changed);
    }

    @Test
    public void testSquarePrimesSimple2() {
        IntList lst = IntList.of(2, 3, 6, 17, 4, 12, 23);
        boolean changed = IntListExercises.squarePrimes(lst);
        assertEquals("4 -> 9 -> 6 -> 289 -> 4 -> 12 -> 529", lst.toString());
        assertTrue(changed);
    }
}
