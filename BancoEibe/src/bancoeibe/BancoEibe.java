

package bancoeibe;

import javax.swing.JOptionPane;//pacotes sempre com letras minusculas

public class BancoEibe {

    public static void main(String[] args) {
        
        ContaEibe consulta = new ContaEibe(1000);
        CalculoEibe mat = new CalculoEibe();
        RandomicoEibe vitoria = new RandomicoEibe();
        consulta.depositarValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito: ")));
        consulta.mostraSaldo();
        mat.raizQadrada();
        vitoria.apostaMega();
    }
    
}

