package history.chapter4;

import interfaces.Combat.combat;

import java.util.Random;

import core.Main.Main;

public class Chapter4 {

    public static void capitulo() {
        Random random = new Random();
        System.out.println("Capítulo 3: O Covil dos Goblins");
        System.out.println("Após sobreviver à floresta sombria, você encontra a entrada de um covil repleto de goblins hostis.");
        System.out.println("Prepare-se para enfrentar o líder dos goblins!");
        System.out.println("Pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário

        Main.limparTela();

        combat combat = new combat();

        combat.combate(Main.personagem, new monsters.magma.magma(   "magma",random.nextInt(7,10)));
        combat.combate(Main.personagem, new monsters.magma.magma(  "magma",random.nextInt(8,10)));
        combat.combate(Main.personagem, new monsters.magma.magma(       "Magma Gigante",random.nextInt(9,10)));

        combat.combate(Main.personagem, new villains.morte.Morte());

        System.out.println("Fim do Capítulo 3");

        System.out.println("Pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário
        Main.limparTela();
    }
}