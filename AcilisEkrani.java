
package acilisekrani;

/**
 *
 * @author melikekecelioglu
 */
public class AcilisEkrani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        ProgressBarYukleme giris = new ProgressBarYukleme();
        giris.setVisible(true);
        SonucEkrani ekran = new SonucEkrani();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50);
                ProgressBarYukleme.jProgressBar1.setValue(i);
                if (i == 100) {
                    giris.setVisible(false);
                    ekran.setVisible(true);
                }
            }
        } catch (InterruptedException e) {

        }

    }

}
