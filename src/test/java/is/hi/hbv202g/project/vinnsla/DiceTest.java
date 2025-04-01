package is.hi.hbv202g.project.vinnsla;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class DiceTest {

    @Test
    public void testDice() {
        Dice dice = new Dice();
        boolean[] expectedNumbers = new boolean[6];
        Arrays.fill(expectedNumbers, false);
        for (int i = 0; i < 100; i++) {
            dice.throwDice();
            try {
                expectedNumbers[dice.getNumber() - 1] = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                assert false;
            }
        }
        assert true;
    }

    @Test
    public void testGetNumber() {
        Dice dice = new Dice();
        dice.throwDice();
        assertEquals("getNumber() should return the same number as getProp()", dice.getNumber(), dice.getProp().get());
    }
}
