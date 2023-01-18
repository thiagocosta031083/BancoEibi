
package bancoeibe;

import static java.lang.Double.max;
import javax.swing.JOptionPane;

/**

 */
public class CalculoEibe {
    private double radicando,raiz,logari;
    

public void raizQadrada(){
    radicando = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número desejado:"));
    raiz = Math.sqrt(radicando);
    logari = max(10,15);
    /*
    Outros métodos matemáticos:
    abs = Valor absoluto negativo se transforma positivo
    cell = arredonda o valor para baixo
    floor = arredonda o valor para cima
    exp = método exponencial
    log = logaritmos
    max = maior valor de 2 numeros
    min = menor valor de 2 numeros
    pow = potencia de um numero
    sin = seno
    cos = cosseno
    tan = tangente
        
    */
    JOptionPane.showMessageDialog(null,"A raiz quadrada de "+radicando+ " é "+raiz);
    JOptionPane.showMessageDialog(null,"O maior valor é: "+logari);
}
}
