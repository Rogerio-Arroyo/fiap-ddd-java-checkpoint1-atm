package org.example;

import java.util.Scanner;

public class FiapBankAtm {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // Etapa de Cadastro de Dados e Autentificação - 1º Solicitar Nome Completo do Cliente

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

        // 2º Cadastro de Senha Forte

        String regexSenhaForte = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()\\-_+=?><])(?=.*\\d).{8,}$";
        String senhaCadastrada;

        //*String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-=+])(?=.*\\d).{8,}$";
        //
        //        if(senha.matches(regex)){

        System.out.println("--- Cadastro de Senha ---");
        System.out.println("Sua senha deve conter:");
        System.out.println("  - No mínimo 8 caracteres");
        System.out.println("  - Ao menos um número");
        System.out.println("  - Ao menos uma letra maiúscula");
        System.out.println("  - Ao menos uma letra minúscula");
        System.out.println("  - Ao menos um caracter especial (!@#$%^&*()-_+=?><)");
        System.out.println();

        while (true) {
            System.out.print("Digite sua senha: ");
            senhaCadastrada = leitor.nextLine();

            if (senhaCadastrada.matches(regexSenhaForte)) {
                System.out.println("Senha cadastrada com sucesso!");
                System.out.println();
                break;
            } else {
                System.out.println("Senha fraca! Tente novamente seguindo os critérios acima.");
                System.out.println();
            }
        }



    }
}
