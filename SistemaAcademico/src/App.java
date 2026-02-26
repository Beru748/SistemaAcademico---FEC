import java.util.Scanner;
import java.util.ArrayList;

public class App {
    Arraylist <Estudiante> ListaEstudiantes;
    Arraylist <Asignatura> listaAsignaturas;
    Arraylist <Notas> listaNotas;
    Scanner sc = new Scanner(System.in);

    //Metodo Principal
    public static void main(String[] args) throws Exception {

        
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
        System.out.println("Escoga una opcion: ");
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
        System.out.println("Escoga una opcion: ");
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
}
