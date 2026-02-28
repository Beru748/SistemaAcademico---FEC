/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author COMPUMAX
 */
public class Main {
    static ArrayList<Nota> listaNotas = new ArrayList<>();
    static ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        registrarNota();
        listarNotas();
        Nota nota = buscarNota("codigoEst", "codigoAsig");
        actualizarNota();
        eliminarNota();
}
    
    public static void registrarNota() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Codigo estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura: ");
    String codigoAsig = sc.nextLine();

    System.out.print("Nota: ");
    double valor = sc.nextDouble();

    Estudiante estudiante = buscarEstudiante(codigoEst);
    Asignatura asignatura = buscarAsignatura(codigoAsig);

    if (estudiante != null && asignatura != null) {
        Nota nota = new Nota(estudiante, asignatura, valor);
        listaNotas.add(nota);
        System.out.println("Nota registrada correctamente.");
    } else {
        System.out.println("Estudiante o asignatura no encontrados.");
    } 
}
    
    public static Estudiante buscarEstudiante(String codigo){

    for(Estudiante e : listaEstudiantes){
        if(e.getCodigo().equals(codigo)){
            return e;
        }
    }

    return null;
}
    
    public static Asignatura buscarAsignatura(String codigo){

    for(Asignatura a : listaAsignaturas){
        if(a.getCodigo().equals(codigo)){
            return a;
        }
    }

    return null;
}
    
    public static void listarNotas() {
    for (Nota n : listaNotas) {
        System.out.println(n);
    }
}

   public static Nota buscarNota(String codigoEst, String codigoAsig) {
    for (Nota n : listaNotas) {
        if (n.getEstudiante().getCodigo().equals(codigoEst)
                && n.getAsignatura().getCodigo().equals(codigoAsig)) {
            return n;
        }
    }
    return null;
}
   
   public static void actualizarNota() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Codigo estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura: ");
    String codigoAsig = sc.nextLine();

    Nota nota = buscarNota(codigoEst, codigoAsig);

    if (nota != null) {
        System.out.print("Nueva nota: ");
        double nuevaNota = sc.nextDouble();
        nota.setValor(nuevaNota);
        System.out.println("Nota actualizada.");
    } else {
        System.out.println("Nota no encontrada.");
    }
}
   
   public static void eliminarNota() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Codigo estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura: ");
    String codigoAsig = sc.nextLine();

    Nota nota = buscarNota(codigoEst, codigoAsig);

    if (nota != null) {
        listaNotas.remove(nota);
        System.out.println("Nota eliminada.");
    } else {
        System.out.println("Nota no encontrada.");
    }
}
}
