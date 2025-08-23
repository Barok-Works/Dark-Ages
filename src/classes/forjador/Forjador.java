package classes.forjador;

public class Forjador extends character.Character {

    public Forjador(String nome){
        super(nome,"Forjador");
        this.vida = 120;
        this.mana = 0;
        this.danoBase = 6;
        this.defesaBase = 15;
        this.velocidade = 3;
    }
}