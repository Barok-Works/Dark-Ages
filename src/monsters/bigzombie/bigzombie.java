package monsters.bigzombie;

public class bigzombie extends character.Character {

    public bigzombie() {
        super("Big Zombie", "Zombie");
        this.level = 5;
        this.vida = 150;
        this.mana = 30;
        this.danoBase = 20;
        this.defesaBase = 5;
        this.velocidade = 4;
        this.exp = 40;
    }

    @Override
    public int atacar() {
        return this.danoBase;
    }
    
}
