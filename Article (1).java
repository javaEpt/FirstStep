package gestionconference;


import java.util.ArrayList;

class Article {
  private   String titre;
   private  Theme Domaine;
    private ArrayList<Chercheurs> L = new ArrayList<>();
    private ArrayList<Chercheurs> C = new ArrayList<>();
    private int N[]=new int[50];
    private double note=0.0;

    public String gettitre(){return(titre);}
    public Theme getDomaine(){return(Domaine);}
    public ArrayList<Chercheurs> getL() {return(L);}
    public ArrayList <Chercheurs> getC(){return(C);}
    public double getnote(){return(note);}
public Article(String nom,Theme t , ArrayList<Chercheurs> l ){
    titre=nom;
    Domaine=t;
    L=l;
    
}

public void ajouteChercheur(Chercheurs c){
    L.add(c);
}
public void ajouteNote(Chercheurs c,int val){
    C.add(c);
    N[C.size()-1]=val;
}
public String toString(){
    String s="";
    for(Chercheurs c:L){
         s=s+c.toString()+"\n";
     }
    String ch="";
    for(Chercheurs c:C){
         ch=ch+c.toString()+"\n";
     }
    return("article : "+titre+" de theme :"+Domaine.getnom_theme()+" écrit par : \n"+s+"corrigé par "+ch+" ayant comme note finale  "+getnote());
}
public void calNote(){
    if(C.size()>=2){
   
    double m=0;
    for(Chercheurs c:C){
       int test=0;
        for(Theme t:c.getT()){
            if(t==Domaine){test=1;
                          break ;}
                            }
        if (test==1){note+=N[C.indexOf(c)];
        m+=1;
        }
        else{note+=N[C.indexOf(c)]*0.5;
          m+=0.5;
        }
    }
    note=note/m;
  
}
    else note=N[0];
}
}   
