package monsters.skeletons;

import java.util.Random;

public class skeleton extends character.Character {

    Random random = new Random();

    public skeleton(String nome,int level) {
        super(nome, "skeleton");
        this.level =        level;
        this.vida =         50 + (10 * this.level);
        this.mana =         30 + (5 * this.level);
        this.danoBase =     5 + (2 * this.level);
        this.defesaBase =   3 + (1 * this.level);
        this.exp =          10 * this.level;
        this.velocidade =   3 + this.level;
    }

    @Override
    public int atacar() {
        int dano = this.danoBase + random.nextInt(0, 5);
        return dano;
    }
    
}
