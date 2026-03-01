package SistemaAcademico;

public class Estudiante {

    private String Cedula;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private String Carrera;
    private int Semestre;
    private String correo;
    private String telefono;

    public Estudiante(String cedula, String nombre, String apellido, int edad, String carrera, int semestre, String correo, String telefono) {
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
        this.Carrera = carrera;
        this.Semestre = semestre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getCedula(){
        return Cedula;
    }

    public void setCedula(String Cedula){
        this.Cedula = Cedula;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public String getApellido(){
        return Apellido;
    }

    public void setApellido(String Apellido){
        this.Apellido = Apellido;
    }

    public int getEdad(){
        return Edad;
    }

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public int getSemestre(){
        return Semestre;
    }

    public void setSemestre(int Semestre){
        this.Semestre = Semestre;

    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Estudiante" +
        "Cedula: " + Cedula + 
        "Nombre: " + Nombre + 
        "Apellido: " + Apellido + 
        "Edad: " + Edad + 
        "Carrera: " + Carrera + 
        "Semestre: " + Semestre +
        "Correo: "+ correo +
        "Telefono: " + telefono;
    }
}
