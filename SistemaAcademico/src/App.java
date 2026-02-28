import SistemaAcademico.Asignatura;
import SistemaAcademico.Estudiante;
import SistemaAcademico.Nota;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static ArrayList<Nota> listaNotas = new ArrayList<>();
    static ArrayList<Asignatura> listaAsignaturas = new ArrayList<>();
    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //Metodo Principal
    public static void main(String[] args) throws Exception {
      registrarNota();
      listarNotas();
      Nota nota = buscarNota("codigoEst", "codigoAsig");
      actualizarNota();
    }

    //Metodos para la gestion de la informacio de la universidad

    //Metodo para mostrar el menu principal
    public void mostrarMenu(){
        System.out.println("====================================================");
        System.out.println("| |                MENU PRINCIPAL                | |");
        System.out.println("====================================================");
        System.out.println("| | 1. Gestion de estudiantes.                   | |");
        System.out.println("| | 2. Gestion de asignaturas.                   | |");
        System.out.println("| | 3. Salir.                                    | |");
        System.out.println("====================================================");
        System.out.println("Escoja una opcion: ");
        int opcion = sc.nextInt();

        do{
            switch (opcion) {
                case 1:
                    menuEstudiante();
                    break;
                case 2: 
                    System.out.println("Menu de Asignaturas.");
                    break;
                case 3:
                    System.out.println("Saliendo... Gracias por su tiempo :)");
                break;
            
                default:
                    System.out.println("La opcion es invalida. Intente nuevamente.");
                    break;
            }
        }while(opcion != 3);
    }

    //Metodo para mostrar el menu de los estudiantes
    public void menuEstudiante(){
        System.out.println("====================================================");
        System.out.println("| |             MENU DE ESTUDIANTES              | |");
        System.out.println("====================================================");
        System.out.println("| | 1. Registrar estudiante.                     | |");
        System.out.println("| | 2. Listar estudiante.                        | |");
        System.out.println("| | 3. Buscar estudiante.                        | |");
        System.out.println("| | 4. Actualizar informacion del estudiante.    | |");
        System.out.println("| | 5. Eliminar estudiante.                      | |");
        System.out.println("| | 6. Salir.                                    | |");
        System.out.println("====================================================");
        System.out.println("Escoja una opcion: ");
        int opcionE = sc.nextInt();

        do{
            switch (opcionE) {
                case 1:
                    System.out.println("");
                    break;
                case 2: 
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saliendo... Gracias por su tiempo :)");
                break;
            
                default:
                    System.out.println("La opcion es invalida. Intente nuevamente.");
                    break;
            }
        }while(opcionE != 6);
    }

    //Metodos para el CRUD de Estudiantes

    public void registrarEstudiante(){
        System.out.println("====================================================");
        System.out.println("| |          REGISTRO DE ESTUDIANTE              | |");
        System.out.println("====================================================");
        sc.nextLine();

        System.out.println("| | Cedula: ");
        String cedula = sc.nextLine();

        System.out.println("| | Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("| | Apellido: ");
        String apellido = sc.nextLine();

        System.out.println("| | Correo: ");
        String correo = sc.nextLine();

        System.out.println("| | Telefono: ");
        String telefono = sc.nextLine();

        System.out.println("| | Carrera: ");
        String carrera = sc.nextLine();
    }
/* 
    public ArrayList<Estudiante> listarEstudiantes(){
    }

    public Estudiante buscarPorCc(){
    }

    public boolean actualizarEstudiante(){
    }

    public boolean eliminarEstudiante(){
    }*/


    public void menuAsignatura(){
        System.out.println("==========================================================");
        System.out.println("                      MENU ASIGNATURA                     ");
        System.out.println("==========================================================");
        System.out.println("1. Registrar Asignatura");
        System.out.println("2. Listar Asignatura");
        System.out.println("3. Buscar Asignatura");
        System.out.println("4. Actutalozar Asignatura");
        System.out.println("5. Eliminar Asignatura");
        System.out.println("6. Salir");
        System.out.println("==========================================================");
        System.out.println("Escoja una opcion");
        int opcionA = sc.nextInt();

        do{
            switch (opcionA){
                case 1:
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Saliendo... Gracias por su tiempo :)");
                    break;

                default:
                    System.out.println("La opcion es invalida. Intente nuevamente.");
                    break;
            }
        }while(opcionA != 6);


    }
    
    public static void registrarNota() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Codigo estudiante: ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura: ");
    String codigoAsig = sc.nextLine();

    System.out.print("Periodo: ");
    String periodo = sc.nextLine();

    System.out.print("Nota: ");
    double valor = sc.nextDouble();

    Estudiante estudiante = buscarEstudiante(codigoEst);
    Asignatura asignatura = buscarAsignatura(codigoAsig);

    if (estudiante != null && asignatura != null) {

        
        for (Nota n : listaNotas) {
            if (n.getEstudiante().getCodigo().equals(codigoEst) &&
                n.getAsignatura().getCodigo().equals(codigoAsig) &&
                n.getPeriodo().equalsIgnoreCase(periodo)) {

                System.out.println("Ya existe una nota para este periodo.");
                return;
            }
        }

        Nota nota = new Nota(estudiante, asignatura, valor, periodo);
        listaNotas.add(nota);

        System.out.println("Nota registrada correctamente.");

        
        mostrarDefinitiva(estudiante, asignatura);

    } else {
        System.out.println("Estudiante o asignatura no encontrados.");
    }
}
    
    public static void mostrarDefinitiva(Estudiante estudiante, Asignatura asignatura) {

    int contador = 0;
    double suma = 0;

    for (Nota n : listaNotas) {
        if (n.getEstudiante().getCodigo().equals(estudiante.getCodigo()) &&
            n.getAsignatura().getCodigo().equals(asignatura.getCodigo())) {

            contador++;
            suma += n.getValor();
        }
    }

    if (contador == 3) {
        double definitiva = suma / 3;
        System.out.println("Definitiva de " + asignatura.getNombre() +
                " para " + estudiante.getNombre() +
                " = " + definitiva);
    }
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
}
