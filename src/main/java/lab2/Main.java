package lab2;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

        }
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("BIENVENDIOS");
        do {
            System.out.println("Que es lo que quieres hacer");
            System.out.println("1. Agregar persona");
            System.out.println("2. Mostrar el numero de la persona");
            System.out.println("3. Crear el tonero de artes marciales");
            System.out.println("4. Iniciar el torneo de artes marciales");
            System.out.println("5. Salir");
            opcion = Integer.parseInt(scan.nextLine());


            switch (opcion){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Sale");
                    break;
                case 5:
                    System.out.println("Ingrese lo valido");
                        break;
                default:
                    System.out.println("Ingresa la opcion valida :)");
                    break;

            }

        }while(opcion != 5);


    }
}