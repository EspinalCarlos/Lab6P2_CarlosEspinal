
package lab6p2_carlosespinal;

import java.awt.Color;

public class Objetos {
    protected Color color;
    protected String Descripcion;
    protected String Marca;
    protected String Size;
    protected String Calidad;
    protected Persona PIngreso;

    public Objetos() {
    }

    public Objetos(Color color, String Descripcion, String Marca, String Size, String Calidad, Persona PIngreso) {
        this.color = color;
        this.Descripcion = Descripcion;
        this.Marca = Marca;
        this.Size = Size;
        this.Calidad = Calidad;
        this.PIngreso = PIngreso;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String Calidad) {
        this.Calidad = Calidad;
    }

    public Persona getPIngreso() {
        return PIngreso;
    }

    public void setPIngreso(Persona PIngreso) {
        this.PIngreso = PIngreso;
    }

    @Override
    public String toString() {
        return "Objetos{" + "color=" + color + ", Descripcion=" + Descripcion + ", Marca=" + Marca + ", Size=" + Size + ", Calidad=" + Calidad + ", PIngreso=" + PIngreso + '}';
    }
    
    
    
    
}
