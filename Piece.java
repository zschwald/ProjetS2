/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insa.devisbatiment;

/**
 *
 * @author Elève
 */
public class Piece {
   Coin C1;
   Coin C2;

    public Piece(Coin C1, Coin C2) {
        this.C1 = C1;
        this.C2 = C2;
        
        int x1= getPx().C1;
        int y1= getPy().C1;
        int x2= getPx().C2;
        int y2= getPy().C2;
        
        Coin C3 = new.Coin(x1,y2,3);
        Coin C4 = new.Coin(x2,y1,4);
        
        Mur M1= new.Mur (C1,C4,1);
        Mur M2= new.Mur (C1,C3,2);
        
        
        
    }
   
    
}
