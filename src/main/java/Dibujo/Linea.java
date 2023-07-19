package Dibujo;

public class Linea extends Figura 
{
    private int puntoOrigenX;
    private int puntoOrigenY;
    private int puntoFinalX;
    private int puntoFinalY;
    int maxX=1000000;
   	int maxY=1000000;

    public Linea(int puntoOrigenX, int puntoOrigenY, int puntoFinalX, int puntoFinalY) 
    {
        this.puntoOrigenX = puntoOrigenX;
        this.puntoOrigenY = puntoOrigenY;
        this.puntoFinalX = puntoFinalX;
        this.puntoFinalY = puntoFinalY;
    }

    @Override
    public boolean verificarDibujo(int maxX, int maxY) 
    {
        if(puntoOrigenX<maxX&&puntoOrigenY<maxY||puntoFinalX<maxX&&puntoFinalY<maxY) 
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
        int deltaX = nuevaX - puntoOrigenX;
        int deltaY = nuevaY - puntoOrigenY;
        puntoOrigenX = nuevaX;
        puntoOrigenY = nuevaY;
        puntoFinalX += deltaX;
        puntoFinalY += deltaY;
		}else
			return;
    }

	@Override
	public void cambiarTamano(int nuevoTamano) 
	{
		return;	
	}
	//metodo para crear Linea
	public void crearLinea(int puntoOrigenX,int puntoOrigenY,int puntoFinalX,int puntoFinalY,Lienzo lienzo) 
	{
		Linea nuevaLinea= new Linea(puntoOrigenX,puntoOrigenY,puntoFinalX,puntoFinalY);
		if (nuevaLinea.verificarDibujo(lienzo.maximoX, lienzo.maximoY)) 
		{
            lienzo.agregarFigura(nuevaLinea);
        } else {
            return;
        }
	}
	//Setters y Getters
	public int getPuntoOrigenX() 
	{
		return puntoOrigenX;
	}

	public void setPuntoOrigenX(int puntoOrigenX) 
	{
		this.puntoOrigenX = puntoOrigenX;
	}

	public int getPuntoOrigenY() 
	{
		return puntoOrigenY;
	}

	public void setPuntoOrigenY(int puntoOrigenY) 
	{
		this.puntoOrigenY = puntoOrigenY;
	}

	public int getPuntoFinalX() 
	{
		return puntoFinalX;
	}

	public void setPuntoFinalX(int puntoFinalX) 
	{
		this.puntoFinalX = puntoFinalX;
	}

	public int getPuntoFinalY() 
	{
		return puntoFinalY;
	}

	public void setPuntoFinalY(int puntoFinalY) 
	{
		this.puntoFinalY = puntoFinalY;
	}
}
