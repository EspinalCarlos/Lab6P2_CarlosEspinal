
package lab6p2_carlosespinal;

import java.awt.Color;

public class ObjetoHogar extends Objetos{
    private String Desc;
    private String Instructions;
    private String Funcionamiento;
    private int Garantia;

    public ObjetoHogar() {
        super();
    }

    public ObjetoHogar(String Desc, String Instructions, String Funcionamiento, int Garantia, Color color, String Descripcion, String Marca, String Size, String Calidad, Persona PIngreso) {
        super(color, Descripcion, Marca, Size, Calidad, PIngreso);
        this.Desc = Desc;
        this.Instructions = Instructions;
        this.Funcionamiento = Funcionamiento;
        this.Garantia = Garantia;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    public String getFuncionamiento() {
        return Funcionamiento;
    }

    public void setFuncionamiento(String Funcionamiento) {
        this.Funcionamiento = Funcionamiento;
    }

    public int getGarantia() {
        return Garantia;
    }

    public void setGarantia(int Garantia) {
        this.Garantia = Garantia;
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
        return "ObjetoHogar{" + "Desc=" + Desc + ", Instructions=" + Instructions + ", Funcionamiento=" + Funcionamiento + ", Garantia=" + Garantia + '}';
    }
    
    
    
    
    
}
