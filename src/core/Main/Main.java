package core.Main;

import java.util.Scanner;
import character.Character;
import classes.alquimista.Alquimista;
import classes.ceifador.Ceifador;
import classes.clero.Clero;
import classes.forjador.Forjador;
import classes.guerreiro.Guerreiro;
import history.chapter1.Chapter1;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Character personagem = null;
    public static void main(String[] args) {

        System.out.println("--------Dark Ages--------");
        System.out.println("1 - Novo Jogo\n2 - Sair");

        int escolha = scanner.nextInt();
        if (escolha == 1) {
            limparTela();
            criarPersonagem();
            limparTela();

            System.out.println("Personagem criado com sucesso!");
            personagem.exibir_detalhes();

            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine(); // Consumir a nova linha pendente
            scanner.nextLine(); // Esperar o Enter do usuário
            limparTela();
            
            Chapter1.capitulo();
            
        } else {
            System.out.println("Saindo...");
            System.exit(0);
        }
        scanner.close();
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void criarPersonagem() {

        System.out.println("Digite seu nome: ");
        scanner.nextLine(); // Consumir a nova linha pendente
        String nome = scanner.nextLine();

        System.out.println(
            "Escolha sua classe: "+
            "\n1-Guerreiro "+
            "\n2-Alquimista "+
            "\n3-Clero "+
            "\n4-Forjador "+
            "\n5-Ceifador"
        );

        int classe = scanner.nextInt();
        switch (classe) {
            case 1:
                personagem = new Guerreiro(nome);
                break;

            case 2:
                personagem = new Alquimista(nome);
                break;

            case 3:
                personagem = new Clero(nome);
                break;

            case 4:
                personagem = new Forjador(nome);
                break;

            case 5:
                personagem = new Ceifador(nome);
                break;

            default:
                System.out.println("Classe inválida!");
                criarPersonagem();
                break;
            }
    }
}