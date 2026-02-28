/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

/**
 *
 * @author COMPUMAX
 */
public class Nota {
    private Estudiante estudiante;
    private Asignatura asignatura;
    private double valor;
    private String periodo;

    public Nota(Estudiante estudiante, Asignatura asignatura, double valor, String periodo) {
        this.estudiante = estudiante;
        this.asignatura = asignatura;
        this.valor = valor;
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "estudiante=" + estudiante.getNombre() +
                ", asignatura=" + asignatura.getNombre() +
                ", periodo=" + periodo +
                ", valor=" + valor +
                '}';
    }
    
}
