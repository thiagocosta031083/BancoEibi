/*
 Método Construtor - 
 */
package bancoeibe;

import javax.swing.JOptionPane;

/**

 */
public class ContaEibe {//Classe Conta Eibe
    private double saldo;
    
    public ContaEibe(double valor/*passagem de parametro*/){//Método Construtor Conta Eibe 
        /*Características: tem que ter o mesmo nome da classe e não é void e nem tem retorno*/
        saldo = valor;
    }
                
    public double getSaldo() {//Método de retorno 
        return saldo;
    }

    public void setSaldo(double saldo) {//não tem retorno porque só define o valor
        this.saldo = saldo;//this é para atribuir valor dentro do método e diferenciar a variável loca da variável de instância
    }
    public void mostraSaldo(){//Método void
        JOptionPane.showMessageDialog(null,"Saldo = R$ "+getSaldo());
    }
    
    public void depositarValor(double valor){
      
        saldo += valor;
    }
}
