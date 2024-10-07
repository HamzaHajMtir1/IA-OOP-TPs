/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.revision;

/**
 *
 * @author Hamza
 */
public abstract class Client extends Personne implements Homme {
    private int num;
 
    public Client(int num, String nom, String prenom) {
        super(nom, prenom);
        this.num = num;
    }
}
