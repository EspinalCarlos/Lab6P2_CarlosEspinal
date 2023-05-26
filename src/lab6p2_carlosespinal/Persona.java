
package lab6p2_carlosespinal;

public class Persona {
    protected int ID;
    protected String Nombre;
    protected char Sexo;
    protected String ECivil;
    protected double Altura;
    protected double Peso;

    public Persona() {
    }

    public Persona(int ID, String Nombre, char Sexo, String ECivil, double Altura, double Peso) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Sexo = Sexo;
        this.ECivil = ECivil;
        this.Altura = Altura;
        this.Peso = Peso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public String getECivil() {
        return ECivil;
    }

    public void setECivil(String ECivil) {
        this.ECivil = ECivil;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
    
}
