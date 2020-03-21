/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionconference;

import java.text.SimpleDateFormat;
import java.util.ArrayList;


import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

class Jour{
    
    private String nomJour ;
    private ArrayList<Session> listesession ;
    private Tutorial tuto=null;
    private SimpleDateFormat date ;
    public Jour(){
       listesession=new ArrayList<Session>();
        
    }
    
    public void ajouterSession(Session s) {listesession.add(s);} /*un simple ajout de session */
    
    public ArrayList<Session> getListesession(){return(listesession);}
    
    public Tutorial gettuto(){return(tuto);}
    
    public void ajoutertuto(Tutorial t){tuto=t;}
    
    public String toString(){
        String ch="\n jour contient "+listesession.size()+" sessions :\n";
        if (listesession.size()!=0){
        for(Session s:listesession){
            ch=ch+s.toString();
        }}
        if(tuto!=null){
        ch=ch+tuto.toString();
        return(ch);}
        else{ch=ch +" pas de tutorial ";
        return(ch);
        }
    }
    
}
