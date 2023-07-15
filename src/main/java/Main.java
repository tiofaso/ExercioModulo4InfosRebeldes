import model.MercadoCestaModel;
import tools.*;

public class Main extends MercadoCestaModel {
    //Essa classe vai ser responsável pela execução da aplicação
    public static void main(String[] args) {

        MontaMainTools main = new MontaMainTools();
        main.menu();

        //Instanciando teclados
        LeitorTecladoIntTools tecladoInt = new LeitorTecladoIntTools();
        LeitorTecladoStringTools tecladoString = new LeitorTecladoStringTools();

        //Instanciando variáveis
        int opcao;

        //Lendo teclado do menu

        opcao = tecladoInt.teclado();

        //Setando opção para sair do programa
        MenuSairTools valorSair = new MenuSairTools();
        int sair = 0;

        while (sair == 0){

            //Executando as opções do menu
            switch (opcao) {
                case 1: //Inserir rebelde na base
                    MenuEscolhasTools case1 = new MenuEscolhasTools();
                    case1.case1Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();

                    opcao = 0; //para abrir o default

                    break;
                case 2: //Atualização da localização do rebelde
                    MenuEscolhasTools case2 = new MenuEscolhasTools();
                    case2.case2Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();

                    opcao = 0; //para abrir o default

                    break;
                case 3: //Lista os rebeldes cadastrados na base
                    MenuEscolhasTools case3 = new MenuEscolhasTools();
                    case3.case3Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();

                    opcao = 0; //para abrir o default

                    break;
                case 4: //mostra o inventário de um rebelde específico
                    MenuEscolhasTools case4 = new MenuEscolhasTools();
                    case4.case4Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;
                case 5: //mostrar histórico de localização
                    MenuEscolhasTools case5 = new MenuEscolhasTools();
                    case5.case5Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;
                case 6: //denuncia rebeldes
                    MenuEscolhasTools case6 = new MenuEscolhasTools();
                    case6.case6Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;
                case 7: //mercado
                    MenuEscolhasTools case7 = new MenuEscolhasTools();
                    case7.case7Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;
                case 8://Exibe as compras do sistema
                    MenuEscolhasTools case8 = new MenuEscolhasTools();
                    case8.case8Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;

                case 9: //relatórios do sistema
                    MenuEscolhasTools case9 = new MenuEscolhasTools();
                    case9.case9Main();

                    //Teclado para encerrar o programa
                    sair = valorSair.sair();
                    opcao = 0; //para abrir o default

                    break;
                default:
                    MenuTools menu = new MenuTools();
                    menu.mostraMenu();
                    opcao = tecladoInt.teclado();

            }//end switch
        }//end while

        //Encerrando conexão com db
//        ConexaoConnection fim = new ConexaoConnection();
//        fim.closeConnection();
    }//end main
}//end main