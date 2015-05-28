package main;
import java.util.Scanner;

public class StartCUI {



    public static void main(String[] args) {  // psv "tab-taste
        menuAusgabe();
    }

    public static void menuAusgabe(){


        boolean exit = false;
        do{


            int eingabezahl;

            MenuStart.hauptMenu();

            try {
                eingabezahl = MenuStart.s.nextInt();
                switch (eingabezahl) {
                    case 1:
                        MenuStart.neuesSpiel();

                        exit = true;
                        break;
                    case 2:
                        MenuStart.spielLaden();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    case 4:
                        MenuStart.info();
                        break;
                    default:

                        System.out.println("Zahl zwischen 1 und 4 eingeben");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Falsche Eingabe");
            }

        }
        while(exit==false);
    }
}