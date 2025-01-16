Projeto: Sistema de Gestão de Campeonatos de Xadrez

Este repositório contém o projeto de um Sistema de Gestão de Campeonatos de Xadrez, desenvolvido com base nos conceitos de Programação Orientada a Objetos (POO). O objetivo principal é organizar e gerenciar torneios de xadrez, contemplando funcionalidades como cadastro de jogadores e árbitros, gestão de partidas e torneios, e exibição de rankings.
Funcionalidades Básicas
1. Interface Gráfica

Uma interface gráfica foi projetada para simplificar a interação com o sistema. O menu principal inclui:

    Registrar Jogador: Abre uma janela para inserir os dados do jogador.
    Registrar Árbitro: Abre uma página para o registro de árbitros.
    Gerar/Controlar Torneios: Permite escolher o tipo de torneio (singulares ou duplas) e controlar seu progresso, simulando e visualizando vencedores.
    Visualizar Campeonato: Mostra o estado dos torneios (concluídos ou em andamento) e permite:
        Atribuir prêmios aos torneios concluídos.
        Exibir rankings atualizados de todos os jogadores, incluindo os melhores e piores de cada gênero.

2. Gestão de Torneios e Partidas
Partidas:

    Singulares: Dois jogadores, tempo limite de 30 minutos, com apenas um vencedor.
    Duplas: Equipes de dois jogadores, jogadas alternadas, tempo limite de 40 minutos. A equipe vencedora pode ganhar pontos extras se finalizar a partida em menos de 20 minutos.

Tipos de Torneios:

    Singulares:
        Por Eliminatórias: Um jogador é eliminado por partida até restar apenas um vencedor.
        Por Pontos: Todos jogam contra todos. Vitórias valem 3 pontos; derrotas, 0 pontos.
    Duplas:
        Por Pontos: Funciona como os torneios singulares por pontos, com pontuações adicionais por partidas rápidas.

3. Campeonato

    Contém múltiplos torneios:
        Singulares Masculinos
        Singulares Femininos
        Duplas Mistas
    Premiação:
        Torneios Singulares: €30.000 para o vencedor.
        Torneios de Duplas: €40.000 por equipe vencedora.
        Prêmios podem ser personalizáveis (dinheiro, viagens, carros, etc.).

4. Rankings

    Rankings são atualizados automaticamente:
        Vitória em Partida Singular: +5 pontos de ranking.
        Vitória em Partida de Duplas: +3 pontos de ranking.
    Rankings são armazenados no arquivo rankings.txt, lido pela classe Campeonato para exibição.

5. Determinação de Vencedores

    Partidas: O vencedor é determinado por xeque-mate, definido aleatoriamente durante o jogo.
    Torneios:
        Eliminatórias: Último jogador restante é o vencedor.
        Pontos: Quem acumular mais pontos ao final vence.

6. Testes

    Todas as funcionalidades são testadas na classe Main/App, simulando campeonatos completos.

Funcionalidades Avançadas (Nota Máxima)

    Criação de um arquivo com o histórico de vitórias dos jogadores.
    Determinação de vencedores das partidas baseada em probabilidades, considerando ranking e histórico.
    Adição de uma opção no menu para visualizar um tabuleiro de xadrez com o estado inicial das peças, a partir de um arquivo tabuleiro.txt.

Documentação e Mockups

    Javadoc: Todo o projeto está documentado com Javadoc para garantir fácil compreensão.
    Mockups: Incluídos no repositório como arquivos PDF, detalhando a interface gráfica e fluxos principais.

Requisitos de Avaliação

    Funcionalidades Completas: Sistema funcional conforme especificações (até 17 pontos).
    Funcionalidades Avançadas: Implementação de recursos extras para atingir 20 pontos.
    Interface de Usuário: Intuitiva e funcional.
    Modularidade: Código organizado em múltiplas classes para maior clareza e manutenção.
    Validade: Testes rigorosos garantem a robustez do sistema.
    Plágio: Todo o código deve ser original. Ferramentas para detecção de plágio serão utilizadas.

Como Executar

    Clone o repositório.
    Compile e execute a classe principal Main/App.
    Siga as instruções do menu para explorar as funcionalidades.

Contribuição

Contribuições são bem-vindas! Crie um pull request ou abra uma issue para sugestões e melhorias.
