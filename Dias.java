import java.util.Scanner;

/**
 * ¿Cuantos días faltan?
 * Es el ejercicio 157 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 29.10.2018
 */
public class Dias
{
    static Scanner entrada;

    public static void main (String args[]) 
    {
        entrada = new Scanner(System.in);
        int numeroDeCasos = entrada.nextInt(); entrada.nextLine();      

        while(numeroDeCasos != 0){
            String aux = entrada.nextLine();
            String[] parts = aux.split(" ");
            int dia = Integer.parseInt(parts[0]);
            int mes = Integer.parseInt(parts[1]);
            int v_dia = 0;

            while(mes <= 12){
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    v_dia = v_dia + (31 - dia);
                    dia = 0;
                    mes++;
                }else if(mes == 2){
                    v_dia = v_dia + (28 - dia);
                    dia = 0;
                    mes++;
                }else{
                    v_dia = v_dia + (30 - dia);
                    dia = 0;
                    mes++;            
                }   
                
            }            
            System.out.println(v_dia);
            numeroDeCasos--;
        }        
    }
}
