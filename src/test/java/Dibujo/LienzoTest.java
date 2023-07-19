package Dibujo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LienzoTest 
{
    @Test
    void testAgregarFigura() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();

     
        Figura figura = new Punto(50, 50);
        lienzo.agregarFigura(figura);

       
        assertEquals(1, lienzo.getFiguras().size());
        assertTrue(lienzo.getFiguras().contains(figura));
    }

    @Test
    void testEliminarLienzo() 
    {
        // Crear un lienzo de prueba con una figura
        Lienzo lienzo = new Lienzo();
        Figura figura = new Punto(50, 50);
        lienzo.agregarFigura(figura);

        
        lienzo.eliminarLienzo();

       
        assertEquals(0, lienzo.getFiguras().size());
    }

    @Test
    void testGuardarLienzo() 
    {
    	
    }
}
