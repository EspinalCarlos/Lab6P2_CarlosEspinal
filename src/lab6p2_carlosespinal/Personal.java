
package lab6p2_carlosespinal;

/**
 *
 * @author cespi
 */
public class Personal extends Persona{
    private String Posicion;
    private String Horario;
    private int TiempoTrabajo;
    private double Sueldo;

    public Personal() {
        super();
    }

    public Personal(String Posicion, String Horario, int TiempoTrabajo, double Sueldo, int ID, String Nombre, char Sexo, String ECivil, double Altura, double Peso) {
        super(ID, Nombre, Sexo, ECivil, Altura, Peso);
        this.Posicion = Posicion;
        this.Horario = Horario;
        this.TiempoTrabajo = TiempoTrabajo;
        this.Sueldo = Sueldo;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public int getTiempoTrabajo() {
        return TiempoTrabajo;
    }

    public void setTiempoTrabajo(int TiempoTrabajo) {
        this.TiempoTrabajo = TiempoTrabajo;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
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
        return "Personal{" + "Posicion=" + Posicion + ", Horario=" + Horario + ", TiempoTrabajo=" + TiempoTrabajo + ", Sueldo=" + Sueldo + '}';
    }
    
    
    
    
}
