package model;

import enums.Modalidade;
import enums.Nivel;

public class Futebol extends Esporte {
    private String tamanhoCampo;
    private int qtdReservas;

    public Futebol(String nome, int numJogadores, int duracaoMin, Modalidade modalidade, Nivel nivel,
                   String tamanhoCampo, int qtdReservas) {
        super(nome, numJogadores, duracaoMin, modalidade, nivel);
        this.tamanhoCampo = tamanhoCampo;
        this.qtdReservas = qtdReservas;
    }

    @Override
    public void iniciarPartida() {
        System.out.println("A partida de futebol começou com o apito do juiz!");
    }

    public void iniciarPartida(int prorrogacaoMin) {
        System.out.println("A partida começou e terá " + prorrogacaoMin + " minutos de prorrogação.");
    }

    @Override
    public void exibirRegras() {
        super.exibirRegras();
        System.out.println("Tamanho do campo: " + tamanhoCampo);
        System.out.println("Quantidade de reservas: " + qtdReservas);
    }

    public String getTamanhoCampo() {
        return tamanhoCampo;
    }

    public int getQtdReservas() {
        return qtdReservas;
    }
}