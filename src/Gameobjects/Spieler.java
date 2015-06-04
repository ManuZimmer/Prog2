package src.Gameobjects;

/**
 * Created by Zimmermann on 27.05.15.
 */
public class Spieler {

    String name;

    public void Spieler(){

    }
    public void setName(String spielername){

        this.name = spielername;
    }

    public String getName(){
        return name;
    }

    public void schiffeErstellen(int fregatten, int zerstoerer, int uboot, int corvette, int anzahlSchiffe){
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