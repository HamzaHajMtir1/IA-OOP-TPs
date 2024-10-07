/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tejrab;

/**
 *
 * @author Hamza
 */
public class Abonnement {
    private String nom;
    private String dateFin;
    private double credit;
    private boolean active;
    
    Abonnement(String nom , String d){
        this.nom = nom;
        dateFin = d;
        credit = 0;
        active = "true";
    }
    
    
    String getNom(){
        return nom;
    }
    double getCredit(){
        return credit;
    }
    public String toString(){
        String s="Abonnrmrnt au nom de :"+nom;
        if(active)
            s+=" , expirant le :"+dateFin+" , credit de : "+credit+"euros";
        else 
            s+=" , carte bloquee";
    

    }
    void crediter(double c){
        credit+=c;
        if(!active) active=true;
    }
    debiter(double m){
        if(Credit <m){
            System.out.println();
            active = false;
        }
        else credit-=m;
        return credit;
    }
}
