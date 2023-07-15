package tools;

import connection.AtualizaConnection;
import connection.ConsultaConnection;
import connection.ConsultaInventarioConnection;
import connection.InsereConnection;

public class MenuEscolhasTools{
    //Atributos
    private int id;
    private String nome;
    private int idade;
    private String genero;
    private String terranatal;
    private String status;



    //Instanciando objetos comuns
    ConsultaConnection listaNomes = new ConsultaConnection();
    LeitorTecladoStringTools tecladoString = new LeitorTecladoStringTools();
    LeitorTecladoIntTools tecladoInt = new LeitorTecladoIntTools();

    public void case1Main(){
        System.out.println("> INSERIR NOME");
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
        System.out.println("> ATUALIZAR NOME");

        //Mostrando lista de nomes
        System.out.println("Informações atuais da base de dados:");
        listaNomes.consultaDados();

        System.out.println("Digite o id que você quer alterar:");

        // = tecladoInt.teclado();

        System.out.println("Digite o novo nome");
        nome = tecladoString.teclado();

        AtualizaConnection mudaNome = new AtualizaConnection();

        //mudaNome.atualizaDados(id, nome);

        //Mostrando lista de nomes
        System.out.println("\nInformações atuais da base de dados:");
        listaNomes.consultaDados();

    }
    //-----
    public void case3Main(){
        //Mostrando lista de nomes
        System.out.println("Informações atuais da base de dados:");
        listaNomes.consultaDados();
    }
    //-----
    public void case4Main(){
        System.out.println("Digite o id de um rebelde para ver o seu inventário:");
        listaNomes.consultaDados();

        id = tecladoInt.teclado();

        ConsultaInventarioConnection inventario = new ConsultaInventarioConnection();
        inventario.mostraIventario(id);

    }
    //-----
    public void case5Main(){

    }
    //-----
    public void case6Main(){

    }
    //-----
    public void padraoMain(){

    }


}
