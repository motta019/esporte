package model;

import enums.Modalidade;
import enums.Nivel;

// CLASSE ABSTRATA: representa um esporte genérico.
public abstract class Esporte {
    private String nome;
    private int numJogadores;
    private int duracaoMin;
    private Modalidade modalidade; // ENUM
    private Nivel nivel; // ENUM

    // Construtor que recebe todos os dados do esporte.
    public Esporte(String nome, int numJogadores, int duracaoMin, Modalidade modalidade, Nivel nivel) {
        this.nome = nome;
        this.numJogadores = numJogadores;
        this.duracaoMin = duracaoMin;
        this.modalidade = modalidade;
        this.nivel = nivel;
    }

    // Método abstrato que obriga as subclasses a definirem como a partida inicia.
    public abstract void iniciarPartida();

    // Método concreto que mostra uma mensagem geral sobre o esporte.
    public void apresentarEsporte() {
        System.out.println("O esporte " + nome + " possui " + numJogadores + " jogadores.");
    }

    // Método concreto de exibição das regras e informações principais.
    public void exibirRegras() {
        System.out.println("Nome: " + nome);
        System.out.println("Número de jogadores: " + numJogadores);
        System.out.println("Duração: " + duracaoMin + " minutos");
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Nível: " + nivel.getDescricao());
    }

    public String getNome() {
        return nome;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public Modalidade getModalidade() {
        return modalidade;
    }

    public Nivel getNivel() {
        return nivel;
    }
}