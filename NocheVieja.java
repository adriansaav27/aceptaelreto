import java.util.Scanner;

/**
 * Artrópodos
 * Es el ejercicio 148 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 23.10.2018
 */
public class NocheVieja
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new Scanner(System.in);
        String hora = entrada.nextLine();        

        while(!hora.equals("00:00")){
            String horas = hora.substring(0,2);
            int horasV = Integer.parseInt(horas);
            String minutos = hora.substring(3,5);
            int minutosV = Integer.parseInt(minutos);
            int minutosSalida = 0;

            while(horasV != 24){
                minutosSalida = minutosSalida + (60 - minutosV);
                minutosV = 0;
                horasV++;
            }

            System.out.println(minutosSalida);
            hora = entrada.nextLine();            
        }
    }
}
