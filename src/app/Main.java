package app;

import enums.Modalidade;
import enums.Nivel;
import model.Futebol;

public class Main {
    public static void main(String[] args) {

        Futebol futebol1 = new Futebol(
                "Futebol de Campo",
                11,
                90,
                Modalidade.CAMPO,
                Nivel.PROFISSIONAL,
                "Grande",
                7
        );

        Futebol futebol2 = new Futebol(
                "Futebol de Areia",
                5,
                36,
                Modalidade.AREIA,
                Nivel.AMADOR,
                "Pequeno",
                3
        );

        System.out.println("===== FUTEBOL 1 =====");
        futebol1.apresentarEsporte();
        futebol1.iniciarPartida();
        futebol1.iniciarPartida(30);
        futebol1.exibirRegras();

        System.out.println("\n===== FUTEBOL 2 =====");
        futebol2.apresentarEsporte();
        futebol2.iniciarPartida();
        futebol2.iniciarPartida(10);
        futebol2.exibirRegras();

        System.out.println("\n===== COMPARAÇÃO =====");

        if (futebol1.getDuracaoMin() > futebol2.getDuracaoMin()) {
            System.out.println(futebol1.getNome() + " tem maior duração.");
        } else {
            System.out.println(futebol2.getNome() + " tem maior duração.");
        }
    }
}