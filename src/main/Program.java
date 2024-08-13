/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Vonal;
import modell.Vonal.Szinek;


public class Program {
    public static void main(String[] args) {
        try {
            Vonal vnl0 = new Vonal(2);
            bemutato("vnl0", vnl0);
            
            Vonal vnl1 = new Vonal(2,2);
            bemutato("vnl1", vnl1);
            
            Vonal vnl2 = new Vonal(3,2, Szinek.PIROS);
            bemutato("vnl2", vnl2);
            
            Vonal vnl3 = new Vonal(4, 3, Szinek.KEK, Vonal.Stilusok.DUPLA);
            bemutato("vnl3", vnl3);
            
            Vonal vnl4 = new Vonal(6, 4, Szinek.PIROS, Vonal.Stilusok.PONT);
            bemutato("vnl4", vnl4);
            
            Vonal nincs0 = new Vonal(0,3, Szinek.KEK);
            
        } catch (Exception ex) {
            System.out.println("*** Hiba oka:");
            System.out.println(ex.getMessage());
        }
               
    }
    private static void bemutato(String nev, Vonal vnl) {
        System.out.println(nev + ": ");
        System.out.println(vnl.vonalAbra());
    }
}
