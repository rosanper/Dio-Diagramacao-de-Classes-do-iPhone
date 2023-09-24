import models.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.exibirPagina();
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();

        iPhone.baixarAplicativo();
        iPhone.deletarAplicativo();

        iPhone.ligar();
        iPhone.iniciarCorrerioVoz();
        iPhone.atender();

        iPhone.selecionarMusica();
        iPhone.tocar();
        iPhone.pausar();

        iPhone.recarregar();

    }
}
