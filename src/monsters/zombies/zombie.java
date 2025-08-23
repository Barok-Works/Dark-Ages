package monsters.zombies;

import java.util.Random;

public class zombie extends character.Character {

    Random random = new Random();

    public zombie(String nome,int level) {
        super(nome, "zombie");
        this.level = level;
        this.vida =         60 + (12 * this.level);
        this.mana =         20 + (4 * this.level);
        this.danoBase =     7 + (3 * this.level);
        this.defesaBase =   4 + this.level;
        this.exp =          12 * this.level;
        this.velocidade =   2 + this.level;
    }

    @Override
    public int atacar() {
        return this.danoBase + random.nextInt(0, 5);
    }
    
}
