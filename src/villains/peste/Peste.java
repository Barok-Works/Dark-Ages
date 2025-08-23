package villains.peste;

public class Peste extends character.Character {

    public Peste() {
        super("Peste", "Boss");
        this.level = 4;
        this.vida = 120;
        this.mana = 50;
        this.danoBase = 18;
        this.defesaBase = 6;
        this.velocidade = 6;
        this.exp = 50;
    }

    @Override
    public int atacar() {
        return this.danoBase;
    }

    
}