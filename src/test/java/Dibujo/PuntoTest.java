package Dibujo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PuntoTest 
{
    @Test
    void testVerificarDibujoDentroDelLimite() 
    {
        // Crear un punto dentro de los límites
        Punto punto = new Punto(50, 50);

        // Verificar que la función verificarDibujo devuelve true
        assertTrue(punto.verificarDibujo(100, 100));
    }

    @Test
    void testVerificarDibujoFueraDelLimite() 
    {
        // Crear un punto fuera de los límites
        Punto punto = new Punto(200, 200);

        // Verificar que la función verificarDibujo devuelve false
        assertFalse(punto.verificarDibujo(100, 100));
    }

    @Test
    void testMoverDentroDelLimite() 
    {
        // Crear un punto dentro de los límites
        Punto punto = new Punto(50, 50);

        // Mover el punto dentro de los límites
        punto.mover(60, 60);

        // Verificar que las coordenadas del punto han cambiado
        assertEquals(60, punto.getPuntoX());
        assertEquals(60, punto.getPuntoY());
    }

    @Test
    void testMoverFueraDelLimite() 
    {
        // Crear un punto dentro de los límites
        Punto punto = new Punto(50, 50);

        // Intentar mover el punto fuera de los límites
        punto.mover(200, 200);

        // Verificar que las coordenadas del punto no han cambiado
        assertEquals(50, punto.getPuntoX());
        assertEquals(50, punto.getPuntoY());
    }

    @Test
    void testCambiarTamano() 
    {
        // Crear un punto dentro de los límites
        Punto punto = new Punto(50, 50);

        // Intentar cambiar el tamaño del punto (este método no debería hacer nada)
        punto.cambiarTamano(5);

        // Verificar que las coordenadas del punto no han cambiado
        assertEquals(50, punto.getPuntoX());
        assertEquals(50, punto.getPuntoY());
    }

    @Test
    void testCrearPuntoDentroDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear un punto dentro de los límites
        Punto punto = new Punto(50, 50);

        // Crear el punto en el lienzo
        punto.crearPunto(60, 60, lienzo);

        // Verificar que el punto se agregó al lienzo
        assertEquals(1, lienzo.getFiguras().size());
    }
    @Test
    void testCrearPuntoFueraDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear un punto fuera de los límites
        Punto punto = new Punto(200, 200);
        punto.crearPunto(200, 200, lienzo);

        // Verificar que el punto no se agregó al lienzo
        assertEquals(0, lienzo.getFiguras().size());
    }
}
