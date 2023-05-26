/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_carlosespinal;

import java.awt.Color;

/**
 *
 * @author cespi
 */
public class Zapato extends Objetos{
    private double Talla;
    private String Description;
    private String Comodidad;

    public Zapato() {
        super();
    }

    public Zapato(double Talla, String Description, String Comodidad, Color color, String Descripcion, String Marca, String Size, String Calidad, Persona PIngreso) {
        super(color, Descripcion, Marca, Size, Calidad, PIngreso);
        this.Talla = Talla;
        this.Description = Description;
        this.Comodidad = Comodidad;
    }

    public double getTalla() {
        return Talla;
    }

    public void setTalla(int Talla) {
        this.Talla = Talla;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getComodidad() {
        return Comodidad;
    }

    public void setComodidad(String Comodidad) {
        this.Comodidad = Comodidad;
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
        return "Zapato{" + "Talla=" + Talla + ", Description=" + Description + ", Comodidad=" + Comodidad + '}';
    }
    
    
    
    
}
