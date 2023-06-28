import java.util.Arrays;

public class Mostrar {
    /**
     * <b> showAsignaturas </b> : Se muestra todas las asignaturas que hay
     */
    public static void mlshowAsignaturas() {
        String [] asignaturasChuncho = {"APRECIACION CINEMATOGRAFICA", "ARQUITECTURA DE COMPUTADORES", "ESTRUCTURA DE DATOS Y ALGORITMOS 1", "FUNDAMENTOS DE REDES Y CONECTIVIDAD", "INGLES", "SISTEMAS OPERATIVOS"};
        String [] asignaturasHidalgo = {"ARQUITECTURA DE COMPUTADORES", "ESTRUCTURA DE DATOS Y ALGORITMOS I", "FUNDAMENTOS DE REDES Y CONECTIVIDAD","INTRODUCCION A LA PRODUCCION", "PROBABILIDAD Y ESTADISTiCA BASICAS", "SISTEMAS OPERATIVOS"};
        String [] asignaturasAleman = {"ARQUITECTURA DE COMPUTADORES", "CONTACTO CON LA MUSICA", "ESTRUCTURA DE DATOS Y ALGORITMOS 1","FUNDAMENTOS DE REDES Y CONECTIVIDAD", "PROBABILIDAD Y ESTADISTiCA BASICAS", "SISTEMAS OPERATIVOS"};
        String [] codigoInicialC = {"ICCD343 - GR1SW", "ICCD343 - GR1SW", "ICCD353 - GR1SW", "ICCD353 - GR1SW", "CSHD3Bl - A3", "MATD223 - GR4SW", "ICCD323 - GRlSW", "ICCD323 - GRlSW", "CSHD3Bl - A3", "MATD223 - GR4SW", "ICCD323 - GRlSW"};
        String [] codigoInicialH = {"ICCD332 - GR1SW", "ICCD333 - GR1SW", "ICCD343 - GR1SW", "ICCD353 - GR1SW", "CSHD3Bl - A3", "MATD223 - GR4SW", "ICCD323 - GRlSW"};
        String [] codigoInicialA = {"ICCD332 - GR1SW", "ICCD333 - GR1SW", "ICCD343 - GR1SW", "ICCD353 - GR1SW", "CSHD3Bl - A3", "MATD223 - GR4SW", "ICCD323 - GRlSW"};
        Arrays.sort (asignaturasChuncho);
        Arrays.sort (asignaturasHidalgo);
        Arrays.sort (asignaturasAleman);

        System.out.println("[+] Lista de Materias");
        for (int i = 0; i < asignaturasChuncho.length; i++) {
            System.out.println("\t" + codigoInicialC [i] + "- " + asignaturasChuncho [i]);
        }
        for (int i = 0; i < asignaturasHidalgo.length; i++) {
            System.out.println("\t" + codigoInicialH [i] + "- " + asignaturasHidalgo [i]);
        }
        for (int i = 0; i < asignaturasAleman.length; i++) {
            System.out.println("\t" + codigoInicialA [i] + "- " + asignaturasAleman[i]);
        }
    }

    /**
     * <b> showAlumnos </b> : Se mostrara los alumnos
     */
    public static void mlshowAlumnos() {
        String [] alumnos = {"CHUCHO JIMENEZ ANGEL DAVID", "HIDALGO CRUZ PABLO ESTEBAN", "ALEMAN OSORIO CARLOS ALEJANDRO"}; 
        int [] codigoInicial = {202110105, 202111083, 202120757};
        Arrays.sort (alumnos);

        System.out.println("[+] Listado de alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\t " + codigoInicial [i] + "-" + alumnos [i]);
        }
    }
}
