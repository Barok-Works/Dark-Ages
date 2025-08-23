package monsters.witch;

public class witch extends character.Character {

    public witch(String nome,int level) {
        super(nome, "Witch");
        this.level = level;
        this.vida = 100;
        this.mana = 40;
        this.danoBase = 15;
        this.defesaBase = 4;
        this.velocidade = 5;
        this.exp = 30;
    }

    @Override
    public int atacar() {
        return this.danoBase;
    }
    
}
