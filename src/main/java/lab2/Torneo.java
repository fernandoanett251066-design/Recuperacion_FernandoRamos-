package lab2;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;



public class Torneo{

    Scanner scan = new Scanner(System.in);
    public String nombre;
    TreeMap<String,Peleador> persona = new TreeMap<>();

    public String Torneo(){
        System.out.println("Ingrese nombre del torneo");
        nombre = scan.nextLine();
        return nombre;
    }


    public void agregarPersona(){
        String nombrePersona;
        System.out.println("");

    }
}
