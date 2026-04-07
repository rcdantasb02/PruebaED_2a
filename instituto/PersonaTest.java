package instituto;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    void testConstruccionYEdad() {
        // Creamos una persona nacida el 1 de enero de 2000
        Persona p = new Persona(12345678, "Juan Perez", 'H', 1, 1, 2000);

        // Comprobamos que el NIF se ha creado bien (la letra de 12345678 es Z)
        assertEquals("12345678-Z", p.getNif().toString());

        // Calculamos la edad esperada restando su año de nacimiento al año actual
        int edadEsperada = LocalDate.now().getYear() - 2000;

        // Comprobamos que el método getEdad() devuelve lo correcto
        assertEquals(edadEsperada, p.getEdad());
    }
}