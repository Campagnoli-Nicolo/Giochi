
package com.mycompany.proganimali;

public class Giraffa implements Preda
{
    private final static int zampe = 4;
    
    public static int numZampe()
    {
        return zampe;
    }
    
    @Override
    public void Mangiato() 
    {
        System.out.println("Ciao mi chiamo Zoe e sono stata mangiata");
    }
    
}
