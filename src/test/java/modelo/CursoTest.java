package modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void testBuscarPorCodigo() {

        Curso curso = new Curso(2);

        Estudiante e1 = new Estudiante(21001, "Juan", 3.0, 3.0);
        Estudiante e2 = new Estudiante(21002, "Ana", 4.0, 4.0);

        curso.agregarEstudiante(e1);
        curso.agregarEstudiante(e2);

        Estudiante encontrado = curso.buscarPorCodigo(21002);

        assertNotNull(encontrado);
        assertEquals("Ana", encontrado.getNombre());
    }
}