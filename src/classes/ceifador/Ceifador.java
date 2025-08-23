package classes.ceifador;

import java.util.Scanner;
import interfaces.Combat.combat;

public class Ceifador extends character.Character {
    Scanner scanner = new Scanner(System.in);


    public Ceifador(String nome) {
        super(nome, "Ceifador");
        this.vida = 80;
        this.mana = 50;
        this.danoBase = 10;
        this.defesaBase = 7;
        this.velocidade = 10;
    } 

    @Override
    public int atacar() {
        System.out.println("escolha um ataque: ");
        System.out.println(
                            "0 - Ataque básico (Dano: " + this.danoBase + ")"+
                            "\n1 - Lamina da foice (Custo: 10 de mana, Dano: " + (this.danoBase + 12) + " aplica 8 de dano por sangramento)" +
                            "\n2 - Roubo de vida (Custo: 15 de mana, Cura: 10 de vida ,Dano:10)" +
                            "\n3 - chamado dos mortos (Custo: 20 de mana, aplica um aura que amplifica o ataque e a velocidade em 5 pontos)"
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