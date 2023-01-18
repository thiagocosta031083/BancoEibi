
package bancoeibe;
import java.util.Random;
import javax.swing.JOptionPane;


public class RandomicoEibe {
    public int num;
    
    Random var = new Random();
    
    public int apostaMega(){
        num = var.nextInt(60);
        JOptionPane.showMessageDialog(null, "O seu número da sorte é "+num);
        return num;
    }
}
