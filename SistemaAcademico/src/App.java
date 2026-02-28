import SistemaAcademico.Asignatura;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    Arraylist<Estudiante> ListaEstudiantes;
    ArrayList<Asignatura> listaAsignaturas;
    Arraylist<Notas> listaNotas;
    Scanner sc = new Scanner(System.in);

    //Metodo Principal
    public static void main(String[] args) throws Exception {


    }

    //Metodos para la gestion de la informacio de la universidad

    //Metodo para mostrar el menu principal
    public void mostrarMenu() {
        System.out.println("====================================================");
        System.out.println("| |                MENU PRINCIPAL                | |");
        System.out.println("====================================================");
        System.out.println("| | 1. Gestion de estudiantes.                   | |");
        System.out.println("| | 2. Gestion de asignaturas.                   | |");
        System.out.println("| | 3. Salir.                                    | |");
        System.out.println("====================================================");
        System.out.println("Escoja una opcion: ");
        int opcion = sc.nextInt();

        do {
            switch (opcion) {
                case 1:
                    menuEstudiante();
                    break;
                case 2:
                    menuAsignatura();
                    break;
                case 3:
                    System.out.println("Saliendo... Gracias por su tiempo :)");
                    break;

                default:
                    System.out.println("La opcion es invalida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }

    //Metodo para mostrar el menu de los estudiantes
    public void menuEstudiante() {
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

        do {
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
        } while (opcionE != 6);
    }

    //Metodos para el CRUD de Estudiantes

    public void registrarEstudiante() {
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


    //Metodo para mostrar el menu de los asignatura
    public void menuAsignatura() {
        System.out.println("==========================================================");
        System.out.println("                      MENU ASIGNATURA                     ");
        System.out.println("==========================================================");
        System.out.println("1. Registrar Asignatura");
        System.out.println("2. Listar Asignatura");
        System.out.println("3. Buscar Asignatura");
        System.out.println("4. Actualizar Asignatura");
        System.out.println("5. Eliminar Asignatura");
        System.out.println("6. Salir");
        System.out.println("==========================================================");
        System.out.println("Escoja una opcion");
        int opcionA = sc.nextInt();

        do {
            switch (opcionA) {
                case 1:
                    registrarAsignatura();
                    break;
                case 2:
                    ListarAsignatura();
                    break;
                case 3:
                    buscarAsignatura();
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
        } while (opcionA != 6);
    }

    //Metodos para el CRUD de Asignatura
    public void registrarAsignatura() {
        System.out.println("==========================================================");
        System.out.println("                    REGISTRO ASIGNATURA                   ");
        System.out.println("==========================================================");
        sc.nextLine();

        System.out.println("| | Nombre: ");
        String nombre = sc.nextLine();

        System.out.println("| | Codigo: ");
        String codigo = sc.nextLine();

        System.out.println("| | Docente:");
        String docente = sc.nextLine();

        System.out.println("| | Creditos");
        int creditos = sc.nextInt();
        sc.nextLine();


        listaAsignaturas.add(new Asignatura(nombre, codigo, docente, creditos));
        System.out.println("GUARDADO");

    }

    public void ListarAsignatura() {

        System.out.println("==========================================================");
        System.out.println("                   LISTA DE ASIGNATURAS                   ");
        System.out.println("==========================================================");
        for (Asignatura a : listaAsignaturas) {
            System.out.println("Nombre    : " + a.getNombre());
            System.out.println("Codigo    : " + a.getCodigo());
            System.out.println("Doncente  : " + a.getDocente());
            System.out.println("Creditos  : " + a.getCreditos());

        }
    }

    public void buscarAsignatura() {
        System.out.println("==========================================================");
        System.out.println("                        BUSCAR ASIGNATURA                 ");
        System.out.println("==========================================================");
        System.out.println("INGRESE EL CODIGO DE LA ASIGNATURA QUE DESEA BUSCAR: ");
        String codigo = sc.nextLine();
        boolean encontrada = false;

        for (Asignatura a : listaAsignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("ASIGNATURA ENCONTRADA: ");
                System.out.println("Nombre    : " + a.getNombre());
                System.out.println("Docente   : " + a.getDocente());
                System.out.println("Creditos  : " + a.getCreditos());
                encontrada = true;
                break;
            }
        }
        if (!encontrada) {
            System.out.println("NO SE ENCONTRO NINGUNA ASIGNATURA CON CODIGO: "+ codigo);
        }

    }
}





