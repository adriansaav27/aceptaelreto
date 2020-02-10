import java.util.Scanner;
import java.util.HashMap;

/**
 * Liga de pádel.
 * Es el ejercicio 109 de Acepta el Reto
 *
 * @author Adrián Saavedra Serrano
 * @version 14.12.2018
 */

public class Padel
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
        String nomCategoria = entrada.nextLine();

        if(nomCategoria.equals("FIN")) {
            return false;
        }

        HashMap<String,Integer> partidos = new HashMap();        
        java.util.Set<String> equipos = partidos.keySet();

        String partido = entrada.nextLine();

        while(!partido.equals("FIN")){            
            String [] cadena = partido.split(" ");

            int resultado1 = Integer.parseInt(cadena[1]);            
            int resultado2 = Integer.parseInt(cadena[3]);

            if(resultado1 > resultado2 && partidos.containsKey(cadena[2])){ 
                partidos.put(cadena[2], partidos.get(cadena[2]) + 1);                   
            }else{
                partidos.put(cadena[2],1);
            }

            if (resultado1 > resultado2 && partidos.containsKey(cadena[0])){
                partidos.put(cadena[0], partidos.get(cadena[0]) + 2);
            }else{
                partidos.put(cadena[0],2);
            }            

            partido = entrada.nextLine();
        }

        for(HashMap.Entry<String, Integer> puntos : partidos.entrySet()){
            System.out.println(puntos.getKey() + " " + puntos.getValue());            
        }
        
        return true;
    }
}