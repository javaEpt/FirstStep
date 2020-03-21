package gestionconference;

import java.text.SimpleDateFormat;

class Participant {
    private int CIN;
    private String nom;
    private String prenom;
    private int somme=350;
    private SimpleDateFormat datearrivéé ;
    private SimpleDateFormat datedépart ;
    
    public Participant(int C,String n,String p  ){
        CIN=C;
        nom=n;
        prenom=p;
        
        
    }
    public void ajoutSommeTuto(){
        somme+=150;
    }
    public String toString(){
        return("Participant : "+nom+" "+prenom+" "+"de date arrivée "+datearrivéé+" de date de départ "+datedépart);
    }
        
}
