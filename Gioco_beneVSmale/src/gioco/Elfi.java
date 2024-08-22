
package gioco;

import static gioco.Demoni.livello;

public class Elfi extends AstrattaSpecie implements Bene
{
    private static int livello;
    public static final int costo = 40;
    
    public Elfi(String nome,int forza)
    {
        super(nome,forza);
    }
    
    @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public void setForza() 
    {
        forza = 20 + (15 * livello);
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
    public String toString() {
        return nome + " - " + forza + " - " + livello;
    }
    
}
