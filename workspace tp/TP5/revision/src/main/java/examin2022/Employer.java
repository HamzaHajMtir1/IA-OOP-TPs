/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examin2022;

/**
 *
 * @author Hamza
 */
public interface Employer {
    public void add(Employer employer);
    public void remove(Employer employer);
    public Employer getChild(int i);
    public String getName();
    public double getSalary();
    public void print();
}
