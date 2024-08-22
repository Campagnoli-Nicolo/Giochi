package gioco;

public class Dei extends AstrattaSpecie implements Bene
{

    public Dei(String nome, int forza) 
    {
        super(nome, forza);
    }

  @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public void setForza() 
    {
        forza = 500;
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
    public void AggiornaLivello() {}

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
