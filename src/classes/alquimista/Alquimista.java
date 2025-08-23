package classes.alquimista;

import interfaces.Combat.combat;
import java.util.Scanner;

public class Alquimista extends character.Character {
    Scanner scanner = new Scanner(System.in);

    public Alquimista(String nome){
        super(nome,"Alquimista");
        this.vida = 120;
        this.mana = 150;
        this.danoBase = 8;
        this.defesaBase = 3;
        this.velocidade = 7;
    }

    @Override
    public int atacar() {
        System.out.println("escolha um ataque: ");
        System.out.println(
                            "0 - Ataque básico (Dano: " + this.danoBase + ")"+
                            "\n1 - bola de fogo (Custo: 7 de mana, Dano: " + (this.danoBase + 12) + ")" +
                            "\n2 - Cura (Custo: 15 de mana, Cura: 20 de vida)" +
                            "\n3 - Veneno (Custo: 20 de mana, Dano: " + (this.danoBase + 8) + " aplica -5 de defesa para o inimigo)"
                           );
        int escolha = scanner.nextInt();
        switch (escolha) {
            case 0:
                return this.danoBase;
            case 1:
                if (this.mana >= 7) {
                    this.mana -= 7;
                    return this.danoBase + 12;
                } else {
                    System.out.println("Mana insuficiente! Ataque básico realizado.");
                    return this.danoBase;
                }
            case 2:
                if (this.mana >= 10) {
                    this.mana -= 10;
                    combat.aplicarEfeito(0, 20, "vida",this);
                    return 0; // Cura, não causa dano
                } else {
                    System.out.println("Mana insuficiente! Ataque básico realizado.");
                    return this.danoBase;
                }
            case 3:
                if (this.mana >= 20) {
                    this.mana -= 20;
                    System.out.println(this.nome + " aplicou veneno no inimigo!");
                    combat.efeito = "veneno"; // Aplica o efeito de veneno (debuff de defesa)
                    return this.danoBase + 8; // Dano inicial do veneno
                } else {
                    System.out.println("Mana insuficiente! Ataque básico realizado.");
                    return this.danoBase;
                }
            default:
                System.out.println("Escolha inválida! Ataque básico realizado.");
                return this.danoBase;
        }
        
    }
}