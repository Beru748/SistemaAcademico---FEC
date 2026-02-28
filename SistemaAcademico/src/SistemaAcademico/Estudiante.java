package SistemaAcademico;

public class Estudiante {

    private String Codigo;
    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Semestre;

    public Estudiante(String Codigo, String Nombre, String Apellido, int Edad, int Semestre){

        this.Codigo= Codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Semestre = Semestre;

    }

    public String getCodigo(){
        return Codigo;
    }

    public void setCodigo(String Codigo){
        this.Codigo = Codigo;
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

    public int getSemestre(){
        return Semestre;
    }

    public void setSemestre(int Semestre){
        this.Semestre = Semestre;

    }

    @Override
    public String toString() {
        return ",Codigo: " + Codigo + ",Nombre: " + Nombre + ",Apellido: " + Apellido +
                ",Edad: " + Edad + ",Semestre: " + Semestre;
    }
}
