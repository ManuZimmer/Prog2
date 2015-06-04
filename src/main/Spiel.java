package src.main;
import src.Gameobjects.*;
import java.util.Scanner;

/**
 * Created by Zimmermann on 04.06.15.
 */
public class Spiel {

    static int eingabezahl;
    static Scanner s = new Scanner(System.in);
    static Spieler[] anzspieler;
    static int anzahlSchiffe;
    static int corvetten;
    static int uboote;
    static int zerstoerer;
    static int fregatten;

    public static void main(String[] args) {  // psv "tab-taste

        menuAusgabe();
    }

    public static void neuesSpiel(){
        spielerErstellen();
        anzahlSchiffeBestimmen();
        schiffeErstellen();
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
                    case 3:
                        System.exit(0);
                    case 4:
                        info();
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

    public static void spielerErstellen(){

        System.out.println("Anzahl Spieler: ");
        int spieler = s.nextInt();

        if (spieler<=1){
            System.out.println("mindestens 2 Spieler sollten es schon sein");
            spielerErstellen();

        }
        else {
            anzspieler = new Spieler[spieler];
            System.out.println("Es sind " + spieler + " Spieler");
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
    }

    public static void info(){
        System.out.println("Willkommen beim Schiffe versenken!");
    }

    public static void spielLaden(){
        System.out.println("Momentan nicht Möglich");
    }

    public static void schiffeErstellen(){
        for (int i=0;i<anzspieler.length;i++){
            anzspieler[i].schiffeErstellen(fregatten, zerstoerer, uboote, corvetten, anzahlSchiffe);
        }
    }

    public static void anzahlSchiffeBestimmen(){
        anzahlSchiffe = 0;
        System.out.println("Anzahl Fregatten: ");
        fregatten = s.nextInt();
        anzahlSchiffe += fregatten;
        System.out.println("Anzahl Zerstoerer: ");
        zerstoerer = s.nextInt();
        anzahlSchiffe += zerstoerer;
        System.out.println("Anzahl Uboote: ");
        uboote = s.nextInt();
        anzahlSchiffe += uboote;
        System.out.println("Anzahl Corvetten: ");
        corvetten = s.nextInt();
        anzahlSchiffe += corvetten;
    }
}