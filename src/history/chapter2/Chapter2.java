package history.chapter2;
import interfaces.Combat.combat;

import java.util.Random;

import core.Main.Main;

public class Chapter2 {

    public static void capitulo() {
        Random random = new Random();

        System.out.println("Capítulo 2: A Floresta Sombria");
        System.out.println("historia...");
        System.out.println("pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário

        Main.limparTela();

        combat combat = new combat();

        combat.combate(Main.personagem, new monsters.zombies.zombie( "zombie",random.nextInt(3,6)));
        combat.combate(Main.personagem, new monsters.zombies.zombie( "zombie",random.nextInt(4,7)));
        combat.combate(Main.personagem, new monsters.zombies.zombie( "bigzombie",random.nextInt(5,8)));

        combat.combate(Main.personagem, new villains.peste.Peste());

        System.out.println("Fim do Capítulo 2");

        System.out.println("pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário
        Main.limparTela();
    }
}