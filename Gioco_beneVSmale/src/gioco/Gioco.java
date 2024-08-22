package gioco;

public class Gioco 
{
    public static boolean BeneMale()
    {
        boolean temp;
        System.out.println("Stiamo calcolando se sei del bene o del male attendi.....");
        if(Math.random() <= 0.5)
        {
            System.out.println("Il primo giocatore fa parte del bene, il secondo giocatore invece fa parte del male");
            temp = true;
        }
        else
        {
            System.out.println("Il primo giocatore fa parte del male, il secondo giocatore invece fa parte del bene");
            temp = false;
        }
        
        return temp;
    }
    
    public static void Scontro(Magazzino m)
    {
        if (m.Scontro()) 
        {
            System.out.println("Lo schieramento del bene ha vinto con una forza combattiva maggiore");
        }
        else
        {
            System.out.println("Lo schieramento del male ha vinto con una forza combattiva maggiore");
        }
    }
    
    
    public static void main(String[] args) 
    {
        Magazzino m = new Magazzino();
            
            m.InizioGioco(BeneMale());
            Scontro(m);
            
            
        
       
    }
}
