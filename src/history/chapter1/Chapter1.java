package history.chapter1;

import interfaces.Combat.combat;

import java.util.Random;

import core.Main.Main;


public class Chapter1 {

    static Random random = new Random();

    public static void capitulo() {
        System.out.println("Capítulo 1: O Início da Jornada");
        System.out.println("historia...");
        System.out.println("pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário

        Main.limparTela();

        combat combat = new combat();

        combat.combate(Main.personagem, new monsters.skeletons.skeleton(    "skeleton",random.nextInt(1,4)));
        combat.combate(Main.personagem, new monsters.skeletons.skeleton(   "skeleton",random.nextInt(2,5)));
        combat.combate(Main.personagem, new monsters.witch.witch(         "witch",random.nextInt(3,6)));

        combat.combate(Main.personagem, new villains.fome.Fome());

        System.out.println("Fim do Capítulo 1");

        System.out.println("pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário
        Main.limparTela();


    }
}