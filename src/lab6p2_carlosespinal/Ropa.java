
package lab6p2_carlosespinal;

import java.awt.Color;


public class Ropa extends Objetos{
    private char Talla;
    private String Telatype;
    private String Pais;

    public Ropa() {
        super();
    }

    public Ropa(char Talla, String Telatype, String Pais, Color color, String Descripcion, String Marca, String Size, String Calidad, Persona PIngreso) {
        super(color, Descripcion, Marca, Size, Calidad, PIngreso);
        this.Talla = Talla;
        this.Telatype = Telatype;
        this.Pais = Pais;
    }

    public char getTalla() {
        return Talla;
    }

    public void setTalla(char Talla) {
        this.Talla = Talla;
    }

    public String getTelatype() {
        return Telatype;
    }

    public void setTelatype(String Telatype) {
        this.Telatype = Telatype;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
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
        return "Ropa{" + "Talla=" + Talla + ", Telatype=" + Telatype + ", Pais=" + Pais + '}';
    }
    
    
    
}
