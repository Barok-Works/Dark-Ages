package monsters.ghost;

public class ghost extends character.Character {

    public ghost(String nome,int level) {
        super(nome, "Ghost");
        this.level = level;
        this.vida = 70;
        this.mana = 30;
        this.danoBase = 10;
        this.defesaBase = 3;
        this.velocidade = 6;
        this.exp = 25;
    }

    @Override
    public int atacar() {
        return this.danoBase;
    }
    
}
