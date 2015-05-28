package main;
import Gameobjects.Spieler;

import java.util.Scanner;

/**
 * Created by Zimmermann on 26.05.15.
 */
public class MenuStart {

    static int eingabezahl;
    static Scanner s = new Scanner(System.in);

    public static void hauptMenu() {
        System.out.println("     1. Neues Spiel");
        System.out.println("     2. Spiel laden");
        System.out.println("     3. Beenden");
        System.out.println("     4. Info");
    }

    public static void neuesSpiel(){
        System.out.println("    Anzahl Spieler:      ");
        int spieler = s.nextInt();
        Spieler[] anzspieler = new Spieler[spieler];
        System.out.println("\nEs sind " + spieler + " Spieler");
        for (int i=0; i<anzspieler.length;i++){
            anzspieler[i] = new Spieler();
            anzspieler
        }

        schiffeSetzen();
    }

    public static void info(){
        System.out.println("Willkommen beim Schiffe versenken!");
    }

    public static void spielLaden(){
        System.out.println("Momentan nicht Möglich");
    }

    public static void schiffeSetzen(){

        System.out.println("    Anzahl Schiffe:     ");
        int schiffe = s.nextInt();
        String[] anzschiffe = new String[schiffe];
        System.out.println("\nEs werden "+schiffe+" Schiffe gesetzt.");
    }
}