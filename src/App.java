import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import MLUtilitario.mlUtility;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        String mlLogin = "";
        String mlLoginContraseña = " ";
        int mlOpciones = 0;
        System.out.println("\t Escuela Politecnica Nacional");
        System.out.println("\t - CEDULA: 1727547687");
        System.out.println("\t - CORREO: MARCO.LARA01@EPN.EDU.EC");
        System.out.println("\t - NOMBRE: marco daniel lara vite");
        System.out.println("\n");

        System.out.println("\t ''''''''''''''''''''''''''''''");
        System.out.println("\t          Inicie sesion"        );
        System.out.print("\t - Usuario: ");
        mlLogin = sc.nextLine().toUpperCase();
        System.out.print("\t - Contraseña: ");
        mlLoginContraseña = sc.nextLine().toUpperCase();
        System.out.println("\t ''''''''''''''''''''''''''''''");
        System.out.println("\t      Bienvenido " + mlLogin);

        System.out.println("-------------------------------");
        System.out.println("   Carga horaria de alumnos    ");
        System.out.println("-------------------------------");
        System.out.println("USUARIO: " + mlLogin);
        System.out.println();
        System.out.println("1. Visualizar Alumnos");
        System.out.println("2. Visualizar Asignaturas");
        System.out.println("3. Visualizar Horario");
        System.out.println("4. Visualizar Horario de una Asignatura");
        System.out.println("0. SALIR");

        switch (mlOpciones = mlUtility.numeroSeriePositivo()) {
            case 1:
                Mostrar.mlshowAlumnos();
                break;
            case 2:
                Mostrar.mlshowAsignaturas();
                break;
            case 3:

                break;
            case 4:

                break;
            case 0:
                System.out.println("Regresa pronto " + mlLogin);
                break;


            default:
                break;
        }

    }  
}
