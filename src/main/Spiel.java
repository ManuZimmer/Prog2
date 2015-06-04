package src.main;
import src.Gameobjects.*;
import java.util.Scanner;

/**
 * Created by Zimmermann on 04.06.15.
 */
public class Spiel {

    static int eingabezahl;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {  // psv "tab-taste

        menuAusgabe();
    }

    public static void menuAusgabe(){

        boolean exit = false;
        do{

            int eingabezahl;

            hauptMenu();

            try {
                eingabezahl = s.nextInt();
                switch (eingabezahl) {
                    case 1:
                        neuesSpiel();

                        exit = true;
                        break;
                    case 2:
                        spielLaden();
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    case 4:
                        info();
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


    public static void hauptMenu(){
        System.out.println("     1. Neues Spiel");
        System.out.println("     2. Spiel laden");
        System.out.println("     3. Beenden");
        System.out.println("     4. Info");
    }

    public static void spielerErstellen(int anzahl){
        Spieler[] anzspieler = new Spieler[anzahl];
        System.out.println("Es sind " + anzahl + " Spieler");
        for (int i=0; i<anzspieler.length;i++){
            anzspieler[i] = new Spieler();
            System.out.println("Wie soll Spieler " +(i+1)+" heissen?");
            anzspieler[i].setName(s.next());
        }
        System.out.println("Es spielen: ");
        for (int i=0;i<anzspieler.length;i++){
            System.out.println(anzspieler[i].getName());
        }
    }

    public static void neuesSpiel(){
        System.out.println("Anzahl Spieler: ");
        int spieler = s.nextInt();

        if (spieler<=1){
            System.out.println("Witzbold...");
            neuesSpiel();

        }
        else {
            spielerErstellen(spieler);
        }
    }

    public static void info(){
        System.out.println("Willkommen beim Schiffe versenken!");
    }

    public static void spielLaden(){
        System.out.println("Momentan nicht Möglich");
    }

    public static void schiffeSetzen(){
        int anzahlSchiffe = 0;
        System.out.println("Anzahl Fregatten: ");
        int fregatten = s.nextInt();
        anzahlSchiffe += fregatten;
        System.out.println("Anzahl Zerstoerer: ");
        int zerstoerer = s.nextInt();
        anzahlSchiffe += zerstoerer;
        System.out.println("Anzahl Uboote: ");
        int uboot = s.nextInt();
        anzahlSchiffe += uboot;
        System.out.println("Anzahl Corvetten: ");
        int corvette = s.nextInt();
        anzahlSchiffe += corvette;

        Schiff[] alleSchiffe = new Schiff[anzahlSchiffe];
        //Array wird mit den Schiffen gefuehlt
        for (int i =0;i<anzahlSchiffe;i++){
            if (fregatten>0){
                alleSchiffe[i] = new Fregatte();
                fregatten --;
            }
            else if (zerstoerer>0){
                alleSchiffe[i] = new Zerstoerer();
                zerstoerer--;
            }
            else if (uboot>0){
                alleSchiffe[i] = new UBoot();
                uboot--;
            }
            else if(corvette>0){
                alleSchiffe[i] = new Corvette();
                corvette--;
            }
        }
        System.out.println("Es wird mit "+anzahlSchiffe+" Schiffen gespielt.");
    }
}
