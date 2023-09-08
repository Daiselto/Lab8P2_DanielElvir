/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_danielelvir;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Pais {
    private String Nombre;
    private ArrayList<Nadador> nadadores = new ArrayList();
    private int numMedallas;

    public Pais() {
    }

    public Pais(String Nombre, int numMedallas) {
        this.Nombre = Nombre;
        this.numMedallas = numMedallas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Nadador> getNadadores() {
        return nadadores;
    }

    public void setNadadores(ArrayList<Nadador> nadadores) {
        this.nadadores = nadadores;
    }

    public int getNumMedallas() {
        return numMedallas;
    }

    public void setNumMedallas(int numMedallas) {
        this.numMedallas = numMedallas;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
