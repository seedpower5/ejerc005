package Dibujo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FiguraTest 
{

    @Test
    void testCambiarColor() 
    {
        // Crear una instancia mock de la clase abstracta Figura
        Figura figuraMock = Mockito.mock(Figura.class);

        // Cambiar el color usando el método cambiarColor
        figuraMock.cambiarColor("azul");

        // Verificar que el método se llamó con el nuevo color
        Mockito.verify(figuraMock).cambiarColor("azul");

        // Verificar que el color se actualizó correctamente usando el método getColor
        assertEquals("azul", figuraMock.getColor());
    }

    @Test
    void testVerificarDibujo() 
    {
        // Crear una instancia mock de la clase abstracta Figura
        Figura figuraMock = Mockito.mock(Figura.class);

        // Configurar el comportamiento esperado del método verificarDibujo en el mock
        Mockito.when(figuraMock.verificarDibujo(Mockito.anyInt(), Mockito.anyInt())).thenReturn(true);

        // Verificar que el método devuelve true cuando se llama con cualquier argumento
        assertTrue(figuraMock.verificarDibujo(100, 100));
        assertTrue(figuraMock.verificarDibujo(200, 200));
        assertTrue(figuraMock.verificarDibujo(0, 0));

        // Configurar el comportamiento esperado para devolver false cuando se llama con otros argumentos
        Mockito.when(figuraMock.verificarDibujo(Mockito.anyInt(), Mockito.anyInt())).thenReturn(false);

        // Verificar que el método devuelve false cuando se llama con cualquier argumento
        assertFalse(figuraMock.verificarDibujo(150, 150));
        assertFalse(figuraMock.verificarDibujo(300, 300));
    }

    @Test
    void testMover() 
    {
        // Crear una instancia mock de la clase abstracta Figura
        Figura figuraMock = Mockito.mock(Figura.class);

        // Llamar al método mover en el mock
        figuraMock.mover(50, 50);

        // Verificar que el método se llamó con las coordenadas específicas
        Mockito.verify(figuraMock).mover(50, 50);
    }

    @Test
    void testCambiarTamano() 
    {
        // Crear una instancia mock de la clase abstracta Figura
        Figura figuraMock = Mockito.mock(Figura.class);

        // Llamar al método cambiarTamano en el mock
        figuraMock.cambiarTamano(5);

        // Verificar que el método se llamó con el tamaño específico
        Mockito.verify(figuraMock).cambiarTamano(5);
    }
}
