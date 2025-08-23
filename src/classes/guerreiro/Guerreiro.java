package classes.guerreiro;

public class Guerreiro extends character.Character {

    public Guerreiro(String nome){
        super(nome,"Guerreiro");
        this.vida = 100;
        this.mana = 0;
        this.danoBase = 15;
        this.defesaBase = 10;
        this.velocidade = 4;
    }
}