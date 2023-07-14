package model;

public class QueriesSqlModel {//Armazena as queries para serem executadas na base
    private String query;

    public String adicionaRebelde(){
        query = "";
        return this.query;
    }
    public String atualizaRebelde(){return this.query;}
    public String buscaRebelde(){return this.query;}
}
