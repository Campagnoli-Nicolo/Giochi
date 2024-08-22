package com.mycompany.proganimali;

public class ProgAnimali 
{
    public static void Mangiare(Pesce p1,Pesce p2)
    {
       if(p1.getGrandezza() > p2.getGrandezza())
        {
            p1.Mangia();
            p2.Mangiato();
        }
        else
        {
            p2.Mangia();
            p1.Mangiato();
        } 
    }
    
    public static void main(String[] args) 
    {
        Pesce p1 = new Pesce(1);
        Pesce p2 = new Pesce(2);
        
        Mangiare(p1,p2);
    }
}
