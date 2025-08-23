package history.chapter5;

import core.Main.Main;
import interfaces.Combat.combat;

public class Chapter5 {
    public static void capitulo() {
        System.out.println("Capítulo 5: O final");
        System.out.println("historia...");
        System.out.println("Pressione Enter para continuar...");
        Main.scanner.nextLine(); // Esperar o Enter do usuário

        Main.limparTela();

        combat combat = new combat();

        combat.combate(Main.personagem, new villains.rei.Rei());

        System.out.println("Final do jogo");

        System.out.println("espera que tenha gostado do jogo");
    }

}