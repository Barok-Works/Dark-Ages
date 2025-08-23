package monsters.magma;

import java.util.Random;

public class magma extends character.Character {

    Random random = new Random();

    public magma(String nome,int level) {
        super(nome,"magma");
        this.level = level;
        this.vida = 80 + (15 * this.level);
        this.mana = 40 + (8 * this.level);
        this.danoBase = 12 + (4 * this.level);
        this.defesaBase = 5 + (2 * this.level);
        this.exp = 15 * this.level;
    }   

    @Override
    public int atacar() {
        // random entre 0 e 10 devido ao dano de fogo
        return this.danoBase + random.nextInt(0, 10);
    }
    
}
