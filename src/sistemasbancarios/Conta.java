/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasbancarios;

/**
 *
 * @author flavi
 */

class Conta {
    String dono;                    //prorpiedades
    double saldo;
    
    
    
   public void saca(double x){
        if(x > saldo){
            System.out.println("Saldodaconta insuficiente");
        }
        else if(x <= 0){
            System.out.println("Voce nao pode sacar um valor 0 ou abaixo de 0");
        }
        else{
            saldo -= x;
            System.out.println("Voce sacou: $" + x);
            System.out.println("Novo saldo da sua conta: $" +saldo);
        }
    }
    
}



/*class Conta {

  public static double saca(double quantidade,double saldo){
    double novoSaldo = 0;
   
    novoSaldo = saldo - quantidade; 
    
    return novoSaldo;
    
}

    String dono;
    double saldo;
    
    
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade; 
        this.saldo = novoSaldo;
        System.out.println("OKkkk");
    }
}*/
    

