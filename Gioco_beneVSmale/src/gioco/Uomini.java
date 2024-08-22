
package gioco;

import static gioco.Demoni.livello;

public class Uomini extends AstrattaSpecie implements Bene
{
    public static int livello;
    public static final int costo = 50;
    
    public Uomini(String specie,int forza)
    {
        super(specie,forza);
    }


    @Override
    public void setForza() 
    {
        forza = 55 + (6 * livello);
    }

    @Override
    public int getForza() 
    {
        return forza;
    }

    @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public String getNome() 
    {
        return nome;
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
    public String toString() {
       return nome + " - " + forza + " - " + livello;
    }
    
}
