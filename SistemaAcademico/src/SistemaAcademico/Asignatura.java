/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

/**
 *
 * @author COMPUMAX
 */
public class Asignatura {
    private String nombre;
    private String codigo;
    private String docente;
    private int creditos;

    public Asignatura(String nombre, String codigo, String docente, int creditos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.docente = docente;
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre=" + nombre + ", codigo=" + codigo + ", docente=" + docente + ", creditos=" + creditos + '}';
    }
    
    
}
