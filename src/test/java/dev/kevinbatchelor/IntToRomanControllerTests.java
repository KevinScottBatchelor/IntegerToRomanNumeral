package dev.kevinbatchelor;

import dev.kevinbatchelor.controller.IntToRomanController;
import dev.kevinbatchelor.exception.InvalidIntegerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntToRomanControllerTests {
    @Test
    public void intIsZero_ExpectNulla() {

        int integer = 0;

        IntToRomanController test = new IntToRomanController();

        assertEquals("You entered " + integer + " which is nulla (The term for zero used by the Romans!)",
                    test.getRomanNumeralFromInteger(integer));

    }

    @Test
    public void intIsFive_ExpectV() {

        int integer = 5;

        IntToRomanController test = new IntToRomanController();

        assertEquals("You entered " + integer + ", which is expressed as the roman numeral: V",
                    test.getRomanNumeralFromInteger(integer));

    }

    @Test
    public void negativeInteger_ExpectedThrowsInvalidIntegerException() {

        IntToRomanController test = new IntToRomanController();

        int integer = -1;

        Throwable exception = assertThrows(InvalidIntegerException.class, () -> test.getRomanNumeralFromInteger(integer));
        assertNull(null, exception.getMessage());
    }

    @Test
    public void integerEqualToOrGreaterThanFourThousand_ExpectedThrowsInvalidIntegerException() {

        IntToRomanController test = new IntToRomanController();

        int integer = 4000;

        Throwable exception = assertThrows(InvalidIntegerException.class, () -> test.getRomanNumeralFromInteger(integer));
        assertNull(null, exception.getMessage());
    }
}
