package instituto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    void aniadirAlumnoYToString() {
        Curso curso = new Curso("Programacion");
        Persona p1 = new Persona(11111111, "Ana Gomez", 'M', 10, 5, 2005);

        // Añadimos el alumno
        curso.aniadirAlumno(p1);

        // Como la lista de alumnos es privada, la forma de comprobar
        // que se añadió correctamente es viendo si su nombre aparece al imprimir el curso
        String resultadoImpresion = curso.toString();

        // Comprobamos que el texto contiene el nombre "Ana"
        assertTrue(resultadoImpresion.contains("Ana"));
    }
}