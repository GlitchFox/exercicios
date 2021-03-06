/*
Nome do autor: Fábio Augusto Amaro Jaime
Data de criação do arquivo: 16/01/2019
Objetivo sucinto do programa: cria classe placa de video que implementa a interface Computador
Referência ao enunciado/origem do exercício: https://docs.oracle.com/javase/tutorial/java/concepts/QandE/questions.html
*/

public class PlacaDeVideo implements Computador {

    private int memoria;

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public boolean getLigado(boolean ligado) {
        ligado = true;
        return ligado;
    }

    /*@Override
    public double getPreco(double preco) {
        preco = 1500;
        return preco;
    }*/

    @Override
    public double getTemperatura(double temperatura) {
        temperatura = 20;
        return temperatura;
    }

}
