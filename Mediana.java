import java.util.Scanner;
import java.util.Arrays;

/**
 * Claras y oscuras
 * Es el ejercicio 161 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 24.11.2018
 */
public class Mediana
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()){
        }
    }

    private static boolean casoDePrueba ( ) 
    {
        int veces = entrada.nextInt(); 

        if (veces == 0) {
            return false;
        }
        
        int [] aNumeros = new int[veces];
        
        for(int i = 0; i < aNumeros.length;i++){
            aNumeros[i] = entrada.nextInt(); 
        }
        
        Arrays.sort(aNumeros);
        
        int mediana = 0;
        
        if((aNumeros.length) % 2 != 0){
            int posicion = (aNumeros.length / 2);
            System.out.println(aNumeros[posicion]*2);
            return true;
        }else{
            int anterior = (aNumeros.length / 2)-1;
            int siguiente = (aNumeros.length / 2);
            
            int diferencia = (aNumeros[anterior]+aNumeros[siguiente]);
            
            System.out.println(diferencia);
            return true;
        }    
    }
}