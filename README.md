#Descrição Geral do projeto:
Este sistema tem como objetivo gerir campeonatos de xadrez, incluindo a organização de
jogadores, a realização de partidas, e o acompanhamento de resultados. O sistema foi
projetado com base nos conceitos de Programação Orientada a Objetos (POO) e segue os
principais pilares de POO, como herança, encapsulamento, abstração e polimorfismo.
O sistema é flexível o suficiente para suportar diferentes tipos de torneios, como torneios de
singulares e torneios de duplas, e permite um controlo eficaz sobre o desempenho dos
jogadores e o andamento das partidas.
O sistema deve ser implementado conforme o que está representado no UML:
Funcionalidades Básicas do sistema conforme o UML:
1. Explicação gráfica. Deve desenvolver uma interface gráfica com um menu que permita:
1. registar jogador: deve abrir uma janela onde é possível preencher os dados do
utilizador.
2. registar árbitro: deve abrir uma página para registar um árbitro.
3. Gerar/controlar torneios: após clicada esta opção o sistema deve perguntar que tipo
de torneio o utilizador quer gerar. Dependendo do tipo de torneio escolhido, o sistema
deve ser capaz de gerar torneios singulares compostos por partidas singulares, que
podem ser do tipo eliminatório ou por soma do maior número de pontos, e torneios de
duplas composto por partidas duplas. Também deve existir uma maneira gráfica (à
escolha) de se poder simular e visualizar todos os vencedores de cada partida existente
para cada tipo de torneio.
4. Visualizar o campeonato: após clicada deve aparecer uma página com as
informações sobre o campeonato, como o estado dos torneios (se já acabaram ou
não), deve também existir uma opção para atribuir prémio para os torneios já
terminados. Aqui também deve ser possível visualizar os rankings de todos os
jogadores que participaram no campeonato (mesmo que não tenham ganho torneios),
deve ainda aparecer os jogadores femininos e masculinos que tiverem maior e pior
ranking.
2. Explicação detalhada das funcionalidades pretendidas:
• Registo de Jogadores: Permitir que jogadores sejam registados segundo o diagrama de
uml.
• Registo de Árbitros: Permitir que árbitros sejam registados segundo o diagrama de
uml.
• Partidas: As partidas podem ser duplas ou simples consoante o tipo de torneio. No
entanto, ambas implementam a mesma interface. As regras para as partidas de
singulares são que só é permitido 2 jogadores, o tempo é de 30min por partida e que
só há um vencedor. Nas partidas de duplas joga-se em equipas de dois jogadores, estes
são obrigados a fazer jogadas à vez, o tempo total da partida é de 40min e no fim
ganham dois jogadores (a equipa).
• Torneio: Os torneios podem ser de 2 tipos, Singulares (com partidas singulares) e
Duplas (com partidas de duplas). Os torneios singulares podem ser por eliminatórias
ou por pontos. Por eliminatórias, a cada ronda um jogador é eliminado e joga com
quem ganhar de outra partida, até sobrar apenas um vencedor. Por pontos, todos
jogam contra todos e no fim ganha quem tiver maior pontuação (vitória: 3 pontos,
derrota: 0 pontos). Nos torneios de duplas, funciona também por pontos mas em
equipas. A equipa pode ganhar pontos extra se ganhar a partida em menos de 20
minutos (+1 ponto).
• Campeonato (torneio manager): Um Campeonato deve ter vários torneios, singulares
feminino, singulares masculino e duplos mistos. Deve ser possível atribuir um premio a
cada torneio. Para singulares o premio deve ser de 30000eur e para duplas de
40000eur por dupla. Podem ser de um tipo à escolha (viagem, carro, dinheiro, …).
• Determinação de vencedores:
o Partida: Para cada partida o vencedor é determinado no vosso programa por
fazer cheque mate. Ou seja, este cheque mate pode ser definido
aleatoriamente a qualquer momento do decorrer da vossa partida.
o Torneio: Para o torneio Singulares por eliminatórias, o jogador que perde uma
partida deve sair logo do torneio. No fim ganha o último jogador que ainda
esteja no torneio. Nos singulares por Pontos ganha quem tiver mais pontos no
fim do torneio. No torneio com duplas ganha quem tiver mais pontos no fim
do torneio incluído os pontos extra para quem ganhou em menos de 20min.
• Rankings: Os rankings dos jogadores devem ser atualizados sempre que ganham uma
partida (singular: 5 pontos de ranking ou dupla: 3 pontos de ranking). Estes rankings
devem estar escritos num ficheiro de rankings.txt . Este ficheiro deve ser lido na classe
Campeonato para poder exibir os rankings atualizados.
• Testes: Todas as funcionalidades devem ser testadas na classe Main/App. Devem criar
um campeonato com diferentes torneios (seguindo as regras explicadas em cima).
• Javadoc: Todo o projeto deve estar documentado conforme as regras Javadoc dadas
em aula. Todas as classes e métodos corretamente documentados.
• Mockups: Os mockups são conforme o que planearem (desde que respeitem as
funcionalidade pedidas) devem ser entregues juntamente com o projeto, podem ser
feitos com ajuda do Figma ou podem fazer noutra plataforma desde que sejam
entregues em pdf.
Funcionalidades avançadas (para poderem obter a nota máxima, 20):
• Criar um ficheiro com o histórico de vitórias de todos os jogadores com base no
número de partidas jogadas.
• Mudar o método de calcular o vencedor de cada partida para base em probabilidades,
considerando o ranking e o histórico dos jogadores (deixo a matemática desse cálculo à
vossa escolha).
• GUI: devem acrescentar uma opção ao vosso menu onde deve ser possível visualizar
um tabuleiro de xadrez (as peças não necessitam de se mexer, basta a representação
gráfica do estado inicial do tabuleiro). Para isto devem criar um ficheiro chamado
tabuleiro.txt, lê-lo e atribuir a cada posição uma cor e uma peça (podem ir buscar as
imagens das peças de xadrez à internet).
Observações
Devem cumprir o esquema do UML com a exceção de que devem acrescentar todos os
métodos que necessitarem às vossas classes para fazerem o projeto funcionar como descrito,
podem também modificar os atributos se acharem que não se adequa ao vosso código (desde
que isso não altere as funcionalidades esperadas). Devem ainda, tratar de todas as exceções de
modo ao vosso código ficar robusto a erros.
Avaliação:
Funcionalidades Completas: O sistema deve ser capaz de gerir os jogadores, árbitros, partidas,
torneios e campeonato, conforme descrito, avaliação até 17 (valores). Caso queiram ter nota
máxima no projeto, as funcionalidades avançadas devem estar corretamente implementadas,
20 valores.
Interface de Usuário: Embora o foco seja a lógica do sistema, a interface de usuário deve
permitir o fácil registo e visualização dos dados relacionados aos torneios, partidas e prémios.
Modularidade: O código deve estar bem organizado, onde o uso de várias classes é evidente
(podem criar mais classes para além daquelas que estão no UML).
Criatividade: Valorizam-se implementações extras e melhorias que vão além do pedido. No
entanto, tudo o que aparecer no projeto deve ser coisas que falámos nas aulas, coisas que não
falámos e apareçam serão altamente questionadas e não serão contabilizadas.
Validade: Testes rigorosos para verificar se todas as funcionalidades funcionam como esperado.
Plágio: O plágio não será tolerado (incluindo, por outros colegas ou por qualquer tipo de IA).
Uma ferramenta para detetar plágio será usada. Caso seja detetado terão automaticamente 0.
Nota final: A nota final do projeto, é o código que entregarem mais a avaliação oral.
