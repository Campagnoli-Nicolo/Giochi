
package gioco;

public class Nani extends AstrattaSpecie implements Bene
{
   public static int livello;
   public static final int costo = 27;

    public Nani(String nome, int forza) 
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
        forza = 35 + (4 * livello);
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
