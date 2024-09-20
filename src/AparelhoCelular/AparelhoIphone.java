package AparelhoCelular;

import AparelhoCelular.Internet.AdicionarNovaAba;
import AparelhoCelular.Internet.AtualizarPagina;
import AparelhoCelular.Internet.ExibirPagina;
import AparelhoCelular.Internet.NavegarNaInternet;
import AparelhoCelular.MensagemTexto.ApagarMensagem;
import AparelhoCelular.MensagemTexto.EscreverMensagem;
import AparelhoCelular.MensagemTexto.LerMensagem;
import AparelhoCelular.Musica.PausarMusica;
import AparelhoCelular.Musica.ReprodutorMusical;
import AparelhoCelular.Musica.SelecionarMusica;
import AparelhoCelular.Musica.TocarMusica;
import AparelhoCelular.Telefone.AparelhoTelefonico;
import AparelhoCelular.Telefone.Atender;
import AparelhoCelular.Telefone.IniciarCorreioDeVoz;
import AparelhoCelular.Telefone.Ligar;

import java.util.Scanner;

public class AparelhoIphone {
    public static void main(String[] args) {

        Scanner leitorMenu = new Scanner(System.in);

        System.out.println("Ligando o Aparelho!");
        boolean continuar = true;

        while (continuar) {
            System.out.println(">>> Digite a Opção Abaixo <<<");
            System.out.println(" - 1 Ouvir Música \n - 2 Usar modo Telefone \n - 3 Navegar na Internet \n - 4 Ver Mensagem \n - 0 Encerrar Menu");
            int menuPrincipal = leitorMenu.nextInt();

            switch (menuPrincipal) {
                case 1:
                    boolean seguirMusic = true;
                    while(seguirMusic) {

                        System.out.println("Digite a opção desejada \n - 1 Tocar Música \n - 2 Pausar Música \n - 3 Selecionar Musica \n - 4 Voltar ao menu Principal ");
                        int menuMusica = leitorMenu.nextInt();
                        switch (menuMusica) {
                            case 1:
                                ReprodutorMusical tocar = new TocarMusica();
                                tocar.funcaoMusica();
                                seguirMusic = false;
                                continuar = false;
                                break;
                            case 2:
                                ReprodutorMusical pausarMusica = new PausarMusica();
                                pausarMusica.funcaoMusica();
                                seguirMusic = false;
                                continuar = false;
                                break;
                            case 3:
                                ReprodutorMusical selecionarMusica = new SelecionarMusica();
                                selecionarMusica.funcaoMusica();
                                seguirMusic = false;
                                continuar = false;
                                break;
                            case 4:
                                System.out.println("Retornar ao menu Principal");
                                seguirMusic = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;

                case 2:
                    boolean seguirFone = true;
                    while(seguirFone){
                        System.out.println("Digite a opção desejada \n - 1 Ligar \n - 2 Atender \n - 3 Correio de Vóz \n - 4 Voltar ao menu Principal");
                        int menuFone = leitorMenu.nextInt();
                        switch (menuFone) {
                            case 1:
                                AparelhoTelefonico ligar = new Ligar();
                                ligar.funcaoFone();
                                seguirFone = false;
                                continuar = false;
                                break;
                            case 2:
                                AparelhoTelefonico atender = new Atender();
                                atender.funcaoFone();
                                seguirFone = false;
                                continuar = false;
                                break;
                            case 3:
                                AparelhoTelefonico iniciarVoz = new IniciarCorreioDeVoz();
                                iniciarVoz.funcaoFone();
                                seguirFone = false;
                                continuar = false;
                                break;
                            case 4:
                                System.out.println("Retornar ao menu Principal");
                                seguirFone = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;

                case 3:
                    boolean seguirnet = true;
                    while(seguirnet){
                        System.out.println("Digite a opção desejada \n - 1 Exibir Página \n - 2 Abrir uma Nova Aba \n - 3 Atualizar Página \n - 4 Voltar ao menu Principal");
                        int menuNet = leitorMenu.nextInt();


                        switch (menuNet) {
                            case 1:
                                NavegarNaInternet exibirPagina = new ExibirPagina();
                                exibirPagina.funcaoInternet();
                                seguirnet = false;
                                continuar = false;
                                break;
                            case 2:
                                NavegarNaInternet adicionarNovaAba = new AdicionarNovaAba();
                                adicionarNovaAba.funcaoInternet();
                                seguirnet = false;
                                continuar = false;
                                break;
                            case 3:
                                NavegarNaInternet atualizarPagina = new AtualizarPagina();
                                atualizarPagina.funcaoInternet();
                                seguirnet = false;
                                continuar = false;
                                break;
                            case 4:
                                System.out.println("Voltar para o Menu Principal");
                                seguirnet = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;
                case 4:
                    boolean seguirmsn = true;
                    while(seguirmsn){
                        System.out.println("Digite a opção desejada \n - 1 Ler Mensagem \n - 2 Escrever Mensagem \n - 3 Apagar Mensagem \n - 4 Voltar ao menu Principal");
                        int menuMsn = leitorMenu.nextInt();


                        switch (menuMsn) {
                            case 1:
                                LerMensagem exibirmensagem = new LerMensagem();
                                exibirmensagem.funcaoMensagem();
                                seguirmsn = false;
                                continuar = false;
                                break;
                            case 2:
                                EscreverMensagem escreverMensagem = new EscreverMensagem();
                                escreverMensagem.funcaoMensagem();
                                seguirmsn = false;
                                continuar = false;
                                break;
                            case 3:
                                ApagarMensagem apagarMensagem = new ApagarMensagem();
                               apagarMensagem.funcaoMensagem();
                                seguirmsn = false;
                                continuar = false;
                                break;
                            case 4:
                                System.out.println("Voltar para o Menu Principal");
                                seguirmsn = false;
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }
                    break;

                case 0:
                    System.out.println("Menu encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        leitorMenu.close();  // Close the scanner
    }
}
