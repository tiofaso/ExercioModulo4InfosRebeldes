package tools;

import connection.*;

public class MenuEscolhasTools{
    //Atributos
    private int id;
    private String nome;
    private int idade;
    private String genero;
    private String terranatal;
    private String status;

    private String localizacao;


    //Instanciando objetos comuns
    ConsultaConnection listaNomes = new ConsultaConnection();
    LeitorTecladoStringTools tecladoString = new LeitorTecladoStringTools();
    LeitorTecladoIntTools tecladoInt = new LeitorTecladoIntTools();

    public void case1Main(){
        System.out.println("> INSERIR NOME DO REBELDE");
        System.out.println("Digite o nome do Rebelde:");
        nome = tecladoString.teclado();

        //Para remover tratar aspas simples antes de gravar na base
        String tratador;
        tratador = nome.replace("'","''");
        nome = tratador;

        System.out.println("Digite idade do Rebelde:");
        idade = tecladoInt.teclado();

        System.out.println("Escolha o gênero do Rebelde");
        MenuGeneroTools generoMenu = new MenuGeneroTools();
        generoMenu.mostraGenero();

        LeitorTecladoGeneroTools generoTeclado = new LeitorTecladoGeneroTools();
        genero = generoTeclado.teclado();

        System.out.println("Digite a terra natal do Rebelde");
        terranatal = tecladoString.teclado();

        System.out.println("Quais são os pertences do Rebelde? Faça uma lista:");
        LeitorTecladoParagrafoTools inventarioRebelde = new LeitorTecladoParagrafoTools();

        String inventario = inventarioRebelde.teclado();

        InsereConnection novoNome = new InsereConnection();
        novoNome.insereDados(nome,idade,genero,terranatal,"ativo",inventario);

        System.out.println("\nInformações atuais da base de dados:");
        listaNomes.consultaDados();
    }
    //-----
    public void case2Main(){
        System.out.println("> ATUALIZAR LOCALIZAÇÃO");

        System.out.println("Digite o id de um rebelde para atualizar a sua localização:");
        listaNomes.consultaDados();

        id = tecladoInt.teclado();

        System.out.println("Digite a localização atual do Rebelde");

        localizacao = tecladoString.teclado();
        AtualizaLocalizacaoConnection novaLocalizacao = new AtualizaLocalizacaoConnection();
        novaLocalizacao.novaLocalizacao(id,localizacao);

    }
    //-----
    public void case3Main(){
        System.out.println("> LISTAR REBELDES");
        //Mostrando lista de nomes
        System.out.println("Informações atuais da base de dados:");
        listaNomes.consultaDados();
    }
    //-----
    public void case4Main(){
        System.out.println("> PESQUISA DE INVENTARIO");
        System.out.println("Digite o id de um rebelde para ver o seu inventário:");
        listaNomes.consultaDados();

        id = tecladoInt.teclado();

        ConsultaInventarioConnection inventario = new ConsultaInventarioConnection();
        inventario.mostraIventario(id);

    }

    public void case5Main(){
        System.out.println("> PESQUISA DE LOCALIZAÇÃO");
        System.out.println("Digite o id de um rebelde para ver seu histórico de localização:");
        listaNomes.consultaDados();

        id = tecladoInt.teclado();

        ConsultaLocalizacaoConnection localizacao = new ConsultaLocalizacaoConnection();
        localizacao.mostraLocalizacao(id);

    }
    //-----
    public void case6Main(){
        System.out.println("> DENUNCIAR REBELDE");

        listaNomes.consultaDados();
        System.out.println("Digite o seu id para realizarmos a denúncia:");

        int idDelator = tecladoInt.teclado();

        listaNomes.consultaDados();
        System.out.println("Agora digite o id de quem está nos traindo:");

        int idTraidor = tecladoInt.teclado();

        InsereDenunciaTraidorConnection denucia = new InsereDenunciaTraidorConnection();
        denucia.insereTraidor(idDelator,idTraidor);

        if(denucia.tresStrikes(idTraidor) >= 3){
             AtualizaStatusTraidorConnection rebelde = new AtualizaStatusTraidorConnection();
             rebelde.traidor(idTraidor);
        }

    }
    //-----
    public void case7Main(){
        System.out.println("> MERCADO");
        System.out.println("Seja bem-vinde ao mercado!");

        listaNomes.consultaDados();
        System.out.println("Digite o seu id:");
        id = tecladoInt.teclado();

        ConsultaIdMercadoConnection idRebelde = new ConsultaIdMercadoConnection();
        if(idRebelde.consultaIdMercado(id).equals("inativo")){
            System.out.println("Você é um traidor e não pode fazer compras!");
        }else {
            System.out.println("Escolha um dos itens abaixo:");
            MenuMercadoTools menuMercado = new MenuMercadoTools();
            menuMercado.mostraMenu();
        }


    }
    //-----
    public void case8Main(){
        System.out.println("> RELATÓRIOS");
         ConsultaRelatoriosConnection relatorios = new ConsultaRelatoriosConnection();
         relatorios.consultaDados();

    }


}
