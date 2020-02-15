import java.util.Scanner;

/**
 * Racimo de Uvas
 * Es el ejercicio 126 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 19.11.2018
 */
public class Divisor
{
    static java.util.Scanner entrada;

    public static void main(String args[])
    {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()){
        }
    }

    private static boolean casoDePrueba()
    {
        int p = entrada.nextInt();
        int n = entrada.nextInt();
        boolean divisor = false;
        int cont = 0;
        
        if(p < 0 && n < 0){
            return false;
        }
        
        if (n == 0 && p == 1){
            divisor = true;
        }
        
        if (p <= n){
            divisor = true;
        }

        if (divisor){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        return true;
    }
}