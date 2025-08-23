package classes.clero;

public class Clero extends character.Character {

    public Clero(String nome) {
        super(nome, "Clero");
        this.vida = 100;
        this.mana = 100;
        this.danoBase = 7;
        this.defesaBase = 7;
        this.velocidade = 5;
    } 
}