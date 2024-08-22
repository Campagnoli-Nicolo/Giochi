package gioco;

import java.util.ArrayList;

public class Demoni extends AstrattaSpecie implements Male
{
    public static int livello;
    public static final int costo = 60;
    
    public Demoni(String nome, int forza,ArrayList listaMale) 
    {
        super(nome, forza);
        try 
        {
            listaMale.add(this.clone());
        } 
        catch(CloneNotSupportedException ex){}
    }
    
    @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public void setForza() 
    {
        forza = 37 + (3 * livello);
    }

    @Override
    public String getNome() 
    {
       return nome;
    }

    @Override
    public int getForza() 
    {
        return forza;
    }

    @Override
    public void AggiornaLivello() 
    {
       livello++;
    }
    
    public static int getLivello()
    {
        return livello;
    }
    
    @Override
    public String toString()
    {
        return nome + " - " + forza + " - " + livello;
    }
}
