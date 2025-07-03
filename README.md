# Dark-Ages

## Descrições
Projeto ainda em desenvolvimento, haveram diversar alterações até a versão definitiva

Esse projeto está sendo desenvolvido por 5 dos integrantes da Barok Works, por sermos desenvolvedores juniors, claramente, o jogo terá uma curta duração, por volta de 20 a 40 minutos, baixa personalização, os itens e habilidades serão prédefinidos de acordo com a classe do personagem, muito provavelmente não terá sistema de inventario, porem será possivel diferentes combinações de personagens com subclasses fierentes, como cada classe terá 2 subclasses havera 20 possibilidades de combinações de subclasses, juntando isso com a possibilidade de altenar as subclasses de cada personagem ao final de cada capitulo aumenta a rejogabilidade e a variação de gameplay ao longo do jogo, nosso objetivo é fazer um jogo simples e curto, porém bem feito

## História
### Pologo
Passando na idade das trevas, em um mundo dominado pelo caos criado pelos 4 cavaleiros do apocalipse, nossos ""heróis"" vão em busca de iniciar uma nova era

## Gameplay
- RPG por Turnos
- Gerenciamento de equipe
  - 5 personagens
  - um de cada classe
  - 1 Protagonista e seus 4 aliados
- Capitulos:
  - Puzzle
  - Mini Boss
  - Puzzle
  - Boss
  - Ao final de cada capitulo será possivel redefinir as subclasses de todos os personagens
- Interface gráfica: Terminal
- Locomoção pelo mapa, tanto dentro quanto fora de combate
- 

## Arquitetura de Desenvolvimento

```
/assets
  /characters
  /maps
/src
  /character
    /inventario
    /status
  /classes
    /auquimista
    /ceifador
    /clero
    /forjador
    /medico
  /core
    /errors
    /save
  /history
    /chapter-1 # Introduction
      /boss
      /miniBoss
      /puzzle1
      /puzzle2
    /chapter-2 # Fome
      /boss
      /miniBoss
      /puzzle1
      /puzzle2
    /chapter-3 # Peste
      /boss
      /miniBoss
      /puzzle1
      /puzzle2
    /chapter-4 # Guerra
      /boss
      /miniBoss
      /puzzle1
      /puzzle2
    /chapter-5 # Morte
      /boss
      /miniBoss
      /puzzle1
      /puzzle2
  /interface
    /informations
    /map
  /NPCs
  /villains
    /fome
    /guerra
    /morte
    /peste
    /rei
```

## Developers

- Otávio Augusto Maciel Alves
- Henrique Rodrigres Nicolla
- Vitor Hugo Araujo Pereira
- Samuel Salviano de Deus
- Pedro Henrique Paulino dos Santos
