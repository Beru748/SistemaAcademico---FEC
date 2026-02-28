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
}
