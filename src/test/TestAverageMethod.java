package test;


import main.AverageMethod;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestAverageMethod {


    @Test
    public void testSum() {
        assertEquals(8, AverageMethod.sum(4,2,2));
    }

    @Test
    public void testAverage() {
        assertEquals(4, AverageMethod.average(AverageMethod.sum(4,4,4)));
    }
}

