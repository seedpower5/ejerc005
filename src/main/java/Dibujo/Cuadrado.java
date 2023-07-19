package Dibujo;

public class Cuadrado extends Figura 
{
    private int puntoX;
    private int puntoY;
    private int lado;
    int maxX=1000000;
	int maxY=1000000;
    public Cuadrado(int puntoX, int puntoY, int lado) 
    {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
        this.lado = lado;
    }

    @Override
    public boolean verificarDibujo(int maxX, int maxY) 
    {
        if(puntoX<maxX&&puntoY<maxY) 
        {
        	return true;
        }else
        return false;
    }

    @Override
    public void mover(int nuevaX, int nuevaY) {
        
		if (verificarDibujo(maxX, maxY)) 
		{
            puntoX = nuevaX;
            puntoY = nuevaY;
        }else
        	return;
    }

    @Override
    public void cambiarTamano(int nuevoTamano) 
    {
    	if(verificarDibujo(maxX, maxY)) 
    	{
    		lado = lado + nuevoTamano;
    	}else
        return;
    }
    //metodo crear cuadrado
    public void crearCuadrado(int puntoX,int puntoY,int lado,Lienzo lienzo) 
    {
    	Cuadrado nuevoCuadrado= new Cuadrado(puntoX,puntoY,lado);
    	if (nuevoCuadrado.verificarDibujo(lienzo.maximoX, lienzo.maximoY)) 
		{
            lienzo.agregarFigura(nuevoCuadrado);
        } else {
            return;
        }
    }
    //Setters y Getters
	public int getPuntoX() {
		return puntoX;
	}

	public void setPuntoX(int puntoX) {
		this.puntoX = puntoX;
	}

	public int getPuntoY() {
		return puntoY;
	}

	public void setPuntoY(int puntoY) {
		this.puntoY = puntoY;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
    
}
