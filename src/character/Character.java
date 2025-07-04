package character;

public class Character {
    private String nome;
    private int level;
    private int vida;
    private int mana;
    private int danoBase;
    private int defesaBase;
    private int exp;

    public Character(){

    }

    public int atacar() {
        return this.danoBase;
    }

    public void defender(int dano) {
        if (dano - defesaBase > 0) {
            this.vida -= (dano - defesaBase);
        }
    }

    public void usar_magia() {
        
    }

    public void descansar() {
        this.vida += 80*this.vida/100;
        this.mana += 80*this.mana/100;
    }

    public void ganhar_exp (int exp){
        this.exp += exp;
    }

    public void exibir_detalhes (){
        System.out.println(
            "Nome: "+this.nome+
            "\nLevel: "+this.level+
            "\nVida: "+this.vida+
            "\nMana: "+this.mana+
            "\nDano base: "+this.danoBase+
            "\nDefesa base: "+this.defesaBase+
            "\nExp : "+this.exp
        );
    }
}
