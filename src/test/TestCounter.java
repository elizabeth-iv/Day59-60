package test;

import main.Counter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCounter {

    Counter counter = new Counter();

    @Test
    void testValue() {
        assertEquals(0, counter.value());
    }

    @Test
    void testIncrease() {
        counter.increase();
        assertEquals(1, counter.value());
    }

}
