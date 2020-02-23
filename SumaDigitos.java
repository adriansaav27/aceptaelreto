import java.util.Scanner;

/**
 * Suma de dígitos
 * Es el ejercicio 140 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 04.11.2018
 */
public class SumaDigitos
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
        int auxiliar = p;        
        int suma = 0;
        String cadena = "";

        if(p < 0){
            return false;
        }

        while (auxiliar > 0){

            if (auxiliar > 9){
                cadena = auxiliar % 10 + " + " + cadena;
                suma += auxiliar % 10;
                auxiliar /= 10;
            } else{
                cadena = auxiliar % 10 + " + " + cadena;
                suma += auxiliar % 10;
                auxiliar /= 10;
            }

        }

        cadena = cadena + " = " + suma;
        cadena = cadena.replace(" +  ="," =");

        if (p == 0){
            cadena = "0 = 0";
        }

        System.out.println(cadena);

        return true;
    }
}