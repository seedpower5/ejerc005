package Dibujo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CirculoTest 
{
	 // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
    @Test
    void testVerificarDibujoDentroDelLimite() 
    {
       
        
        // Verificar que la función verificarDibujo devuelve true
        assertTrue(circulo.verificarDibujo(100, 100));
    }
    
    @Test
    void testVerificarDibujoFueraDelLimite() 
    {
        // Crear un círculo fuera de los límites
        Circulo circulo = new Circulo(5, 200, 200);
        
        // Verificar que la función verificarDibujo devuelve false
        assertFalse(circulo.verificarDibujo(100, 100));
    }
    
    @Test
    void testMoverDentroDelLimite() 
    {
        // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
        
        // Mover el círculo dentro de los límites
        circulo.mover(60, 60);
        
        //solo me deja si le quito el private a los atributos
        // Verificar que las coordenadas del círculo han cambiado
        assertEquals(60, circulo.getCentroX());
        assertEquals(60, circulo.getCentroY());
    }
    
    @Test
    void testMoverFueraDelLimite() 
    {
        // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
        
        // Intentar mover el círculo fuera de los límites
        circulo.mover(200, 200);
        
        // Verificar que las coordenadas del círculo no han cambiado
        assertEquals(50, circulo.getCentroX());
        assertEquals(50, circulo.getCentroY());
    }
    
    @Test
    void testCambiarTamanoDentroDelLimite() {
        // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
        
        // Cambiar el tamaño del círculo dentro de los límites
        circulo.cambiarTamano(3);
        
        // Verificar que el tamaño del círculo ha cambiado
        assertEquals(8, circulo.getRadio());
    }
    
    @Test
    void testCambiarTamanoFueraDelLimite() 
    {
        // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
        
        // Intentar cambiar el tamaño del círculo fuera de los límites
        circulo.cambiarTamano(100);
        
        // Verificar que el tamaño del círculo no ha cambiado
        assertEquals(5, circulo.getRadio());
    }
    
    @Test
    void testCrearCirculoDentroDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();
        
        // Crear un círculo dentro de los límites
        Circulo circulo = new Circulo(5, 50, 50);
        
        // Crear el círculo en el lienzo
        circulo.crearCirculo(100, 5, 50, 50, lienzo);
        
        // Verificar que el círculo se agregó al lienzo
        assertEquals(1, lienzo.getFiguras().size());
    }
    
    @Test
    void testCrearCirculoFueraDelLimite() 
    {
        // Crear un lienzo de prueba
        Lienzo lienzo = new Lienzo();
        
        // Crear un círculo fuera de los límites
        Circulo circulo = new Circulo(5, 200, 200);
        
        // Intentar crear el círculo en el lienzo
        circulo.crearCirculo(100, 5, 200, 200, lienzo);
        
        // Verificar que el círculo no se agregó al lienzo
        assertEquals(0, lienzo.getFiguras().size());
    }
}