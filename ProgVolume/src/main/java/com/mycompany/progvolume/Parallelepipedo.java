package com.mycompany.progvolume;

import java.util.Scanner;

public class Parallelepipedo extends Oggetti3D
{
    private int A,h;
    private double V;
    
    private int AreaBase()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci L'area della base del parallelepipedo");
        A = in.nextInt();
        
        return A;
    }
    
    private int Altezza()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci L'altezza del parallelepipedo");
        h = in.nextInt();           
        
        return h;
    }
    
    Parallelepipedo()
    {
        A = AreaBase();
        h = Altezza();
        num++;
    }
    
    @Override
    void Volume() 
    {
       V = (double)A * (double)h;
    }

    @Override
    void Stampa() 
    {
        System.out.println("Il volume del Parallelepipedo è: " + V);
    }
    
}
