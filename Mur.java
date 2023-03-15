/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.devisbatiment;

/**
 *
 * @author Elève
 */
public class Mur {
    Coin coindebut;
    Coin coinfin;
    int idcoin;

    public Mur(Coin coindebut, Coin coinfin, int idcoin) {
        this.coindebut = coindebut;
        this.coinfin = coinfin;
        this.idcoin = idcoin;
        
        
    }

    public Coin getCoindebut() {
        return coindebut;
    }

    public Coin getCoinfin() {
        return coinfin;
    }

    public int getIdcoin() {
        return idcoin;
    }
    
    
    
    
}
