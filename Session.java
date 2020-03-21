package gestionconference;

class Session {
    private int sum_art=0;
    private Theme Theme_session;
    private Article A[]=new Article[3];
    
    public Session( Theme t){

        Theme_session=t;
    }
    public Theme getTheme_session(){return(Theme_session);}
    public Article[] getA(){return(A);}
    
    public void ajouteArticle(Article art){
        A[sum_art]=art;
        sum_art+=1;
    }
    public int getsum_art(){return(sum_art);}
    public String toString(){
        String ch="\n Une session de "+sum_art+" articles :\n";
        if(sum_art!=0){
        for(int i=0;i<sum_art;i++){
            ch=ch+A[i].toString();
        }}
        return(ch);
    }
}
