package tools;

import connection.AtualizaConnection;
import connection.ConsultaConnection;
import connection.InsereConnection;
import model.RebeldeInterfaceModel;
import model.RebeldesModel;

public class MenuEscolhasTools{
    //Atributos
    private String nome;
    private int idade;
    private String genero;
    private String localizacao;
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

        System.out.println("Digite a localização do Rebelde");
        localizacao = tecladoString.teclado();


        InsereConnection novoNome = new InsereConnection();
        novoNome.insereDados(nome,idade,genero,localizacao,"ativo");

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
