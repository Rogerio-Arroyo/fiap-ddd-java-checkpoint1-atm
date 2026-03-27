package org.example;

import java.util.Scanner;

public class FiapBankAtm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1° - Cadastro de Dados e Autentificação

        System.out.println("========================================");
        System.out.println("   BEM-VINDO AO FIAP BANK - ATM");
        System.out.println("========================================");
        System.out.println();

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = leitor.nextLine().trim();

        String primeiroNome;
        int indicePrimeiroEspaco = nomeCompleto.indexOf(" ");
        if (indicePrimeiroEspaco > 0) {
            primeiroNome = nomeCompleto.substring(0, indicePrimeiroEspaco);
        } else {
            primeiroNome = nomeCompleto;
        }

        System.out.println();
        System.out.println("Olá, " + primeiroNome + "! Seja bem-vindo(a) ao FIAP Bank.");
        System.out.println();

    }
}
