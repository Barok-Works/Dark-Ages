package monsters.goblins;

public class goblin extends character.Character {

    public goblin(String nome,int level) {
        super(nome, "Goblin");
        this.level = level;
        this.vida = 80;
        this.mana = 30;
        this.danoBase = 12;
        this.defesaBase = 3;
        this.velocidade = 7;
        this.exp = 20;
    }

    @Override
    public int atacar() {
        return this.danoBase;
    }
    
}
