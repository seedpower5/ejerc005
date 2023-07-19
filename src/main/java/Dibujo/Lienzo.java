package Dibujo;
import java.util.ArrayList;

public class Lienzo 
{
    final int maximoX = 1000000;
    final int maximoY = 1000000;
    private ArrayList<Figura> figuras;

    public Lienzo() 
    {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura figura) 
    {
        figuras.add(figura);
    }

    // Método para eliminar Lienzo
    public void eliminarLienzo() 
    {
        figuras.clear();
    }

    // Método para guardar Lienzo
    public void guardarLienzo() 
    {
        // Código para guardar el lienzo con gestor de ficheros¿?
    }
    
    //Setters y Getters
	public ArrayList<Figura> getFiguras() 
	{
		return figuras;
	}
	public void setFiguras(ArrayList<Figura> figuras) 
	{
		this.figuras = figuras;
	}
	public int getMaximoX() 
	{
		return maximoX;
	}
	public int getMaximoY() 
	{
		return maximoY;
	}
}
