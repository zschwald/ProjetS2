/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.devisbatiment;

/**
 *
 * @author Elève
 */
public class Coin {
    private double px;
    private double py;
    private int idcoin;

    public Coin(double px, double py, int id) {
        this.px = px;
        this.py = py;
        this.idcoin = id;
    }

    public double getPx() {
        return px;
    }

    public double getPy() {
        return py;
    }

    public int getId() {
        return idcoin;
    }
    

    public void setPx(double px) {
        this.px = px;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public void setId(int id) {
        this.idcoin = id;
    }

    @Override
    public String toString() {
        return "Coin{" + "px=" + px + ", py=" + py + ", idcoin=" + idcoin + '}';
    }
    
    
    
}
