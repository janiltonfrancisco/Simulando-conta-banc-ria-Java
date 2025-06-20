/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conta.banco.dio;

import java.util.Scanner;

/**
 *
 * @author janil
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("Digite o numero da conta: ");
        if(!scanner.hasNextInt()){
          System.out.println("Numero da conta invalido. Por favor, digite um numero inteiro.");
          return;
        }
        
        int numConta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Digite o numero da agencia: ");
        String numAgencia = scanner.nextLine();
        
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o seu saldo atual: ");
        double saldo = scanner.nextDouble();
        
        
        System.out.println("Ola " + nomeCliente + ". Obrigado por criar uma conta em nosso banco. Sua agencia e: " + numAgencia + ". Conta: " + numConta + ". Seu saldo: " + saldo + ", ja disponivel para saque!");
        
    }
    
}
