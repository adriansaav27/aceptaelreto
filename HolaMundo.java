import java.util.Scanner;

/**
 * ¡Hola Mundo!
 * Es el ejercicio 116 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 23.10.2018
 */
public class HolaMundo
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero >= 0 && numero <= 5){
            for (int i = 1; i <= numero; i++) {
                System.out.println("Hola mundo.");
            }
        }
    }
}
