package Dibujo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LineaTest 
{
    @Test
    void testVerificarDibujoDentroDelLimite() 
    {
        // Crear una línea dentro de los límites
        Linea linea = new Linea(50, 50, 60, 60);

        // Verificar que la función verificarDibujo devuelve true
        assertTrue(linea.verificarDibujo(100, 100));
    }

    @Test
    void testVerificarDibujoFueraDelLimite() 
    {
        // Crear una línea fuera de los límites
        Linea linea = new Linea(200, 200, 210, 210);

        // Verificar que la función verificarDibujo devuelve false
        assertFalse(linea.verificarDibujo(100, 100));
    }

    @Test
    void testMoverDentroDelLimite() 
    {
        // Crear una línea dentro de los límites
        Linea linea = new Linea(50, 50, 60, 60);

        // Mover la línea dentro de los límites
        linea.mover(70, 70);

        // Verificar que las coordenadas de la línea han cambiado
        assertEquals(70, linea.getPuntoOrigenX());
        assertEquals(70, linea.getPuntoOrigenY());
        assertEquals(80, linea.getPuntoFinalX());
        assertEquals(80, linea.getPuntoFinalY());
    }

    @Test
    void testMoverFueraDelLimite() 
    {
        // Crear una línea dentro de los límites
        Linea linea = new Linea(50, 50, 60, 60);

        // Intentar mover la línea fuera de los límites
        linea.mover(200, 200);

        // Verificar que las coordenadas de la línea no han cambiado
        assertEquals(50, linea.getPuntoOrigenX());
        assertEquals(50, linea.getPuntoOrigenY());
        assertEquals(60, linea.getPuntoFinalX());
        assertEquals(60, linea.getPuntoFinalY());
    }

    @Test
    void testCambiarTamano() 
    {
        // Crear una línea dentro de los límites
        Linea linea = new Linea(50, 50, 60, 60);

        // Intentar cambiar el tamaño de la línea (este método no debería hacer nada)
        linea.cambiarTamano(5);

        // Verificar que las coordenadas de la línea no han cambiado
        assertEquals(50, linea.getPuntoOrigenX());
        assertEquals(50, linea.getPuntoOrigenY());
        assertEquals(60, linea.getPuntoFinalX());
        assertEquals(60, linea.getPuntoFinalY());
    }

    @Test
    void testCrearLineaDentroDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear una línea dentro de los límites
        Linea linea = new Linea(50, 50, 60, 60);

        // Crear la línea en el lienzo
        linea.crearLinea(70, 70, 80, 80, lienzo);

        // Verificar que la línea se agregó al lienzo
        assertEquals(1, lienzo.getFiguras().size());
    }

    @Test
    void testCrearLineaFueraDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

        // Crear una línea fuera de los límites
        Linea linea = new Linea(200, 200, 210, 210);

        // Intentar crear la línea en el lienzo
        linea.crearLinea(200, 200, 210, 210, lienzo);

        // Verificar que la línea no se agregó al lienzo
        assertEquals(0, lienzo.getFiguras().size());
    }
}
