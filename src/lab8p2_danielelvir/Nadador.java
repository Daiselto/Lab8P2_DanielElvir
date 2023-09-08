/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_danielelvir;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Nadador implements Serializable{
    private String Nombre;
    private Pais Nacionalidad;
    private int Edad;
    private double Estatura;
    private String estiloNatacion;
    private int DistanciaCompetirá;
    private int tiempoMásRapido;
    private int numMedallas;

    public Nadador() {
    }

    public Nadador(String Nombre, Pais Nacionalidad, int Edad, double Estatura, String estiloNatacion, int DistanciaCompetirá, int tiempoMásRapido, int numMedallas) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Edad = Edad;
        this.Estatura = Estatura;
        this.estiloNatacion = estiloNatacion;
        this.DistanciaCompetirá = DistanciaCompetirá;
        this.tiempoMásRapido = tiempoMásRapido;
        this.numMedallas = numMedallas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Pais getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(Pais Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getEstatura() {
        return Estatura;
    }

    public void setEstatura(double Estatura) {
        this.Estatura = Estatura;
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistanciaCompetirá() {
        return DistanciaCompetirá;
    }

    public void setDistanciaCompetirá(int DistanciaCompetirá) {
        this.DistanciaCompetirá = DistanciaCompetirá;
    }

    public int getTiempoMásRapido() {
        return tiempoMásRapido;
    }

    public void setTiempoMásRapido(int tiempoMásRapido) {
        this.tiempoMásRapido = tiempoMásRapido;
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
