import java.util.Scanner;

/**
 * La fiesta aburrida
 * Es el ejercicio 117 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 23.10.2018
 */
public class Fiesta
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new Scanner(System.in);
        int numero = entrada.nextInt(); entrada.nextLine();

        for (int i = 1; i <= numero; i++) {
            String nombre = entrada.nextLine();
            String linea = nombre.substring(4);
            
            System.out.println("Hola, " + linea +".");         
        }
    }
}
