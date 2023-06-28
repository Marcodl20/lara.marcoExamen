package MLUtilitario;

import java.util.Scanner;

public class mlUtility {
    static Scanner sc = new Scanner (System.in);
    /**
     * <b> Obtener numero positivo </b> : se repite hasta que se ingrese un numero positivo
     * @return : numero ingresado positivo
     */
    public static int numeroSeriePositivo (){
        int numIngresado;
        do {
            numIngresado = sc.nextInt();
            if (numIngresado == 0) {
                return numIngresado;
            }
            if (numIngresado <= 1) {
                System.out.println("\n");
                System.out.print("Por favor digite un numero valido che: ");
            } 

        } while (numIngresado <= 1);
        return numIngresado;
    }

    /**
     * <b> clear </b> : Limpia la terminal
     */
    public final static void clear(){
        try {
            String operatingSystem = System.getProperty("os.name");
            if (operatingSystem.contains("Windows")) {
                new ProcessBuilder("cmd" , "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
