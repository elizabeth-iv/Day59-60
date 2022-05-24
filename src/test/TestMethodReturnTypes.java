package test;

import main.MethodReturnTypes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMethodReturnTypes {

    @Test
    public void testString() {
        assertEquals("I love papaya", MethodReturnTypes.WordsNStuff());
    }

    @Test
    public void testInt() {
        assertEquals(5, MethodReturnTypes.Integer());
    }

    @Test
    public void testBoolean() {
        assertFalse(MethodReturnTypes.TrueOrFalse());
    }

}