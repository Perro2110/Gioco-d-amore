/*    🃏 Benvenuto! nel gioco di memoria con le carte 🃏
 🃏 Ti verrano mostrate 5 carte per pochi secondi, 
 🃏 dopodichè al click del mouse sul mazzo/tavolo da gioco pescherai  
 🃏 quando ritieni di aver individuato 1 delle 5 carte 
 🃏 clicca sul titolo!, ATTENZIONE hai solo una possibilità.
 🃏🃏🃏🃏🃏🃏                    BY Marco Perrotta                🃏🃏🃏🃏🃏🃏
 */
package pgiococarteimmagini;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import static pgiococarteimmagini.GrandeInizio.jf;

/**_______🙈🙉🙊_________
 * @author perrotta 🃏 *
 *____________________*/
public class Gioco extends Canvas implements MouseListener
{
    Mazzo m;
    ArrayList <Carta> CarteDaRicordare= new ArrayList <Carta>();   
int i=0;
   
public void setI(int i) {
        this.i = i;
                        }
    
   Carta c,g;
   Carta e= new Carta(99,"BackCard","back.png");
      
    int estratta;
    public Gioco(){
        
     m=new Mazzo();
     
       System.out.println(m.toString());
        m.mescola(); 
       System.out.println(m.toString());
           estratta=40;
       this.addMouseListener(this);
                  }
    
    
    public void effettoCambia(){
        estratta=(int)(Math.random()*40);  //Do numero per l'estrazione casuale 
        this.repaint();                   //Ridisegna           
                                }
    
        public void controllo(){        //♥ del gioco 
            JfDiVittoria w;
             JfdDiPerdita l;
            int sbagliato=0;
     for(int giri=0;giri<5;giri++){
              if(c.confronta(CarteDaRicordare.get(giri)))
                           {
            System.out.println("Giusto");
        jf.dispose(); //CHIUDE JF
      w=new JfDiVittoria();
      sbagliato++;
                           }
                                  }
     if(sbagliato==0){
         jf.dispose(); //CHIUDE JF
      l=new JfdDiPerdita();
                     }
                               }
    
    
                @Override
    @SuppressWarnings("empty-statement")
    public void paint (Graphics g)
    {
    if(i>0){ 
         c=m.estraiCartaDellAmmmore(estratta);
         c.getImg().disegna(g);
         CarteDaRicordare.add(c);
         
           }
    else{ 
  c=e;
  c.getImg().disegna(g);                
    i++;
        } 
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        System.out.println("Pescato Una Carta");
        estratta=(int)(Math.random()*40);
        this.repaint();
                                            }

    @Override
    public void mousePressed(MouseEvent me) {   
    }

    @Override
    public void mouseReleased(MouseEvent me) {  
    }

    @Override
    public void mouseEntered(MouseEvent me) {       
    }

    @Override
    public void mouseExited(MouseEvent me) {      
                                           } 
}


