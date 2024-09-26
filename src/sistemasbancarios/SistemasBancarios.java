/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasbancarios;
import java.util.Scanner;
/**
 *
 * @author flavi
 */
public class SistemasBancarios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Conta minhaConta = new Conta();             //Criando classe conta com propriedade dono e saldo
        minhaConta.dono = "Duke";                   // Declarando prorpiedades 
        minhaConta.saldo = 1000.0;
        double sacar = 0;                           

        System.out.println("Saldo atual: " + minhaConta.saldo);
        System.out.println("Dono da conta: " + minhaConta.dono);
       
        System.out.println("Quanto voce deseja sacar");
        sacar = sc.nextDouble();
        minhaConta.saca(sacar);     
        System.out.println("Saldo atual: " + minhaConta.saldo);
        
        //Criardepositar e receber
        
    
        
        //Conta.saca("Uma string qualquer");
       // System.out.println(Conta.saca(700.0,minhaConta.saldo ));

        
        
    }


    
}
