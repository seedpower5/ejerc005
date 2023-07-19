package Dibujo;

public abstract class Figura 
{
    protected String color = "negro";

    public void cambiarColor(String nuevoColor) 
    {
        color = nuevoColor;
    }

    public abstract boolean verificarDibujo(int maxX, int maxY);

    public abstract void mover(int nuevaX, int nuevaY);

    public abstract void cambiarTamano(int nuevoTamano);

	public String getColor() {
		return color;
	}
	//setters y Getters
	public void setColor(String color) 
	{
		this.color = color;
	}   
}
