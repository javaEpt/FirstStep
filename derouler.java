/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconference;

import java.util.ArrayList;

/**
 *
 * @author Cyberio
 */
class Derouler {
public static void main(String [] args){
    Conference conf=new Conference("algo");
    
    Theme th1=new Theme("algor");
    Theme th2=new Theme("algogggr");
    Theme th3=new Theme("dal");
    ArrayList<Theme> themes=new ArrayList<Theme>();
    themes.add(th1);
    themes.add(th2);
    
    Chercheurs c1=new Chercheurs("rémi","skd",50,798787,true,themes);
    Tutorial t=new Tutorial(c1,2,th1);
    conf.ajouterTuto(t);
    Chercheurs c2=new Chercheurs("salma","sddkd",40,75598787,false,themes);
    ArrayList<Chercheurs> ch=new ArrayList<Chercheurs>();
    ch.add(c2);
    Article a=new Article("art",th1,ch);
    a.ajouteNote(c1,2);
    a.calNote();
    System.out.println(a);
    ch.add(c1);
    Comité c=new Comité("comité1",ch);
    System.out.println(c);
    conf.setComité(c);
    conf.ajouterchercheur(c1);
    conf.ajouterchercheur(c2);
    conf.ajouterarticle(a);
    Article a1=new Article("arrtt",th1,ch);
    a1.ajouteNote(c1,2);
    a1.ajouteNote(c2,3);
    a1.calNote();
    
    conf.ajouterarticle(a1);
    Article a2=new Article("arrtt",th3,ch);
    a2.ajouteNote(c1,2);
    a2.ajouteNote(c2,2);
    a2.calNote();
    
    conf.ajouterarticle(a2);
    Tutorial tt=new Tutorial(c1,3,th1);
    Participant p1=new Participant(1,"hh","hd");
    Participant p2=new Participant(1,"hh","hd");
    Participant p3=new Participant(1,"hh","hd");
    Participant p4=new Participant(1,"hh","hd");
    Participant p5=new Participant(1,"hh","hd");
    Participant p6=new Participant(1,"hh","hd");
    Participant p7=new Participant(1,"hh","hd");
    Participant p8=new Participant(1,"hh","hd");
    Participant p9=new Participant(1,"hh","hd");
    Participant p10=new Participant(1,"hh","hd");
    Participant p11=new Participant(1,"hh","hd");
    conf.inscrire(p9);
    tt.ajoutPart(p1);
    tt.ajoutPart(p2);
    tt.ajoutPart(p3);
    tt.ajoutPart(p4);
    tt.ajoutPart(p5);
    tt.ajoutPart(p6);
    tt.ajoutPart(p7);
    tt.ajoutPart(p8);
    tt.ajoutPart(p9);
    tt.ajoutPart(p10);
    tt.ajoutPart(p11);
    conf.ajouterTuto(tt);
    Tutorial ttt=new Tutorial(c2,3,th2);
    ttt.ajoutPart(p1);
    ttt.ajoutPart(p2);
    ttt.ajoutPart(p3);
    ttt.ajoutPart(p4);
    ttt.ajoutPart(p5);
    ttt.ajoutPart(p6);
    ttt.ajoutPart(p7);
    ttt.ajoutPart(p8);
    ttt.ajoutPart(p9);
    ttt.ajoutPart(p10);
    ttt.ajoutPart(p11);
    conf.ajouterTuto(ttt);
    
    
    System.out.println(conf.afficher());
    
    
    
}
    
}
