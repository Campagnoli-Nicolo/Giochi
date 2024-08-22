
package gioco;

public abstract class AstrattaSpecie 
{
    protected String nome;
    protected int forza;
     
    public AstrattaSpecie(String nome,int forza)
     {
        this.nome = nome;
        this.forza = forza;
     }
     
    public abstract void setNome(String nome);
   
    public abstract void setForza();
    
    public abstract String getNome();
    
    public abstract int getForza();
    
    public abstract String toString();
            
}
