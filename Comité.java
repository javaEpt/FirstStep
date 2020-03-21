package gestionconference;

import java.util.ArrayList;
 class Comité  {
 private String nom ;
 private ArrayList<Chercheurs> menbre=new ArrayList<Chercheurs>() ;
 public Comité(String n,ArrayList<Chercheurs> c){
     nom=n;
     menbre=c;
     
 }
 public Comité(String n){
     nom=n;
     
 }
 public void ajoutermenbre(Chercheurs c){
     if((c.getetablis())&& c.specialiste()){
         menbre.add(c);         
     }
 }
 public String toString(){
     String s="les menbres de cette comité sont ";
     for(Chercheurs c:menbre){
         s=s+c.toString()+"\n";
     }
     return(s);
 }
}
