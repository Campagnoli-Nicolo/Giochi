package gioco;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Magazzino 
{
    private int moneteB = 3000;
    private int moneteM = 3000;
    private int forzaBene = 0;
    private int forzaMale = 0;
    private ArrayList<Bene> bene;
    private ArrayList<Male> male;
    
    public Magazzino()
    {
        bene = new ArrayList<>();
        male = new ArrayList<>();
    }
    
    public void setMoneteBene(int moneteB)
    {
        this.moneteB = moneteB;
    }
    
    public void setMoneteMale(int moneteM)
    {
        this.moneteM = moneteM;
    }
    
    public int getMoneteBene()
    {
        return moneteB;
    }
    
    public int getMoneteMale()
    {
        return moneteM;
    }
    
    public void setBene()
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        int opz = 0;
        String temp;
        boolean err;
        
        do 
        {
            System.out.println("Cosa vuoi fare nel tuo turno:");
            System.out.println("1) Comprare un soldato");
            System.out.println("2) Aumentare di livello");
            System.out.println("3) Evocare gli Dei");
            
            try 
            {
                temp = in.readLine();
                opz = Integer.parseInt(temp);
                err = false;
            }
            catch (IOException ex) {err = true;}
            
            switch(opz)
            {
                case 1: CompraSoldatoBene();
                return;
                   
                case 2: AggiungiLivello();
                    return;
                    
                case 3: AggiungiDei();
                    return;
            }
            
        } 
        while(opz != 4 || err);
        
        
    }
    
    public void InizioGioco(boolean turno)
    {
        while(moneteB > 100 && moneteM > 100)    
        {
            if (turno) 
            {
                turno = false;
                setBene();
            }
            else
            {
                turno = true;
                setMale();
            } 
        }
    }
    
    public void setMale()
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        int opz = 0;
        String temp;
        boolean err;
        
        do 
        {
            System.out.println("Cosa vuoi fare nel tuo turno:");
            System.out.println("1) Comprare un soldato");
            System.out.println("2) Aumentare di livello");
            System.out.println("3) Visualizza esercito");
            
            try 
            {
                temp = in.readLine();
                opz = Integer.parseInt(temp);
                err = false;
            }
            catch (IOException ex) {err = true;}
            
            switch(opz)
            {
                case 1: CompraSoldatoMale();
                    return;
                
                case 2: AggiungiLivello();
                    return;
                    
                case 3: VisualizzaMale();
                    return;
            }
            
        } 
        while(opz != 4 || err);
        
        
    }
    
    public void CompraSoldatoBene()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int opz = 0;
        String temp;
        boolean err,turno = false;
        
        do 
        {
            System.out.println("Inserisci la specie del soldato che vuoi comprare (Monete rimanenti: " + moneteB + ")");
            System.out.println("1) Umano");
            System.out.println("2) Elfo");
            System.out.println("3) Nano");
            
            try 
            {
                temp = in.readLine();
                opz = Integer.parseInt(temp);
                err = false;
            }
            catch (IOException ex) {err = true;}
            
            switch(opz)
            {
                case 1: AggiungiUomini();
                    break;
                case 2: AggiungiElfi(); 
                    break;
                case 3: AggiungiNani();
                    break;                    
            }
            turno = true;
        } 
        while(!turno);
}
    
    public void CompraSoldatoMale()
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int opz = 0;
        String temp;
        boolean err,turno = false;
        
        do 
        {
            System.out.println("Inserisci la specie del soldato che vuoi comprare (Monete rimanenti: " + moneteM + ")");
            System.out.println("1) Orco");
            System.out.println("2) Demone");
            System.out.println("3) Zombie");
            
            try 
            {
                temp = in.readLine();
                opz = Integer.parseInt(temp);
                err = false;
            }
            catch (IOException ex) {err = true;}
            
            switch(opz)
            {
                case 1: AggiungiOrco();
                    break;
                case 2: AggiungiDemone(); 
                    break;
                case 3: AggiungiZombie();
                    break;                    
            }
            
            turno = true;
        } 
        while(!turno);
        
        
        
    }
    
    public void AggiungiLivello()
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        String specie = "";
        
        System.out.println("inserisci la specie di cui vuoi aumentare il livello (Monete rimanenti: " + moneteB + ")");
        try 
        {
            specie = in.readLine();
        } 
        catch (IOException ex) {}
        
        if (specie.equalsIgnoreCase("uomini") && moneteB > (100 + 20)*Uomini.getLivello()) 
        {
            Uomini u = new Uomini("",0);
            u.AggiornaLivello();
            System.out.println("Il livello degli uomini è stato aumentato corretamente");
        }
        
        if (specie.equalsIgnoreCase("elfi") && moneteB > (100 + 20)*Elfi.getLivello()) 
        {
            Elfi e = new Elfi("",0);
            e.AggiornaLivello();
            System.out.println("Il livello degli elfi è stato aumentato corretamente");
        }
          if (specie.equalsIgnoreCase("nani") && moneteB > (100 + 20)*Uomini.getLivello()) 
        {
            Nani n = new Nani("",0);
            n.AggiornaLivello();
            System.out.println("Il livello dei nani è stato aumentato corretamente");
        }
    }
    
    public void AggiungiDei()
    {
        BufferedReader in  = new BufferedReader(new InputStreamReader(System.in));
        String temp = "";
        
        System.out.println("Monete rimanenti: " + moneteB + " sei sicuro di volerlo fare?");
        try 
        {
            temp = in.readLine();
        } 
        catch (IOException ex) {}
        
        if (temp.equalsIgnoreCase("si")) 
        {
            moneteB -= 250;
            
            if (Math.random() <= 0.35)
            {
                Dei d = new Dei("dio",500);
                bene.add(d);
                forzaBene += d.forza;
            }
            else
            {
                System.out.println("Dio purtroppo non e' riuscito a darti una mano");
            }
        }
    }
    
    public void AggiungiUomini()
    {
        if (moneteB < Uomini.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Uomini u1 = new Uomini("Uomo",0);
            u1.setForza();
            u1.AggiornaLivello();
            moneteB -= Uomini.costo;
            bene.add(u1);  
            u1.forza = u1.getForza()+(6*Uomini.getLivello());
            forzaBene += u1.forza;
        }
        
        
    }
    public void AggiungiElfi()
    {
        if (moneteB < Elfi.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Elfi e1 = new Elfi("Elfi",0);
            e1.setForza();
            e1.AggiornaLivello();
            moneteB -= Elfi.costo;
            bene.add(e1);
            e1.forza = e1.getForza() + (15*Elfi.getLivello());
            forzaBene += e1.forza;
            
        }
       
    }
    public void AggiungiNani()
    {
        if (moneteB < Nani.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Nani n1 = new Nani("Nano",0);
            n1.setForza();
            n1.AggiornaLivello();
            moneteB -= Nani.costo;
            bene.add(n1); 
            n1.forza = n1.getForza() + (5*Nani.getLivello());
            forzaBene += n1.forza;
        }
        
    }

    public void AggiungiOrco() 
    {
        if (moneteM < Orchi.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Orchi o1 = new Orchi("orco",0);
            o1.setForza();
            o1.AggiornaLivello();
            moneteM -= Orchi.costo;
            male.add(o1);  
            o1.forza = o1.getForza()+(6*Orchi.getLivello());
            forzaMale +=o1.forza;
        }
    }

    public void AggiungiDemone() 
    {
        if (moneteM < Demoni.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Demoni d1 = new Demoni("demoni",0,male);
            d1.setForza();
            d1.AggiornaLivello();
            moneteM -= Demoni.costo;
            male.add(d1);  
            d1.forza = d1.getForza() + (3*Demoni.getLivello());
            forzaMale += d1.forza;
            
        }
    }

    public void AggiungiZombie() 
    {
        if (moneteM < Zombie.costo) 
        {
            System.out.println("Mi spiace ma non hai abbastanza monete per fare questa operazione");
            return;
        }
        else
        {
            Zombie z1 = new Zombie("zombie",0,bene,male);
            z1.setForza();
            z1.AggiornaLivello();
            moneteM -= Zombie.costo;
            male.add(z1);  
            z1.forza = z1.getForza() + (5*Zombie.getLivello());
            forzaMale += z1.forza;
        }
    }
    
    public void VisualizzaBene()
    {          
        for(Bene b : bene)
        {
            System.out.println(b);
        }
    }
    
    public void VisualizzaMale()
    {
        for(Male m : male)
        {
            System.out.println(m.toString());
        }
    }
    
    public boolean Scontro()
    {
        boolean ctrl;
        
        if(forzaBene > forzaMale)
        {
            ctrl = false;
        }
        else
        {
            ctrl = true;
        }
        
        return ctrl;
    }
    
    
    
    
    
}
