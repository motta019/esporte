package model;

import enums.Modalidade;
import enums.Nivel;

public abstract class Esporte {
    private String nome;
    private int numJogadores;
    private int duracaoMin;
    private Modalidade modalidade; // ENUM
    private Nivel nivel; // ENUM

    public Esporte(String nome, int numJogadores, int duracaoMin, Modalidade modalidade, Nivel nivel) {
        this.nome = nome;
        this.numJogadores = numJogadores;
        this.duracaoMin = duracaoMin;
        this.modalidade = modalidade;
        this.nivel = nivel;
    }

    public abstract void iniciarPartida();

    public void apresentarEsporte() {
        System.out.println("O esporte " + nome + " possui " + numJogadores + " jogadores.");
    }

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