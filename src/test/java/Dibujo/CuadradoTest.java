package Dibujo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CuadradoTest {

    @Test
    void testVerificarDibujoDentroDelLimite() 
    {
        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Verificar que la función verificarDibujo devuelve true
        assertTrue(cuadrado.verificarDibujo(100, 100));
    }

    @Test
    void testVerificarDibujoFueraDelLimite() 
    {
        // Crear un cuadrado fuera de los límites
        Cuadrado cuadrado = new Cuadrado(200, 200, 10);

        // Verificar que la función verificarDibujo devuelve false
        assertFalse(cuadrado.verificarDibujo(100, 100));
    }

    @Test
    void testMoverDentroDelLimite() 
    {
        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Mover el cuadrado dentro de los límites
        cuadrado.mover(60, 60);

        // Verificar que las coordenadas del cuadrado han cambiado
        assertEquals(60, cuadrado.getPuntoX());
        assertEquals(60, cuadrado.getPuntoY());
    }

    @Test
    void testMoverFueraDelLimite() 
    {
        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Intentar mover el cuadrado fuera de los límites
        cuadrado.mover(200, 200);

        // Verificar que las coordenadas del cuadrado no han cambiado
        assertEquals(50, cuadrado.getPuntoX());
        assertEquals(50, cuadrado.getPuntoY());
    }

    @Test
    void testCambiarTamanoDentroDelLimite() 
    {
        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Cambiar el tamaño del cuadrado dentro de los límites
        cuadrado.cambiarTamano(5);

        // Verificar que el tamaño del cuadrado ha cambiado
        assertEquals(15, cuadrado.getLado());
    }

    @Test
    void testCambiarTamanoFueraDelLimite() 
    {
        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Intentar cambiar el tamaño del cuadrado fuera de los límites
        cuadrado.cambiarTamano(100);

        // Verificar que el tamaño del cuadrado no ha cambiado
        assertEquals(10, cuadrado.getLado());
    }

    @Test
    void testCrearCuadradoDentroDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear un cuadrado dentro de los límites
        Cuadrado cuadrado = new Cuadrado(50, 50, 10);

        // Crear el cuadrado en el lienzo
        cuadrado.crearCuadrado(100, 50, 10, lienzo);

        // Verificar que el cuadrado se agregó al lienzo
        assertEquals(1, lienzo.getFiguras().size());
    }

    @Test
    void testCrearCuadradoFueraDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear un cuadrado fuera de los límites
        Cuadrado cuadrado = new Cuadrado(200, 200, 10);

        // Intentar crear el cuadrado en el lienzo
        cuadrado.crearCuadrado(100, 200, 10, lienzo);

        // Verificar que el cuadrado no se agregó al lienzo
        assertEquals(0, lienzo.getFiguras().size());
    }
}