package src.gui;

import java.awt.*;
import javax.swing.*;
import src.entities.Arbitro;
import src.entities.Jogador;


public class Main {

    private static final java.util.List<Jogador> jogadores = new java.util.ArrayList<>();
    private static final java.util.List<Arbitro> arbitros = new java.util.ArrayList<>();
    public static void main(String[] args) {

        JFrame app = new JFrame("Gestão de campeonatos de xadrez");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setLayout(new BorderLayout());
        app.setSize(500, 500);

        // Painel principal com CardLayout
        JPanel mainContainer = new JPanel(new CardLayout());
        
        // Painel inicial
        JPanel mainPanel = new JPanel(new FlowLayout());
        JButton registarJogadorButton = new JButton("Registar Jogador");
        JButton registarArbitroButton = new JButton("Registar Árbitro");
        JButton listarJogadoresButton = new JButton("Listar Jogadores");
        JButton listarArbitrosButton = new JButton("Listar Árbitros");
        mainPanel.add(registarJogadorButton);
        mainPanel.add(registarArbitroButton);
        mainPanel.add(listarJogadoresButton);
        mainPanel.add(listarArbitrosButton);
        // Painel container com CardLayout
        JPanel jogadorPanel = criarJogadorPanel(app, mainContainer);
        JPanel arbitroPanel = criarArbitroPanel(app, mainContainer);

        mainContainer.add(mainPanel,"Main");
        mainContainer.add(jogadorPanel, "Jogador");
        mainContainer.add(arbitroPanel, "Arbitro");

        // Exibir painel de registro de jogador ao clicar no botão
        registarJogadorButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer,"Jogador");
        });

        // Exibir painel de registro de árbitro ao clicar no botão
        registarArbitroButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer,"Arbitro");
        });
        
        listarJogadoresButton.addActionListener(e -> {
            JPanel novoListarJogadresPanel = listarJogadoresPanel(mainContainer,jogadores);
            mainContainer.add(novoListarJogadresPanel,"ListaJogadores");
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer,"ListaJogadores");
        });

        listarArbitrosButton.addActionListener(e -> {
            JPanel novoListarArbitrosPanel = listarArbitrosPanel(mainContainer,arbitros);
            mainContainer.add(novoListarArbitrosPanel,"ListaArbitros");
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer,"ListaArbitros");
        });

        app.add(mainContainer);
        app.setVisible(true);
    }

    private static JPanel criarJogadorPanel(JFrame app, JPanel mainContainer) {
        
        JPanel jogadorPanel = new JPanel();
        jogadorPanel.setLayout(new GridLayout(6, 2, 10, 10));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();

        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField();

        JLabel generoLabel = new JLabel("Gênero (M/F/O):");
        JTextField generoField = new JTextField();

        JLabel rankingLabel = new JLabel("Ranking:");
        JTextField rankingField = new JTextField();

        JLabel partidasJogadasLabel = new JLabel("Partidas Jogadas:");
        JTextField partidasJogadasField = new JTextField();

        JButton saveButton = new JButton("Salvar");
        JButton cancelButton = new JButton("Cancelar");

        jogadorPanel.add(nomeLabel);
        jogadorPanel.add(nomeField);
        jogadorPanel.add(idadeLabel);
        jogadorPanel.add(idadeField);
        jogadorPanel.add(generoLabel);
        jogadorPanel.add(generoField);
        jogadorPanel.add(rankingLabel);
        jogadorPanel.add(rankingField);
        jogadorPanel.add(partidasJogadasLabel);
        jogadorPanel.add(partidasJogadasField);
        jogadorPanel.add(saveButton);
        jogadorPanel.add(cancelButton);


        saveButton.addActionListener(e -> {
            try {
                
                String nome = nomeField.getText();
                if (nome.isEmpty()) throw new Exception("Nome inválido!");
                if (!nome.matches("[a-zA-Z\\s]+")) throw new Exception("Nome inválido! Deve conter apenas letras.");
                
                int idade;
                
                try {
                    idade = Integer.parseInt(idadeField.getText());
                    if (idade <= 0) throw new Exception("Idade inválida! Deve ser maior que 0.");       
                } catch (NumberFormatException ex) {
                    throw new Exception("Idade inválida! Deve conter apenas números.");
                }


                String generoStr = generoField.getText();
                if (generoStr.length() != 1 || (!generoStr.equalsIgnoreCase("M") && !generoStr.equalsIgnoreCase("F") && !generoStr.equalsIgnoreCase("O"))) throw new Exception("Gênero inválido!");
                char genero = generoStr.charAt(0);

                int ranking;
                try {
                    ranking = Integer.parseInt(rankingField.getText());
                    if (ranking < 0) throw new Exception("Ranking inválido!");
                } 
                catch (NumberFormatException ex)
                {
                    throw new Exception("Ranking inválido! Deve conter apenas números.");
                }

                int partidasJogadas;
                try {
                    partidasJogadas = Integer.parseInt(partidasJogadasField.getText());
                    if (partidasJogadas < 0) throw new Exception("Partidas jogadas inválidas!");
                } catch (NumberFormatException ex) 
                {
                    throw new Exception("Números de partidas jogadas inválido! Deve conter apenas números.");
                }


                Jogador novoJogador = new Jogador(nome, idade, genero, ranking, partidasJogadas);
                jogadores.add(novoJogador);
                JOptionPane.showMessageDialog(app, """
                                                    Jogador registrado com sucesso:
                                                    Nome: """ + novoJogador.getNome() + "\n" +
                                                    "Idade: " + novoJogador.getIdade() + "\n" +
                                                    "Gênero: " + novoJogador.getGenero() + "\n" +
                                                    "Ranking: " + novoJogador.getRanking() + "\n" +
                                                    "Partidas jogadas: " + novoJogador.getPartidasJogadas());

                nomeField.setText("");
                idadeField.setText("");
                generoField.setText("");
                rankingField.setText("");
                partidasJogadasField.setText("");

                CardLayout layout = (CardLayout) mainContainer.getLayout();
                layout.show(mainContainer, "Main");

             
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(app, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer,"Main");
        });

        return jogadorPanel;
    }

    private static JPanel criarArbitroPanel(JFrame app, JPanel mainContainer) {
        
        JPanel arbitroPanel = new JPanel();
        arbitroPanel.setLayout(new GridLayout(5, 2, 10, 10));

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField();

        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField();

        JLabel generoLabel = new JLabel("Gênero (M/F/O):");
        JTextField generoField = new JTextField();

        JLabel certificacoesLabel = new JLabel("Anos de Experiência:");
        JTextField certificacoesField = new JTextField();

        JButton saveButton = new JButton("Salvar");
        JButton cancelButton = new JButton("Cancelar");

        arbitroPanel.add(nomeLabel);
        arbitroPanel.add(nomeField);
        arbitroPanel.add(idadeLabel);
        arbitroPanel.add(idadeField);
        arbitroPanel.add(generoLabel);
        arbitroPanel.add(generoField);
        arbitroPanel.add(certificacoesLabel);
        arbitroPanel.add(certificacoesField);
        arbitroPanel.add(saveButton);
        arbitroPanel.add(cancelButton);


        saveButton.addActionListener(e -> {
            try {
                String nome = nomeField.getText();
                if (nome.isEmpty()) throw new Exception("Nome inválido!");

                int idade = Integer.parseInt(idadeField.getText());
                if (idade <= 0) throw new Exception("Idade inválida!");

                String generoStr = generoField.getText();
                if (generoStr.length() != 1 || (!generoStr.equalsIgnoreCase("M") && !generoStr.equalsIgnoreCase("F") && !generoStr.equalsIgnoreCase("O"))) throw new Exception("Gênero inválido!");
                char genero = generoStr.charAt(0);

                String certificacoes = certificacoesField.getText();
                

                Arbitro novoArbitro = new Arbitro(nome, idade, genero, certificacoes);
                arbitros.add(novoArbitro);
                JOptionPane.showMessageDialog(app, "Árbitro registrado com sucesso:\n" +
                        "Nome: " + novoArbitro.getNome() + "\n" +
                        "Idade: " + novoArbitro.getIdade() + "\n" +
                        "Gênero: " + novoArbitro.getGenero() + "\n" +
                        "Anos de experiência: " + novoArbitro.getCertificacoes());

                nomeField.setText("");
                idadeField.setText("");
                generoField.setText("");
                certificacoesField.setText("");
                
                CardLayout layout = (CardLayout) mainContainer.getLayout();
                layout.show(mainContainer, "Main");

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(app, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        });

        cancelButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer, "Main");
        });

        return arbitroPanel;
    }

    private static JPanel listarJogadoresPanel(JPanel mainContainer, java.util.List<Jogador> jogadores) {
        // Painel para listar jogadores
        JPanel listarJogadoresPanel = new JPanel();
        listarJogadoresPanel.setLayout(new BorderLayout());
    
        // Colunas da tabela
        String[] colunas = {"Nome", "Idade", "Gênero", "Ranking", "Partidas Jogadas"};
    
        // Converter a lista de jogadores para um array bidimensional
        String[][] dados = new String[jogadores.size()][colunas.length];
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador jogador = jogadores.get(i);
            dados[i][0] = jogador.getNome();
            dados[i][1] = String.valueOf(jogador.getIdade());
            dados[i][2] = String.valueOf(jogador.getGenero());
            dados[i][3] = String.valueOf(jogador.getRanking());
            dados[i][4] = String.valueOf(jogador.getPartidasJogadas());
        }
    
        // Criar tabela com os dados
        JTable tabelaJogadores = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaJogadores);
    
        // Adicionar tabela ao painel
        listarJogadoresPanel.add(scrollPane, BorderLayout.CENTER);
    
        // Botão para voltar ao menu principal
        JButton voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer, "Main");
        });
    
        listarJogadoresPanel.add(voltarButton, BorderLayout.SOUTH);
    
        return listarJogadoresPanel;
    }

    private static JPanel listarArbitrosPanel(JPanel mainContainer, java.util.List<Arbitro> arbitros) {
        // Painel para listar arbitros
        JPanel listarArbitrosPanel = new JPanel();
        listarArbitrosPanel.setLayout(new BorderLayout());
    
        // Colunas da tabela
        String[] colunas = {"Nome", "Idade", "Gênero", "Anos Experiência"};
    
        // Converter a lista de arbitros para um array bidimensional
        String[][] dados = new String[arbitros.size()][colunas.length];
        for (int i = 0; i < arbitros.size(); i++) {
            Arbitro arbitro = arbitros.get(i);
            dados[i][0] = arbitro.getNome();
            dados[i][1] = String.valueOf(arbitro.getIdade());
            dados[i][2] = String.valueOf(arbitro.getGenero());
            dados[i][3] = String.valueOf(arbitro.getCertificacoes());
        }
    
        // Criar tabela com os dados
        JTable tabelaArbitros = new JTable(dados, colunas);
        JScrollPane scrollPane = new JScrollPane(tabelaArbitros);
    
        // Adicionar tabela ao painel
        listarArbitrosPanel.add(scrollPane, BorderLayout.CENTER);
    
        // Botão para voltar ao menu principal
        JButton voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(e -> {
            CardLayout layout = (CardLayout) mainContainer.getLayout();
            layout.show(mainContainer, "Main");
        });
    
        listarArbitrosPanel.add(voltarButton, BorderLayout.SOUTH);
    
        return listarArbitrosPanel;
    }
    
}