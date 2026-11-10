package service;

import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import static org.junit.Assert.*;

public class RubberPigTest {

    private AngryBird bird; // referenciación
    private ByteArrayOutputStream out;

    @Before
    public void before() {
        bird = new RubberPig(new OinkSound()); // instanciación
        out = new ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
    }

    @Test
    public void testLaunch() {
        bird.launch();
        boolean esperado = true;
        boolean obtenido = out.toString().toLowerCase().contains("lanzando");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testMakeSound() {
        bird.makeSound();
        boolean esperado = true;
        boolean obtenido = out.toString().toLowerCase().contains("oink");
        assertEquals(esperado, obtenido);
    }

    @Test
    public void testToString() {
        String esperado = "RubberPig";
        String obtenido = bird.toString();
        assertEquals(esperado, obtenido);
    }
}