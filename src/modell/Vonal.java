/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modell;


public class Vonal {
    private int hossz;
    private int eltolas;
    
    public enum Szinek{PIROS, KEK, ZOLD, FEKETE};
    public enum Stilusok{SZIMPLA, DUPLA, PONT};
    
    private Szinek szin;
    private Stilusok stilus;
    
    public Vonal(int hossz) throws Exception{
       this(hossz, 0, Szinek.ZOLD, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas) throws Exception{
        this(hossz, eltolas, Szinek.ZOLD, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Szinek szin) throws Exception{
        this(hossz, eltolas, szin, Stilusok.SZIMPLA);
    }
    public Vonal(int hossz, int eltolas, Szinek szin, Stilusok stilus) throws Exception{
        if(hossz < 1){
            throw new Exception("Nem lehet rövidebb mint 0!");
        }
        if(eltolas < 0){
            throw new Exception("Hibás eltolás!");
        }
        this.hossz=hossz;
        this.eltolas=eltolas;
        this.stilus=stilus;
        this.szin=szin;
    }
    
    public void eltolas(int egyseg) throws Exception{
        if(egyseg < 0){
            throw new Exception("Hibás eltolás!");
        }
        this.eltolas=egyseg;
    }
    public int getHossz(){
        return hossz;
    }
    public int getEltolas(){
        return eltolas;
    }
    public Szinek getSzin(){
        return szin;
    }
    public Stilusok getStilus(){
        return stilus;
    }
    public String vonalAbra(){
        String jel = "-";
        if(stilus == Stilusok.PONT){
            jel = ".";
        }else if(stilus == Stilusok.DUPLA){
            jel = "=";
        }
        
        String szinKod = "\u001B[30m";
        switch(szin){
            case PIROS:
                szinKod = "\u001B[31m";
                break;
            case KEK:
                szinKod = "\u001B[34m";
                break;
            case ZOLD:
                szinKod = "\u001B[32m";
                break;
        }
        String kep = " ".repeat(eltolas) + jel.repeat(hossz);
        return szinKod + kep;
    }
}
