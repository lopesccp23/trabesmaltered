package main.java.com.sgc.app;

import java.util.ArrayList;
import java.util.Scanner;
import main.java.com.sgc.modelos.Esmalte;

public class Main {

    private static ArrayList<Esmalte> esmaltes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean executando = true;

        while (executando) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1 -> cadastrarEsmalte();
                case 2 -> listarEsmaltes();
                case 3 -> buscarEsmalte();
                case 0 -> executando = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
        System.out.println("Sistema encerrado.");
    }

    private static void exibirMenu() {
        System.out.println("\n=== SISTEMA DE ESMALTE ===");
        System.out.println("1 - Cadastrar Esmalte");
        System.out.println("2 - Listar Esmaltes");
        System.out.println("3 - Buscar Esmalte por nome");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarEsmalte() {
        System.out.println("\n=== CADASTRAR ESMALTE ===");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Marca: ");
        String marca = scanner.nextLine();

        System.out.print("Ano de lançamento: ");
        int anoLancamento = scanner.nextInt();

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Esmalte esmalte = new Esmalte(nome, marca, anoLancamento, preco);
        esmaltes.add(esmalte);

        System.out.println("Esmalte cadastrado com sucesso!");
    }

    private static void listarEsmaltes() {
        System.out.println("\n=== LISTA DE ESMALTES ===");

        if (esmaltes.isEmpty()) {
            System.out.println("Nenhum esmalte cadastrado.");
            return;
        }

        for (Esmalte esmalte : esmaltes) {
            System.out.println(esmalte);
        }
    }

    private static void buscarEsmalte() {
        System.out.println("\n=== BUSCAR ESMALTE ===");

        if (esmaltes.isEmpty()) {
            System.out.println("Nenhum esmalte cadastrado.");
            return;
        }

        System.out.print("Digite o nome do esmalte: ");
        String nomeBusca = scanner.nextLine();

        for (Esmalte esmalte : esmaltes) {
            if (esmalte.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("Esmalte encontrado:");
                System.out.println(esmalte);
                return;
            }
        }

        System.out.println("Esmalte não encontrado.");
    }
}