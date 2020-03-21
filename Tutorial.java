package gestionconference;


import java.util.ArrayList;

class Tutorial {
    private Chercheurs Expert;
    private int duree ; /*nombre de minute , maximum 3600 minutes*/
    private Theme Theme_tut; 
    private ArrayList<Chercheurs> C = new ArrayList<>();
    private ArrayList<Participant> P = new ArrayList<>();
    

    public Tutorial(Chercheurs C1,int d, Theme t){
        Expert=C1;
        
        duree=d;
        Theme_tut=t;
    }
    public Chercheurs getExpert(){return(Expert);}
    public ArrayList<Chercheurs> getC(){return(C);}
    public ArrayList<Participant> getP(){return(P);}
    public Theme getTheme_tut(){return(Theme_tut);}
    public int getduree(){return(duree);}
    
    void ajoutCherc(Chercheurs C1){
        C.add(C1);
        C1.payeTuto();
    }
    
    void ajoutPart(Participant P1){
        P.add(P1);
        P1.ajoutSommeTuto();
    }
    
    public boolean assuré(){
        int m=C.size()+P.size();
        if (m>9)
           {   Expert.ajouteSolde();
               return(true);
           
           }
        else return(false);
    }
    public String toString(){
        
        String s="";
     for(Chercheurs c:C){
         s=s+c.toString()+"\n";
     }
     for(Participant  c:P){
         s=s+c.toString()+"\n";
     }
     
        return("\n tutorial de theme "+Theme_tut.getnom_theme()+" assuré par "+Expert.getnom()+" \n la liste des personnes présentes :"+ s);
    }
  
}
