package models;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.RepodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorNaInternet, RepodutorMusical {

    private String sistemaOperacional;
    private double memoria;
    private double bateria;

    public void recarregar(){
        System.out.println("Você recarregou a bateria do smartphone");
    }

    public void baixarAplicativo(){
        System.out.println("Você baixou um aplicativo");
    }

    public void deletarAplicativo(){
        System.out.println("Você deletou um aplicativo");
    }


    @Override
    public void ligar() {
        System.out.println("Você está ligando para um número");
    }

    @Override
    public void atender() {
        System.out.println("Você atendeu o celular");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Você iniciou o correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("O navegador de internet está exibindo uma página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Foi adicionado uma nova aba no navegador de internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página do navegador foi atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("A música começou a ser tocada");
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Foi selecionado uma música");
    }

    public IPhone() {
    }

    public IPhone(String sistemaOperacional, double memoria, double bateria) {
        this.sistemaOperacional = sistemaOperacional;
        this.memoria = memoria;
        this.bateria = bateria;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }
}
