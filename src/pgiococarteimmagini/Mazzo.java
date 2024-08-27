/*    🃏 Benvenuto! nel gioco di memoria con le carte 🃏
 🃏 Ti verrano mostrate 5 carte per pochi secondi, 
 🃏 dopodichè al click del mouse sul mazzo/tavolo da gioco pescherai  
 🃏 quando ritieni di aver individuato 1 delle 5 carte 
 🃏 clicca sul titolo!, ATTENZIONE hai solo una possibilità.
 🃏🃏🃏🃏🃏🃏                    BY Marco Perrotta                🃏🃏🃏🃏🃏🃏
 */
package pgiococarteimmagini;

import java.util.ArrayList;

/**_______🙈🙉🙊_________
 * @author perrotta 🃏 *
 *____________________*/
public class Mazzo 
{

   private ArrayList <Carta> mazzo;

    public ArrayList<Carta> getMazzo() {
        return mazzo;
                                       }

    public void setMazzo(ArrayList<Carta> mazzo) {
        this.mazzo = mazzo;
                                                 }

    public Mazzo() {
        mazzo=new ArrayList(40);
         String[] seme={"♠", "♣", "♥", "♦"};
         
         int conta=0;
         int i;
         int j = 0;
         for (i=1;i<11;i++)
         {
             for (j=0;j<4;j++ )
             {  conta++; 
                 mazzo.add(new Carta(i,seme[j],conta+".png"));
             }
         }
                               
                   }
    
    public void mescola()
    { 
        int estrai1=20,estrai2=30;
    Carta estratta1,estratta2;
        for (int i=1;i<40;i++) //MESCOLA PER 40 VOLTE
        {
            estrai1=(int)(Math.random()*40);
            estrai2=(int)(Math.random()*40);
            estratta1=mazzo.get(estrai1);
            estratta2=mazzo.get(estrai2);    
            mazzo.add(estrai1,estratta2);
             mazzo.remove(estratta2);
            mazzo.add(estrai2,estratta1);
             mazzo.remove(estratta1);
           
        }    
    }
    
    public void estraCarta(){
        Carta estratta;       
        estratta=mazzo.get((int)(Math.random()*40)+1);
                             }
    
   public Carta estraiCartaDellAmmmore(int i) // Metodo Principale del gioco...
   {       
       Carta estratta;       
       estratta=mazzo.get(i);     
        return estratta; //per la stampa ecc..
   }
    @Override
    public String toString() {
        return "Mazzo{" + "mazzo=" + mazzo + '}';
                             }
   
}
