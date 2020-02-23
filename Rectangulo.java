import java.util.Scanner;

/**
 * Racimo de Uvas
 * Es el ejercicio 164 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 14.11.2018
 */
public class Rectangulo
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);

        while (casoDePrueba())
        {
        }
    }

    private static boolean casoDePrueba ( ) 
    {        
        int posicion1 = entrada.nextInt();
        int posicion2 = entrada.nextInt();
        int posicion3 = entrada.nextInt();
        int posicion4 = entrada.nextInt();
        
        if(posicion1 > posicion3 || posicion2 > posicion4){
        return false;
        }
        
        int base = posicion3 - posicion1;
        int altura = posicion4 - posicion2;

        System.out.println(base*altura);

        return true;
    }
}      
