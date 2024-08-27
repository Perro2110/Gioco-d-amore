/*    🃏 Benvenuto! nel gioco di memoria con le carte 🃏
 🃏 Ti verrano mostrate 5 carte per pochi secondi, 
 🃏 dopodichè al click del mouse sul mazzo/tavolo da gioco pescherai  
 🃏 quando ritieni di aver individuato 1 delle 5 carte 
 🃏 clicca sul titolo!, ATTENZIONE hai solo una possibilità.
 🃏🃏🃏🃏🃏🃏                    BY Marco Perrotta                🃏🃏🃏🃏🃏🃏
 */
package pgiococarteimmagini;

/**_______🙈🙉🙊_____
 * @author perro 🃏 *
 *_________________*/
public class Carta 
{
    private int valore;
    private String seme;
    private Immagine img;

    public int getValore() {
        return valore;
    }

    public void setValore(int valore) {
        this.valore = valore;
    }

    public Immagine getImg() {
        return img;
    }

    public void setImg(Immagine img) {
        this.img = img;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public Carta(int valore, String seme, String nome) {
        this.valore = valore;
        this.seme = seme;
         this.img = new Immagine(nome);

    }
    public Carta(int valore, String seme) {
        this.valore = valore;
        this.seme = seme;

    }
    @Override
    public String toString() {
        return "Carta{" + "valore=" + valore + ", seme=" + seme + '}';
    } 
    
    public boolean confronta(Carta c)
    {
        if(c.valore==this.valore && c.seme.equalsIgnoreCase(this.seme))
            return true;
        else
            return false;
    }
}
