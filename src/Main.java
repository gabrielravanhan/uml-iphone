import iphone.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.ligar("0123456789");
        iPhone.atender();
        iPhone.iniciarCorreioVoz();
        iPhone.exibirPagina("https://github.com/gabrielravanhan");
        iPhone.adicionarNovaAba();
        iPhone.atualizarPagina();
        iPhone.tocar();
        iPhone.pausar();
        iPhone.selecionarMusica("In the End");
    }
}
