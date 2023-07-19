package Dibujo;

public class Circulo extends Figura 
{
    private int radio;
    private int centroX;
    private int centroY;
    int maxX=1000000;
	int maxY=1000000;
	
    public Circulo( int radio, int centroX, int centroY) 
    {
        this.radio = radio;
        this.centroX = centroX;
        this.centroY = centroY;
    }

    @Override
    public boolean verificarDibujo(int maxX, int maxY) 
    {
        if(centroX<maxX&&centroY<maxY) 
        {
        	return true;
        }else
        	return false;
    }

    @Override
    public void mover(int nuevaX, int nuevaY) 
    {
    	if (verificarDibujo(maxX, maxY)) 
		{
 
        centroX = nuevaX;
        centroY = nuevaY;
		}else
			return;
    }

    @Override
    public void cambiarTamano(int nuevoTamano) 
    {
    	if (verificarDibujo(maxX, maxY)) 
		{
        radio = radio + nuevoTamano; 
		}else
			return;
    }
    
    //metodo para crear el circulo
    public void crearCirculo(int radioX, int radio, int centroX, int centroY, Lienzo lienzo) 
    {
        Circulo nuevoCirculo = new Circulo(radio, centroX, centroY);
        if (nuevoCirculo.verificarDibujo(lienzo.maximoX, lienzo.maximoY)) {
            lienzo.agregarFigura(nuevoCirculo);
        } else {
            return;
        }
    }
    
    //Getters y Setters
	public int getRadio() 
	{
		return radio;
	}

	public void setRadio(int radio) 
	{
		this.radio = radio;
	}

	public int getCentroX() 
	{
		return centroX;
	}

	public void setCentroX(int centroX) 
	{
		this.centroX = centroX;
	}

	public int getCentroY() 
	{
		return centroY;
	}

	public void setCentroY(int centroY) 
	{
		this.centroY = centroY;
	}
}
