package com.mycompany.progvolume;

public class ProgVolume 
{

    public static void main(String[] args) 
    {
        Parallelepipedo p1 = new Parallelepipedo();
        p1.Volume();
        p1.Stampa();
        
        Cilindro c1 = new Cilindro();
        c1.Volume();
        c1.Stampa();
        
        System.out.println("Il numero di oggetti 3D creati è: " + Oggetti3D.num);

    }
}
