import java.util.Scanner;

/**
 * Constante mágica
 * Es el ejercicio 120 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 25.11.2018
 */
public class Constante { 
    static java.util.Scanner entrada; 

    public static void main(String args[]){ 
        entrada = new java.util.Scanner(System.in); 

        while (casoDePrueba()){ } 
    } 

    private static boolean casoDePrueba() 
    { 
        int n = entrada.nextInt(); 
        int k = entrada.nextInt();

        if(n == 0 && k == 0){ 
            return false;
        }

        int constante = k; 
        int contador = 1; 
        int aux = k; 

        while (contador < n){ 
            aux += (n + 1); 
            constante += aux; 
            contador++; 
        } 

        System.out.println(constante); 

        return true; 
    } 
}
