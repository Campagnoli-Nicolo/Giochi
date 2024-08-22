
package com.mycompany.proganimali;

import java.util.Scanner;

public class Pesce implements Predatore,Preda
{ 
    private int grandezza;
    private int id;
    
    private int Grandezza()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci un numero da 1 a 10 in base alla grandezza del pesce");
        
        return in.nextInt();
    }
    
    public int getGrandezza()
    {
        return grandezza; 
    }
    
    Pesce(int id)
    {
        grandezza = Grandezza();
        this.id = id;
    }
    
    @Override
    public void Mangia() 
    {
        System.out.println("Il pesce " + id + " ha mangiato l'altro pesce perchè più grosso");
    }

    @Override
    public void Mangiato() 
    {
        System.out.println("Il pesce " + id + " è stato mangiato dall'altro pesce perchè più piccolo");
    }
    
}
