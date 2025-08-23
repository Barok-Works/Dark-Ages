package character;

public class Character {

    protected String nome;
    protected String classe;
    protected int level;
    protected int vida;
    protected int mana;
    protected int danoBase;
    protected int defesaBase;
    protected int velocidade;
    protected int exp;

    public Character(String nome,String classe){
        this.nome = nome;
        this.classe = classe;
        this.level = 1;
        this.vida = 100;
        this.mana = 100;
        this.danoBase = 10;
        this.defesaBase = 5;
        this.velocidade = 5;
        this.exp = 0;
    }

    public Character(String nome){
        this.nome = nome;
        this.classe = "none";
        this.level = 1;
        this.vida = 100;
        this.mana = 100;
        this.danoBase = 10;
        this.defesaBase = 5;
        this.exp = 0;
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
            "\nClasse: "+this.classe+
            "\nLevel: "+this.level+
            "\nVida: "+this.vida+
            "\nMana: "+this.mana+
            "\nDano base: "+this.danoBase+
            "\nDefesa base: "+this.defesaBase+
            "\nExp : "+this.exp
        );
    }
    
    // Getters
    public String getNome() {
        return nome;
    }
    
    public String getClasse() {
        return classe;
    }
    
    public int getLevel() {
        return level;
    }
    
    public int getVida() {
        return vida;
    }
    
    public int getMana() {
        return mana;
    }
    
    public int getDanoBase() {
        return danoBase;
    }

    public int getDefesaBase() {
        return defesaBase;
    }
    
    public int getExp() {
        return exp;
    }
    
    public int getVelocidade() {
        return velocidade;
    }
    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    
    public void setVida(int vida) {
        this.vida = vida;
    }
    
    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public void setDanoBase(int danoBase) {
        this.danoBase = danoBase;
    }
    
    public void setDefesaBase(int defesaBase) {
        this.defesaBase = defesaBase;
    }
    
    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
