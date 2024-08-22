
package com.mycompany.proganimali;

public class Leone implements Predatore
{
    private final static int zampe = 4;
    
    public static int NumZampe()
    {
      return zampe;  
    }

    @Override
    public void Mangia() 
    {
        System.out.println("Ciao mi chiamo Leo e mangio tutti");
    }
    
    
}
