/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer1;

/**
 *
 * @author Hamza
 */
public class Crayon {
    private int epaisseur;
    private int longeure;

    public Crayon(int epaisseur, int longeure) {
        this.epaisseur = epaisseur;
        this.longeure = longeure;
    }
    public void changer_longeure(int longeure)
    {
        if (longeure >=0)
            this.longeure=longeure;
        else
            System.out.println("la longeure est négative");   
    }
    public void changeEpaisseur(int epaisseur)
    {
        if(epaisseur >0)
            this.epaisseur=epaisseur;
        else
            System.out.println("l'epaisseur est négative");
    }
    
    public String description()
    {
        return("la longeure egale "+longeure+" et l'epaisseur egale "+epaisseur);
    }
    
    
}
