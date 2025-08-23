package villains.morte;

public class Morte extends character.Character {
    
    public Morte() {
        super("Morte","Boss");
        this.level = 10;
        this.vida = 400;
        this.mana = 300;
        this.danoBase = 50;
        this.defesaBase = 20;
        this.exp = 2000;
    }

    @Override
    public int atacar() {
        //quanto menos vida, mais dano
        return this.danoBase + this.danoBase * (400 - vida)/10;
    }

    
}