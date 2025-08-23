package interfaces.Combat;

import character.Character;

public class combat {

    public static String efeito = "none";

    public void combate(Character personagem, Character monstro) {
        // Criar cópias dos personagens para o combate
        Character personagemCombat = personagem;
        Character monstroCombat = monstro;

        int turno = 0;

        System.out.println("Iniciando o combate entre " + personagemCombat.getNome() + " e " + monstroCombat.getNome() + "!");

        while (personagemCombat.getVida() > 0 && monstroCombat.getVida() > 0) {
            turno++;
            System.out.println("\n--- Turno " + turno + " ---");

            if (personagemCombat.getVelocidade() > monstroCombat.getVelocidade()) {

                System.out.println(personagemCombat.getNome() + " é mais rápido e ataca primeiro!");

                showVidas(personagemCombat, monstroCombat);

                if (turnoPersonagem(personagemCombat, monstroCombat)) {
                    break;
                }

                if (turnoMonstro(personagemCombat, monstroCombat)) {
                    break;
                }

                continue;

            } else if (personagemCombat.getVelocidade() < monstroCombat.getVelocidade()) {
                System.out.println(monstroCombat.getNome() + " é mais rápido e ataca primeiro!");

                showVidas(personagemCombat, monstroCombat);

                if (turnoMonstro(personagemCombat, monstroCombat)) {
                    break;
                }

                if (turnoPersonagem(personagemCombat, monstroCombat)) {
                    break;
                }

                continue;

            } else {
                System.out.println("Ambos têm a mesma velocidade! Ataque aleatório para decidir quem começa.");
                
                showVidas(personagemCombat, monstroCombat);

                if (turnoPersonagem(personagemCombat, monstroCombat)) {
                    break;
                }

                if (turnoMonstro(personagemCombat, monstroCombat)) {
                    break;
                }
                continue;
            }
        }
        personagemCombat = null;
        monstroCombat = null;
    }
    public boolean turnoPersonagem(Character personagem, Character monstro) {
        // Personagem ataca o monstro

                int danoPersonagem = personagem.atacar();
                monstro.defender(danoPersonagem);
                System.out.println(personagem.getNome() + " atacou " + monstro.getNome() + " causando " + danoPersonagem + " de dano.");
                checkDebuff(monstro, efeito);

                if (monstro.getVida() <= 0) {
                    System.out.println(monstro.getNome() + " foi derrotado!");
                    personagem.ganhar_exp(monstro.getExp()); // ganha a experiência do monstro
                    return true;
                }
                return false;
    }

    public boolean turnoMonstro(Character personagem, Character monstro) {
        // Monstro ataca o personagem
                int danoMonstro = monstro.atacar();
                personagem.defender(danoMonstro);
                System.out.println(monstro.getNome() + " atacou " + personagem.getNome() + " causando " + danoMonstro + " de dano.");
                checkDebuff(personagem,efeito);

                if (personagem.getVida() <= 0) {
                    System.out.println(personagem.getNome() + " foi derrotado!");
                    return true;
                }
                return false;
    }

    public void showVidas(Character personagemCombat, Character monstroCombat) {
        System.out.print("voce:");
            for (int i = 0; i < personagemCombat.getVida()/10; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("monstro:");
            for (int i = 0; i < monstroCombat.getVida()/10; i++) {
                System.out.print("*");
            }
            System.out.println();
    }

    public void checkDebuff(Character alvo, String efeito) {
        switch (efeito) {
            case "veneno":
                aplicarEfeito(1, 5, "defesa", alvo);
                System.out.println(alvo.getNome() + " está envenenado, sua defesa diminuiu em 5 pontos!");
                break;
            case "fraqueza":
                aplicarEfeito(1, 10, "dano", alvo);
                aplicarEfeito(1, 5, "mana", alvo);
                System.out.println(alvo.getNome() + " está enfraquecido, seu dano diminuiu em 10 pontos e sua mana diminuiu em 5 pontos!");
                break;
            case "praga":
                aplicarEfeito(1, 15, "defesa", alvo);
                System.out.println(alvo.getNome() + " está com praga, sua defesa diminuiu em 15 pontos!");
                break;
            case "furia":
                aplicarEfeito(0, 10, "dano", alvo);
                System.out.println(alvo.getNome() + " está com fúria, seu dano aumentou em 10 pontos!");
                break;
            case "cura":
                aplicarEfeito(0, 20, "vida", alvo);
                System.out.println(alvo.getNome() + " foi curado em 20 pontos de vida!");
                break;
            case "queima":
                aplicarEfeito(1, 10, "vida", alvo);
                System.out.println(alvo.getNome() + " está queimando, perdeu 10 pontos de vida!");
                break;
            case "sangramento":
                aplicarEfeito(1, 8, "vida", alvo);
                System.out.println(alvo.getNome() + " está sangrando, perdeu 8 pontos de vida!");
                break;
            case "atordoamento":
                aplicarEfeito(1, 5, "velocidade", alvo);
                System.out.println(alvo.getNome() + " está atordoado, sua velocidade diminuiu em 5 pontos!");
                break;
            default:
                break;
        }
        this.efeito = "none";
    }

    public static void aplicarEfeito(int efeito,int valor,String atributo,Character alvo) {
        // 0 = buff
        // 1 = debuff
        if (efeito == 0) {
            switch (atributo) {
                case "vida":
                    alvo.setVida(alvo.getVida() + valor);
                    break;
                case "mana":
                    alvo.setMana(alvo.getMana() + valor);
                    break;
                case "dano":
                    alvo.setDanoBase(alvo.getDanoBase() + valor);
                    break;
                case "defesa":
                    alvo.setDefesaBase(alvo.getDefesaBase() + valor);
                    break;
                default:
                    break;
            }
        } else {
            switch (atributo) {
                case "vida":
                    alvo.setVida(alvo.getVida() - valor);
                    break;
                case "mana":
                    alvo.setMana(alvo.getMana() - valor);
                    break;
                case "dano":
                    alvo.setDanoBase(alvo.getDanoBase() - valor);
                    break;
                case "defesa":
                    alvo.setDefesaBase(alvo.getDefesaBase() - valor);
                    break;
                default:
                    break;
            }
        }
    }
}
