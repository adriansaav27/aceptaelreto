import java.util.Scanner;

/**
 * Romance en el palomar
 * Es el ejercicio 158 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 25.11.2018
 */
public class Mario
{
    static java.util.Scanner entrada;

    public static void main (String args[]) 
    {
        entrada= new java.util.Scanner(System.in);
        int numVeces = entrada.nextInt();

        for (int i = 1; i <= numVeces; i++) {
            repetirSaltos();
        }
    }

    private static void repetirSaltos()
    {
        int numMuros = entrada.nextInt();

        if (numMuros > 0 && numMuros <= 1000000000) {
            int saltosArriba = 0;
            int saltosAbajo  = 0;
            int alturaActual = entrada.nextInt();

            for (int muro = 1; muro < numMuros; ++muro) {
                int alturaSiguiente = entrada.nextInt();

                if (alturaSiguiente < alturaActual) {
                    saltosAbajo++;
                } else if (alturaSiguiente > alturaActual) {
                    saltosArriba++;
                }
                
                alturaActual = alturaSiguiente;
            }
 
            System.out.println(saltosArriba + " " + saltosAbajo);
        }
    }
}