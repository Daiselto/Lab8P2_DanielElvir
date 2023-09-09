/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_danielelvir;

import javax.swing.JProgressBar;

/**
 *
 * @author HP
 */
public class HiloNadador3 extends Thread{
    private JProgressBar progBar;
    private int avanz;
    private boolean vive=true;
    private boolean avanzar=true;
    private Nadador Nadador1;

    public HiloNadador3(JProgressBar progBar, int avanz, Nadador Nadador1) {
        this.progBar = progBar;
        this.avanz = avanz;
        this.Nadador1 = Nadador1;
    }

    public HiloNadador3() {
    }   

    public JProgressBar getProgBar() {
        return progBar;
    }

    public void setProgBar(JProgressBar progBar) {
        this.progBar = progBar;
    }

    public int getAvanz() {
        return avanz;
    }

    public void setAvanz(int avanz) {
        this.avanz = avanz;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            if(avanzar){
                progBar.setValue(progBar.getValue()+1);
                if(progBar.getValue()==avanz){
                    vive=false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
            }
        }
}
}
