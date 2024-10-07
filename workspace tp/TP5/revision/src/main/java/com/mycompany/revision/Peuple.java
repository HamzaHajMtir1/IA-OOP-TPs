/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author Hamza
 */
public class Peuple {
    private Homme [] paye = new Homme[100];
    private int nbHomme;
    public void naissance(Homme H){
        paye[nbHomme] = H;
        nbHomme++;
    }
    public void explorer(){
        for(int i=0 ;i<paye.length ;i++){
            paye[i].identiter();
        }
    }
}
