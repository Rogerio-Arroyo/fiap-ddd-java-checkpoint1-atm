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

        // 3° Autenticação de Login (Comparar a senha digitada com a senha forte recém-cadastrada.)
        System.out.println("--- Autenticação ---");
        System.out.println("Simulação de acesso à conta através da comparação da senha digitada com a senha forte recém-cadastrada.");
        System.out.println();

        int tentativasRestantes = 3;
        boolean autenticado = false;

        while (tentativasRestantes > 0) {
            System.out.print("Digite sua senha: ");
            String senhaDigitada = leitor.nextLine();

            if (senhaDigitada.equals(senhaCadastrada)) {
                autenticado = true;
                System.out.println();
                System.out.println("Acesso autorizado! Bem-vindo(a), " + primeiroNome + ".");
                System.out.println();
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Senha incorreta! Tentativas restantes: " + tentativasRestantes);
                    System.out.println();
                }
            }
        }

        // 4° Bloqueio de Segurança
        if (!autenticado) {
            System.out.println();
            System.out.println("ACESSO BLOQUEADO POR MOTIVOS DE SEGURANÇA");
            System.out.println("ENTRE EM CONTATO COM FIAP BANK");
            System.out.println("E-mail: fiap.bank.sp@gmail.com");
            System.out.println("Tel: (11) 4002-8922");
            leitor.close();
            return;
        }

        // Etapa de Menu Principal - 1º Opções do Menu
        double saldo = 0.00;
        int opcaoMenu;
        boolean executando = true;

        while (executando) {
            System.out.println("========================================");
            System.out.println("          MENU PRINCIPAL");
            System.out.println("========================================");
            System.out.println("  [ 1 ] Consultar Saldo");
            System.out.println("  [ 2 ] Fazer Depósito");
            System.out.println("  [ 3 ] Fazer Saque");
            System.out.println("  [ 4 ] Sair");
            System.out.println("========================================");
            System.out.print("Escolha uma opção: ");

            // 2° Tratamento de entradas inválidas (não numérica)
            if (leitor.hasNextInt()) {
                opcaoMenu = leitor.nextInt();
            } else {
                System.out.println("Opção inválida! Digite um número de 1 a 4.");
                System.out.println();
                leitor.next(); // consumir entrada inválida
                continue;
            }

            System.out.println();


    }
}
