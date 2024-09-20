package AparelhoCelular;

import AparelhoCelular.Internet.NavegarNaInternet;
import AparelhoCelular.MensagemTexto.Mensagem;
import AparelhoCelular.Musica.ReprodutorMusical;
import AparelhoCelular.Telefone.AparelhoTelefonico;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegarNaInternet, Mensagem {
    @Override
    public void funcaoFone() {

        System.out.println("Ligando");
        System.out.println("Atendendo ligação");
        System.out.println("Iniciando Correio de Vóz");
    
    }

    @Override
    public void funcaoInternet() {

        System.out.println("Exibindo Página");
        System.out.println("Atualizando Página");
        System.out.println("Abrindo nova Aba");
        
    }

    @Override
    public void funcaoMusica() {

        System.out.println("Tocar Música");
        System.out.println("Selecionar Música");
        System.out.println("Pausar Música");
        
    }

    @Override
    public void funcaoMensagem() {
        System.out.println("Apagou a mensagem");
        System.out.println("Ler mensagem");
        System.out.println("Escrever mensagem");
    }
}
