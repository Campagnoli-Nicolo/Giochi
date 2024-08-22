
package gioco;

import static gioco.Demoni.livello;
import java.util.ArrayList;

public class Zombie extends AstrattaSpecie implements Male
{
    public static int livello;
    public static final int costo = 40;

    public Zombie(String nome, int forza , ArrayList<Bene>listaBene,ArrayList<Male>listaMale) 
    {
        super(nome,forza);
        if(Math.random() < 0.2 + 0.01 * livello)
        {
            int random = (int)(Math.random() * listaBene.size());
            listaBene.remove(random);
            listaMale.add(new Zombie(nome,forza,listaBene,listaMale));
        }
    }
    
    @Override
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    @Override
    public void setForza() 
    {
        forza = 15 + (5 * livello);
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
