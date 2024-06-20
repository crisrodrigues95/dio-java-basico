package applications;

import java.util.Scanner;

import entities.Conta;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, digite o número da Agência !");

        while (!sc.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro para o número da Agência!");
            sc.next(); 
        }
        Integer numeroAgencia =  sc.nextInt();

        sc.nextLine(); 

        System.out.println("Por favor, digite nome da Agência !");

        String nomeAgencia =  sc.nextLine();

        System.out.println("Por favor, digite nome do cliente !");

        String nomeCliente =  sc.nextLine();

        System.out.println("Por favor, digite o Saldo atual !");

        while (!sc.hasNextDouble()) {
            System.out.println("Entrada inválida. Por favor, digite um número decimal para o saldo da conta!");
            sc.next();
        }
        
        Double saldoConta =  sc.nextDouble();

        Conta conta = new Conta();

        conta.setAgencia(nomeAgencia);
        conta.setNumero(numeroAgencia);
        conta.setNomeCliente(nomeCliente);
        conta.setSaldo(saldoConta);

        System.out.println(conta);

        sc.close();


    }
}
