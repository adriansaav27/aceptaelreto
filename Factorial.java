import java.util.Scanner;

/**
 * Último dígito del factorial
 * Es el ejercicio 114 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 23.10.2018
 */
public class Factorial
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new Scanner(System.in);
        int numeroDeCasos = entrada.nextInt();

        while(numeroDeCasos!=0){
            int factorial = 1;            

            int numero = entrada.nextInt();

            if(numero >= 5){
                System.out.println(0);                
            }else{
                for (int i = numero; i > 0; i--) {
                    factorial *= i;
                }

                if(factorial == 24){
                    System.out.println(4);
                }else{
                    System.out.println(factorial);
                }
            }

            numeroDeCasos--;
        }        
    }        
}

