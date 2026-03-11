package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstudianteTest {

    @Test
    public void testCalcularDefinitiva() {

        Estudiante e = new Estudiante(21001, "Juan", 4.0, 3.0);

        double definitiva = e.calcularDefinitiva();

        assertEquals(3.55, definitiva, 0.01);
    }

    @Test
    public void testAprobar() {

        Estudiante e = new Estudiante(21001, "Ana", 4.0, 4.0);

        assertEquals("SI APRUEBA", e.aprobar());
    }

    @Test
    public void testIncrementarDesarrollo() {

        Estudiante e = new Estudiante(21001, "Luis", 3.0, 3.0);

        e.incrementarDesarrollo(0.5);

        assertEquals(3.5, e.getNotaDesarrollo(), 0.01);
    }

    @Test
    public void testModificarNota() {

        Estudiante e = new Estudiante(21001, "Maria", 2.0, 2.0);

        e.modificarNota(4.0, 4.5);

        assertEquals(4.0, e.getNotaDesarrollo(), 0.01);
        assertEquals(4.5, e.getNotaMatematica(), 0.01);
    }
}