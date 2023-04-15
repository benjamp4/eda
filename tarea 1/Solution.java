import java.io.*;
import java.util.*;
import java.util.Comparator.*;

//TORNEO DE CELL


public class Solution {
    public static void main(String[] args) {
        LinkedHashMap<HashMap<String, String>,HashMap<String, Integer>>
        Participantes = new LinkedHashMap(); //Map de Participante , Poder

        System.out.println("Ingrese cantidad de participantes para el torneo de cell");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); //Scanner de n participantes
        scan.nextLine();

        for(int i=0;i<n;i++){ //Ciclo para rellenar la informacion de n participantes

            System.out.println("Ingrese el nombre del participante para el torneo de cell");
            String nombre = scan.nextLine(); //Ingresar nombre del participante por consola

            System.out.println("Ingrese el poder del participante para el torneo de cell");
            int poder = scan.nextInt(); //Ingresar poder del participante por consola
            scan.nextLine();

            Participantes.put("Nombre", nombre, "Poder", poder); //Ingresar nombre y poder del participante a un map
    
        }
        scan.close(); //Cerrar scan
        System.out.println(Participantes);


    }
    }
