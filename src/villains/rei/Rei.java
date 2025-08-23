package villains.rei;

import java.util.Random;

public class Rei extends character.Character {

    Random random = new Random();
    
    public Rei() {
        super("Rei","Boss");
        this.level = 15;
        this.vida = 800;
        this.mana = 300;
        this.danoBase = 70;
        this.defesaBase = 30;
        this.exp = 2000;
    }

    @Override
    public int atacar() {
        //ira apresentar os ataques que os outros chefoes possuem
        int chance = random.nextInt(0, 4); 
        if (chance == 0) {
            return this.danoBase; // ataque crítico
        } else {
            return this.danoBase;
        }
    }

    
}