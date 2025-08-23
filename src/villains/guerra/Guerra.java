package villains.guerra;

import interfaces.Combat.combat;

public class Guerra extends character.Character {
    
    public Guerra() {
        super("Guerra","Boss");
        this.level = 10;
        this.vida = 500;
        this.mana = 200;
        this.danoBase = 1;
        this.defesaBase = 0;
        this.exp = 1000;
        this.velocidade = 0;
    }

    @Override
    public int atacar() {
        combat.efeito = "furia"; // Aplica o efeito de furia (buff de dano)
        return this.danoBase;
    }

    
}