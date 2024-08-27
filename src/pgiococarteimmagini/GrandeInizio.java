/*    🃏 Benvenuto! nel gioco di memoria con le carte 🃏
 🃏 Ti verrano mostrate 5 carte per pochi secondi, 
 🃏 dopodichè al click del mouse sul mazzo/tavolo da gioco pescherai  
 🃏 quando ritieni di aver individuato 1 delle 5 carte 
 🃏 clicca sul titolo!, ATTENZIONE hai solo una possibilità.
 🃏🃏🃏🃏🃏🃏                    BY Marco Perrotta                🃏🃏🃏🃏🃏🃏
 */
package pgiococarteimmagini;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**_______🙈🙉🙊_________
 * @author perrotta 🃏 *
 *____________________*/
public class GrandeInizio implements ActionListener 
{
   static JFrame jf ; 
    Icon iTitolo;
    JButton bTitolo,bTROVATO;
    JLabel regoline,regolinepr2;
    Gioco disegna=new Gioco(); //Vero e propria chiamata del gioco
    public GrandeInizio() throws InterruptedException  {
    regoline=new JLabel("<Html>Benvenuto! <br>Memorizza le carte...");

    regolinepr2=new JLabel("");
    iTitolo=new ImageIcon("TITOLO.PNG");
    
    bTitolo=new JButton(iTitolo);
    bTitolo.addActionListener(this);
 

     jf=new JFrame("Gioco Carte II");
     jf.setSize(600,600); 
     jf.setDefaultCloseOperation(3);
     jf.setResizable(false); //non ho problemi di diversi size così
  
     jf.getContentPane().setBackground(Color.decode("#013220")); //colore del tavolo da gioco
            regoline.setForeground(Color.red);               //colore delle scritte
     GridLayout g1;                // Istanzio/creo la giglia come layout 
        g1 = new GridLayout(0,1); // 
   
     jf.setLayout(g1);               //Adotto la griglia come Layout
     jf.add(bTitolo);               //Adotto il titolo
     jf.add(disegna);              //Adotto il gioco
     jf.add(regoline);            //Adotto le Lable/Regole del gioco
     jf.setVisible(true);
/*Dopo che ho settato tutto il jframe e l'ho rieso visibile posso 
       procedere con la comparsa scomparsa delle 5 carte */
Thread.sleep(500); //aspetta 0.5 secondi, cosi da dare la possibilita di leggere bene la jlable
      for( int i=0;i<6;i++)           //per 5 volte 
     {
        Thread.sleep(500);       //aspetta 0.5 secondi 
        try {
            Thread.sleep(2500);  //aspetta 2.5 secondi 
        } catch (InterruptedException ex){ 
            System.out.println("errore");
                                         }
        disegna.effettoCambia(); //faccio comparire le 5 carte da ricordare  
     }
      disegna.setI(0);//dopo la comparasa e scomparsa delle 5 carte faccio iniziare il gioco con il cardback      
       regoline.setText("<Html>Benvenuto! <br>Ti sono state mostrate 5 carte per pochi secondi,<br>al click del mouse sul mazzo o tavolo da gioco pescherai una carta<br>  quando ritieni di aver individuato una delle 5 carte <br>  clicca sul titolo! ATTENZIONE hai solo una possibilità.<br>                    BY Marco Perrotta                <Html>");                                                 }
    @Override
    public void actionPerformed(ActionEvent e) {  //PerJbutton
    if(e.getSource()==bTitolo){ //Se si clicca sul bottone 
          disegna.controllo(); // avvia il controllo
                              }    
                                               }
}
    
        
    