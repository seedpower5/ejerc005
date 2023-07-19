package Dibujo;

 

public class Punto extends Figura 
{
    private int puntoX;
    private int puntoY;
    int maxX=1000000;
   	int maxY=1000000;

    public Punto(int puntoX, int puntoY) 
    {
        this.puntoX = puntoX;
        this.puntoY = puntoY;
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
    public void mover(int nuevaX, int nuevaY) 
    {
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
		return;
	}
	//metodo para crear punto
	public void crearPunto(int puntoX,int puntoY,Lienzo lienzo) 
	{
		Punto nuevoPunto= new Punto(puntoX,puntoY);
		if (nuevoPunto.verificarDibujo(lienzo.maximoX, lienzo.maximoY)) 
		{
            lienzo.agregarFigura(nuevoPunto);
        } else {
            return;
        }
	}
	//Setters y Getters
	
	public int getPuntoX() 
	{
		return puntoX;
	}

	public void setPuntoX(int puntoX) 
	{
		this.puntoX = puntoX;
	}

	public int getPuntoY() 
	{
		return puntoY;
	}

	public void setPuntoY(int puntoY) 
	{
		this.puntoY = puntoY;
	}
}

