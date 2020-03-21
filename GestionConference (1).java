/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconference;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;



class Conference{
    private String nom ;
    private String jourdep="Lundi";
    private ArrayList<Jour> Jours ;
    private ArrayList<Participant> listeinscri ;
    private ArrayList<Chercheurs> listeChercheur ;
    private SimpleDateFormat datedep ;
    private SimpleDateFormat datefin ;
    private Comité comité ;
    
    
   public Conference(String ch){nom=ch ;
   Jours=new ArrayList<Jour>();
   listeinscri=new ArrayList<Participant>();
   listeChercheur=new ArrayList<Chercheurs>();
   
   }
   public void setComité(Comité c){comité=c;}
    
    public void inscrire(Participant p){
         listeinscri.add(p);}  /*inscription d'un participant*/
    
    public void ajouterchercheur(Chercheurs c){listeChercheur.add(c);} /*inscription d'un chercheur */
    
    
    
    /* ajout d'une session l finction hedhi chne5dem beha moch bech nesta3malha fel main 5ater fel main bech ykoun andi des articles o l foncytion ajouter 
    article heya eli bech tesna3 les sessions */
    public void ajoutersession(Session s) { 
        int c=0;/* c bech nestaamlou bech nthabet sar ajout wela le*/
        if(Jours.size()!=0){
        for(Jour J:Jours){
        if (J.getListesession().size()<4) /* ken nhar mezel fih blassa n7otha o naamel break  */{
                J.ajouterSession(s);
                c=1;
                break ;
                }
        
        }}
        /*ken masarech ajout c chyo93od 0 wa9tha lezem nzid nhar jdid */
        if (c==0){
        Jour J=new Jour();
        
        J.ajouterSession(s);
        Jours.add(J);
        }
        
    }
        
       
    /* l fonction hedhi nsit masla7thech bekri */
    public void ajouterTuto(Tutorial t){ 
        int c=0;
        if (t.getP().size()>=10){
         if(Jours.size()!=0){for(Jour j:Jours){
             if(j.gettuto()==null){
                 j.ajoutertuto(t);
                 c=1;
                 break ;
                 
             }
         }}
         if(c==0){
             Jour J=new Jour();
             J.ajoutertuto(t);
             Jours.add(J);
         }
        }
        
    }
    
    /* nthabet est ce que we7ed mel les auteurs 7adher fel conference lkol */
    public boolean present(Article a){
        ArrayList<Chercheurs> l=a.getL();
        for(Chercheurs c:l )
    {
        if(listeChercheur.indexOf(c)!=-1)
                {return(true);
               
                }
    }
    return(false);
    }

    /* te5ou un article o t7otou fel blassa s7i7a fel conference lkol */
    public void ajouterarticle(Article a){
        int c=0;
        if(a.getnote()>=1.5)
          {      
              
              if(present(a)){
                  
                  for(Jour J:Jours){
                   
                      ArrayList<Session> ls=J.getListesession();
                      for(Session s:ls){ /* ken l9it session feha blassa o andha nafs theme n7otou o doub mayet7at naamel break o c=1 */
                         if(s.getsum_art()<4 && s.getTheme_session()==a.getDomaine()){
                                                                                         s.ajouteArticle(a);
                                                                                         c=1;
                                                                                         break ;
                                                                                         }
                         
                         }
                      /*ken c==0 maaneha mal9itlouch blssa nesna3 session jdida o n7otou feha o n7ot session bkol fel conference*/
                      
                      }
                  if(c==0){
                          Session s=new Session(a.getDomaine());
                          s.ajouteArticle(a);
                          ajoutersession(s);
                  }
              }
              
     
              }
           }
public String afficher(){
    String ch="une conference : "+nom;
    if(Jours.size()!=0)
        
    {for(Jour J:Jours){
        ch=ch+J.toString();
    }}
    return(ch);
}    

}
    
    
    


