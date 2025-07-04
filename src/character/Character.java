package character;

public class Character {
    private String nome;
    private int level;
    private int vida;
    private int mana;
    private int danoBase;
    private int defesaBase;
    private int exp;

    public Character(){}

    public Character(String nome, int level, int vida, int mana, int danoBase, int defesaBase, int exp){
        this.nome = nome;
        this.level = level;
        this.vida = vida;
        this.mana = mana;
        this.danoBase = danoBase;
        this.defesaBase = defesaBase;
        this.exp = exp;
    }

    public int atacar() {
        return this.danoBase;
    }

    public void defender(int dano) {
        if (dano - defesaBase > 0) {
            this.vida -= (dano - defesaBase);
        }
    }

    public void usar_magia() {}

    public void descansar() {
        this.vida += 50*this.vida/100;
        this.mana += 50*this.mana/100;
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
