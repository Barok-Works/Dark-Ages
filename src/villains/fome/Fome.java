package villains.fome;

import interfaces.Combat.combat;

public class Fome extends character.Character {
    
    public Fome() {
        super("Fome","Boss");
        this.level = 7;
        this.vida = 200;
        this.mana = 250;
        this.danoBase = 18;
        this.defesaBase = 25;
        this.exp = 1500;
        this.velocidade = 20;
    }

    @Override
    public int atacar() {
        combat.efeito = "fraqueza"; // Aplica o efeito de fraqueza (debuff de dano)
        return this.danoBase;
    }
}