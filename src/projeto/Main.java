package projeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrada de dados
        Scanner scan = new Scanner(System.in);
        int saldoFinal;
        int saldoTotal = scan.nextInt();
        int valorSaque = scan.nextInt();

        if (valorSaque > saldoTotal) {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        } else {
            saldoFinal = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoFinal);
        }

    }

}
