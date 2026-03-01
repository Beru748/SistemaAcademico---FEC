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
    static ArrayList<Estudiante> listaEstuEliminados = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    //Metodo Principal
    public static void main(String[] args) throws Exception {
        mostrarMenu();
        menuNotas();
        
        sc.close();
    }

    //Metodos para la gestion de la informacio de la universidad

    //Metodo para mostrar el menu principal
    public static void mostrarMenu() {
        int opcion;
        do{
            System.out.println("====================================================");
            System.out.println("| |                MENU PRINCIPAL                | |");
            System.out.println("====================================================");
            System.out.println("| | 1. Gestion de estudiantes.                   | |");
            System.out.println("| | 2. Gestion de asignaturas.                   | |");
            System.out.println("| | 3. Salir.                                    | |");
            System.out.println("====================================================");
            System.out.println("Escoja una opcion: ");
            opcion = sc.nextInt();

        
            switch (opcion) {
                case 1:
                    menuEstudiante();
                    break;
                case 2:
                    //menuAsignatura();
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
    public static void menuEstudiante() {
        int opcionE;
        do {
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
            opcionE = sc.nextInt();
            sc.nextLine();

            
                switch (opcionE) {
                    case 1:
                            registrarEstudiante();
                        break;
                    case 2:
                        listarEstudiantes();
                        break;
                    case 3:
                        buscarEstudiante();
                        break;
                    case 4:
                        actualizarEstudiante();
                        break;
                    case 5:
                        eliminarEstudiante();
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

/*====================================================================================================== 

                            Metodos para el CRUD de los estudiantes

=======================================================================================================*/ 

//Metodo para registrar estudiantes nuevos

    public static void registrarEstudiante() {
        sc.nextLine();
        System.out.println("====================================================");
        System.out.println("| |          REGISTRO DE ESTUDIANTE              | |");
        System.out.println("====================================================");

        char seguir;
        do{
            System.out.println("| | Cedula: ");
            String cedula = sc.nextLine();

            System.out.println("| | Nombre: ");
            String nombre = sc.nextLine();

            System.out.println("| | Apellido: ");
            String apellido = sc.nextLine();

            System.out.println("| | Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();

            System.out.println("| | Correo: ");
            String correo = sc.nextLine();

            System.out.println("| | Telefono: ");
            String telefono = sc.nextLine();

            System.out.println("| | Carrera: ");
            String carrera = sc.nextLine();

            System.out.println("| | Semestre: ");
            int semestre = sc.nextInt();
            sc.nextLine();

            listaEstudiantes.add(new Estudiante(cedula, nombre, apellido, edad, carrera, semestre, correo, telefono));
            System.out.println("El estudiante ha sido agregado con exito.");

            System.out.println("Desea registrar otro estudiante? (S/N): ");
            seguir = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
        } while (seguir == 's');
    }

    //Metodo para mostrar los estudiantes ya registrados

    public static void listarEstudiantes(){

        if(listaEstudiantes.isEmpty()){
            System.out.println("No se han encontrado estudiantes en la lista.");
            return;
        }

        System.out.println("====================================");
        System.out.println("      LISTA DE ESTUDIANTES");
        System.out.println("====================================");

        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.toString());
            System.out.println("====================================");
        }
        System.out.println("\nPresione Enter para volver al menú...");
        sc.nextLine();
    }

    //Metodo para buscar estudiantes por la cedula 
    public static Estudiante buscarPorCc(String cedula){
        if(listaEstudiantes.isEmpty()){
            System.out.println("No se han encontrado estudiantes en la lista.");
            return null;
        }
        for (Estudiante e : listaEstudiantes) {
            if (e.getCedula().equals(cedula)){
                return e;
            }
        }
        return null;
    }

    // Metodo para el menu de estudiantes
    public static void buscarEstudiante(){
        System.out.println("====================================");
        System.out.println("      BUSCAR ESTUDIANTE ");
        System.out.println("====================================");

        System.out.println("Cedula del estudiante: ");
        String cedula = sc.nextLine();
        Estudiante e = buscarPorCc(cedula);
        if(e != null){
            System.out.println("Estudiante encontrado: ");
            System.out.println("====================================");
            System.out.println(e.toString());
            System.out.println("====================================");
        } else {
            System.out.println("No se encontro estudiante con cedula: " + cedula);
        }

        System.out.println("\nPresione Enter para volver al menú...");
        sc.nextLine();
    }

    //Metodo para actualizar la informacion del estudiante

    public static void actualizarEstudiante(){
        sc.nextLine();
        System.out.println("====================================");
        System.out.println("      ACTUALIZAR ESTUDIANTE ");
        System.out.println("====================================");
        System.out.println("Cedula del estudiante: ");
        String cedula = sc.nextLine();
        
        if(listaEstudiantes.isEmpty()){
            System.out.println("No se han encontrado estudiantes en la lista.");
            return;
        } 

        for (Estudiante e : listaEstudiantes) {
            if(e.getCedula().equals(cedula)){
                System.out.println("Estudiante encontrado: "+ e.getNombre() + " " + e.getApellido() );
                System.out.println("==========================================================");

                System.out.println("| | Cedula: ");
                e.setCedula(sc.nextLine());

                System.out.println("| | Nombre: ");
                e.setNombre(sc.nextLine());

                System.out.println("| | Apellido: ");
                e.setApellido(sc.nextLine());

                System.out.println("| | Edad: ");
                e.setEdad(sc.nextInt());
                sc.nextLine();

                System.out.println("| | Correo: ");
                e.setCorreo(sc.nextLine());

                System.out.println("| | Telefono: ");
                e.setTelefono(sc.nextLine());

                System.out.println("| | Carrera: ");
                e.setCarrera(sc.nextLine());

                System.out.println("| | Semestre: ");
                e.setSemestre(sc.nextInt());
                sc.nextLine();
                System.out.println("==========================================================");
                System.out.println("La informacion del estudiante ha sido actualizada con exito.");
            }
        }

    }

    //Metodo para eliminar a los estudiantes 

    public static void eliminarEstudiante(){
        System.out.println("====================================================");
        System.out.println("| |         ELIMINAR ESTUDIANTE                  | |");
        System.out.println("====================================================");
        System.out.println("Ingrese la cedula del estudiante a eliminar: ");
        String cedula = sc.nextLine();
        
        Estudiante estudiante = buscarPorCc(cedula);
        
        if (estudiante != null) {
            listaEstudiantes.remove(estudiante);
            listaEstuEliminados.add(estudiante);
            System.out.println("Estudiante movido a lista de eliminados.");
        } else {
            System.out.println("No se encontro estudiante con cedula: " + cedula);
        }
    }

/*====================================================================================================== 

                            Metodo para mostrar el menu y el CRUD de las asignatura

=======================================================================================================*/   

    public static void menuAsignatura() {
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
        Scanner sc = new Scanner(System.in);
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
                    actualizarAsignatura();
                    break;
                case 5:
                    eliminarAsignatura();
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

    //Metodo para registrar asignatura

    public static void registrarAsignatura() {
        System.out.println("==========================================================");
        System.out.println("                    REGISTRO ASIGNATURA                   ");
        System.out.println("==========================================================");
        Scanner sc = new Scanner(System.in);
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

    //Metodo para listar asignatura
    public static void ListarAsignatura() {

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

    //Metodo para buscar asignatura
    public static Asignatura buscarAsignatura(String codigoAsig) {
        System.out.println("==========================================================");
        System.out.println("                        BUSCAR ASIGNATURA                 ");
        System.out.println("==========================================================");
        
        sc.nextLine();
        System.out.println("Ingrese el codigo que desea buscar: ");
        String codigo = sc.nextLine();


        for (Asignatura a : listaAsignaturas) {
            if (a.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("ASIGNATURA ENCONTRADA: ");
                System.out.println("Nombre    : " + a.getNombre());
                System.out.println("Docente   : " + a.getDocente());
                System.out.println("Creditos  : " + a.getCreditos());
                return a;

            }
        }

            System.out.println("No se encontro ninguna asignatura con codigo: "+ codigo);
            return null;

    }

    //Metodo para actualizar asignatura
    public static void actualizarAsignatura(){
        System.out.println("==========================================================");
        System.out.println("                   ACTUALIZAR ASIGNATURA                  ");
        System.out.println("==========================================================");
        
        System.out.println("Ingrese el codigo de la asignatura que desea editar: ");
        String codigo = sc.nextLine();
        boolean actualizada= false;

        for(Asignatura a :listaAsignaturas){
            if(a.getCodigo().equalsIgnoreCase(codigo)) {
                System.out.println("Asignatura encontrada:" + a.getNombre());

                System.out.println("Nuevo Nombre: ");
                a.setNombre(sc.nextLine());
                System.out.println("Nuevo Docente: ");
                a.setDocente(sc.nextLine());
                System.out.println("Nuevos Creditos");
                a.setCreditos(sc.nextInt());
                sc.nextLine();

                System.out.println("Asignatura actualizada correctamente");
                actualizada = true;
                break;
            }

        }
        if(!actualizada){
            System.out.print("No se encontro ninguna asignatura con codigo: "+ codigo);
        }
    }

    public static void eliminarAsignatura(){
        System.out.print("==========================================================");
        System.out.print("                   ELIMINAR ASIGNATURA"                    );
        System.out.print("==========================================================");
        
        String codigo=sc.nextLine();
        boolean eliminado= listaAsignaturas.removeIf(a->a.getCodigo().equalsIgnoreCase(codigo));
        if(eliminado){
            System.out.print("Asignatura eliminada con exito");
        }else{
            System.out.print("No se encontro ninguna asignatura con ese codigo");
        }
    }

    /*====================================================================================================== 

                            Metodo para mostrar el menu y el CRUD de las notas

=======================================================================================================*/ 
    
    public static void menuNotas(){
    Scanner sc = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("\n=====================================");
        System.out.println("         SISTEMA DE NOTAS");
        System.out.println("=====================================");
        System.out.println("1. Registrar nota");
        System.out.println("2. Consultar nota");
        System.out.println("3. Actualizar nota");
        System.out.println("4. Eliminar nota");
        System.out.println("5. Listar notas");
        System.out.println("0. Salir");
        System.out.println("=====================================");
        System.out.print("Seleccione una opcion: ");
        
        
        opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        switch (opcion) {

            case 1:
                registrarNota();
                break;

            case 2:
                System.out.print("Codigo estudiante: ");
                String codigoEst = sc.nextLine();
                System.out.print("Codigo asignatura: ");
                String codigoAsig = sc.nextLine();

                Nota nota = buscarNota(codigoEst, codigoAsig);

                if (nota != null) {
                    mostrarNotaBonita(nota);
                } else {
                    System.out.println("Nota no encontrada.");
                }
                break;

            case 3:
                actualizarNota();
                break;

            case 4:
                eliminarNota();
                break;

            case 5:
                listarNotas();
                break;

            case 0:
                System.out.println("Saliendo del sistema...");
                break;

            default:
                System.out.println("Opcion invalida.");
        }

    } while (opcion != 0);
}
    
    public static void mostrarNotaBonita(Nota n) {

    System.out.println("\n-------------------------------------");
    System.out.println("        INFORMACION DE LA NOTA");
    System.out.println("-------------------------------------");
    System.out.println("Estudiante : " + n.getEstudiante().getNombre());
    System.out.println("Codigo     : " + n.getEstudiante().getCedula());
    System.out.println("Asignatura : " + n.getAsignatura().getNombre());
    System.out.println("Periodo    : " + n.getPeriodo());
    System.out.println("Nota       : " + n.getValor());
    System.out.println("-------------------------------------\n");
}
    
    public static void registrarNota() {
    Scanner sc = new Scanner(System.in);

    System.out.println("\n=====================================");
    System.out.println("         REGISTRAR NOTA");
    System.out.println("=====================================");

    System.out.print("Codigo estudiante : ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura : ");
    String codigoAsig = sc.nextLine();

    System.out.print("Periodo           : ");
    String periodo = sc.nextLine();

    System.out.print("Nota              : ");
    double valor = sc.nextDouble();

    Estudiante estudiante = buscarPorCc(codigoEst);
    Asignatura asignatura = buscarAsignatura(codigoAsig);

    if (estudiante != null && asignatura != null) {

        for (Nota n : listaNotas) {
            if (n.getEstudiante().getCedula().equals(codigoEst) &&
                n.getAsignatura().getCodigo().equals(codigoAsig) &&
                n.getPeriodo().equalsIgnoreCase(periodo)) {

                System.out.println("-------------------------------------");
                System.out.println(" Ya existe una nota para este periodo.");
                System.out.println("-------------------------------------\n");
                return;
            }
        }

        Nota nota = new Nota(estudiante, asignatura, valor, periodo);
        listaNotas.add(nota);

        System.out.println("-------------------------------------");
        System.out.println(" Nota registrada correctamente.");
        System.out.println("-------------------------------------");

        mostrarDefinitiva(estudiante, asignatura);

    } else {
        System.out.println("-------------------------------------");
        System.out.println(" Estudiante o asignatura no encontrados.");
        System.out.println("-------------------------------------\n");
    }
}
    
    public static void mostrarDefinitiva(Estudiante estudiante, Asignatura asignatura) {
        int contador = 0;
    double suma = 0;

    for (Nota n : listaNotas) {
        if (n.getEstudiante().getCedula().equals(estudiante.getCedula()) &&
            n.getAsignatura().getCodigo().equals(asignatura.getCodigo())) {

            contador++;
            suma += n.getValor();
        }
    }

    if (contador == 3) {

        double definitiva = suma / 3;

        System.out.println("\n=====================================");
        System.out.println("        DEFINITIVA CALCULADA");
        System.out.println("=====================================");
        System.out.println("Estudiante : " + estudiante.getNombre());
        System.out.println("Asignatura : " + asignatura.getNombre());
        System.out.println("Promedio   : " + definitiva);
        System.out.println("=====================================\n");
    }
    }
    
    public static void listarNotas() {
    if (listaNotas.isEmpty()) {
        System.out.println("No hay notas registradas.");
        return;
    }

    System.out.println("\n============== LISTA DE NOTAS ==============");

    for (Nota n : listaNotas) {

        System.out.println("--------------------------------------------");
        System.out.println("Estudiante : " + n.getEstudiante().getNombre());
        System.out.println("Asignatura : " + n.getAsignatura().getNombre());
        System.out.println("Periodo    : " + n.getPeriodo());
        System.out.println("Nota       : " + n.getValor());
    }

    System.out.println("--------------------------------------------\n");
    }

    public static Nota buscarNota(String codigoEst, String codigoAsig) {
        for (Nota n : listaNotas) {
            if (n.getEstudiante().getCedula().equals(codigoEst)
                    && n.getAsignatura().getCodigo().equals(codigoAsig)) {
                return n;
            }
        }
        return null;
    }

    public static void actualizarNota() {

    System.out.println("\n=====================================");
    System.out.println("        ACTUALIZAR NOTA");
    System.out.println("=====================================");

    System.out.print("Codigo estudiante : ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura : ");
    String codigoAsig = sc.nextLine();

    Nota nota = buscarNota(codigoEst, codigoAsig);

    if (nota != null) {

        System.out.println("-------------------------------------");
        System.out.println("Nota actual : " + nota.getValor());
        System.out.println("-------------------------------------");

        System.out.print("Nueva nota  : ");
        double nuevaNota = sc.nextDouble();
        nota.setValor(nuevaNota);

        System.out.println("-------------------------------------");
        System.out.println(" Nota actualizada correctamente.");
        System.out.println("-------------------------------------\n");

    } else {
        System.out.println("-------------------------------------");
        System.out.println(" Nota no encontrada.");
        System.out.println("-------------------------------------\n");
    }
    }

    public static void eliminarNota() {

    System.out.println("\n=====================================");
    System.out.println("        ELIMINAR NOTA");
    System.out.println("=====================================");

    System.out.print("Codigo estudiante : ");
    String codigoEst = sc.nextLine();

    System.out.print("Codigo asignatura : ");
    String codigoAsig = sc.nextLine();

    Nota nota = buscarNota(codigoEst, codigoAsig);

    if (nota != null) {

        listaNotas.remove(nota);

        System.out.println("-------------------------------------");
        System.out.println(" Nota eliminada correctamente.");
        System.out.println("-------------------------------------\n");

    } else {

        System.out.println("-------------------------------------");
        System.out.println(" Nota no encontrada.");
        System.out.println("-------------------------------------\n");
    }
    }
}





