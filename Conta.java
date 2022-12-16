package Banco;

import java.util.Arrays;
import java.util.Scanner;
// invoque a classe Arrays e o metodo to string para mostrar todos os itens do array/vetor.

public class Conta {
    // Dados do cliente, dados da conta, cartão de crédito, consignado, conta poupança.
    // Dados do cliente: nome, endereço, profissão, idade, ID, contato.
    // Dados da conta: Saldo, cheque especial, juros, verificação de cartão de crédito, consignado, senha.
    // saida e entrada.
    // Cartão de crédito: Numero do cartão, vencimento, senha, saldo e juros, multas.
    // Consignado: Valor do emprestimo, quantas parcelas, qual parcela, debito, juros, multas.
    // Conta poupança: Saldo, Selic, saidas, entradas.
        public void contaBanco(){
            String informacoes = dadosDoCliente();
            System.out.println(" Os dados do cliente são: " + informacoes); 
        }

        private String dadosDoCliente(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite seu nome, endereço, profissão, idade, ID, contato: ");
            String [] dados = new String[6];
            for(int i = 0; i < 6; i++){
                String info = scan.nextLine();
                dados [i] = info;
            }
            
            return Arrays.toString(dados);
        }

}
