package test;

import main.Animal;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    Animal animal = new Animal("Simba", true);

    @Test
    public void testGetAnimalName() {
        assertEquals("Simba", animal.getAnimalName());
    }

    @Test
    public void testGetIsItADog() {
        assertTrue(animal.getisItADog());
    }
}

