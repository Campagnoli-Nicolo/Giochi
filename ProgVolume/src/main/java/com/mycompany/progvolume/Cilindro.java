package com.mycompany.progvolume;

import java.util.Scanner;

public class Cilindro extends Oggetti3D
{
    private int h;
    private double V,A;
    
    private double Raggio()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il raggio del cilindro");
        A = in.nextDouble();
        
        return A;
    }
    
    private int Altezza()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci L'altezza del parallelepipedo");
        h = in.nextInt();           
        
        return h;
    }
    
    Cilindro()
    {
        A = Raggio();
        h = Altezza();
        num++;
    }
    
    @Override
    void Volume() 
    {
       A = (A*A)*Math.PI;
       V = A * (double)h;
    }

    @Override
    void Stampa() 
    {
        System.out.println("Il volume del cilindro è: " + V);
    }
}
