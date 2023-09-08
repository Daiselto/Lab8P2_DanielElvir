/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_danielelvir;

/**
 *
 * @author HP
 */
public class Evento {
    private String estiloNatacion;
    private int Distancia;
    private int recordActual;

    public Evento(String estiloNatacion, int Distancia, int recordActual) {
        this.estiloNatacion = estiloNatacion;
        this.Distancia = Distancia;
        this.recordActual = recordActual;
    }

    public Evento() {
    }

    public String getEstiloNatacion() {
        return estiloNatacion;
    }

    public void setEstiloNatacion(String estiloNatacion) {
        this.estiloNatacion = estiloNatacion;
    }

    public int getDistancia() {
        return Distancia;
    }

    public void setDistancia(int Distancia) {
        this.Distancia = Distancia;
    }

    public int getRecordActual() {
        return recordActual;
    }

    public void setRecordActual(int recordActual) {
        this.recordActual = recordActual;
    }

    @Override
    public String toString() {
        return estiloNatacion+", "+Distancia+"m, "+recordActual+"s";
    }
    
    
}
