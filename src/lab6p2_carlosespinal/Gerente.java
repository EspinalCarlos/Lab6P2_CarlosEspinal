
package lab6p2_carlosespinal;

public class Gerente extends Persona{
    private String Username;
    private String Password;
    private String Cargo;

    public Gerente() {
        super();
    }

    public Gerente(String Username, String Password, String Cargo, int ID, String Nombre, char Sexo, String ECivil, double Altura, double Peso) {
        super(ID, Nombre, Sexo, ECivil, Altura, Peso);
        this.Username = Username;
        this.Password = Password;
        this.Cargo = Cargo;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
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
        return "Gerente{" + "Username=" + Username + ", Password=" + Password + ", Cargo=" + Cargo + '}';
    }
    
    
    
    
    
}
