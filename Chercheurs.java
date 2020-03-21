package gestionconference;


import java.util.ArrayList;

class Chercheurs {
    private String nom;
    private String prenom;
    private int age;
    private int CIN;
    private boolean etablis;
    private ArrayList<Theme> T = new ArrayList<>();
    private int solde=0;
    
    public Chercheurs(String n, String p, int age, int CIN ,boolean e , ArrayList<Theme> t ){
        nom=n;
        prenom=p;
        this.age=age;
        this.CIN=CIN;
        T=t;
        etablis=e;
        
    }
   public String getnom(){return(nom);}
   public String getprenom(){return(prenom);}
   public int getage(){return(age);}
   public int getCIN(){return(CIN);}
   public boolean getetablis(){return(etablis);}
   public ArrayList<Theme> getT(){return(T);}
   public int getsolde(){return(solde);}
   public boolean specialiste() {return(T.size()>0);}
    public void ajouteSolde(){
        solde+=1500;
    }
    public void payeConf(){
        solde-=350;
    }
    public void payeTuto(){
        solde-=150;
    }
    public String afficher(){ 
        String s="les themes de specailité sont ";
        if(T.size()!=0){
        for(Theme t:T){
        s=s+" "+t.getnom_theme();}
        return(s);}
        else return("pas de spécialité ");
    }
    public String toString(){
        return("Chercheur : "+nom+" "+prenom+" d'age "+age+" "+afficher());
    }
} 
