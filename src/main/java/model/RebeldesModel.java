package model;

public abstract class RebeldesModel implements RebeldeInterfaceModel {
    //Atributos
    private String nome;
    private Integer idade;
    private String genero;
    private String localizacao;
    private String status;

    //Construtor
    public RebeldesModel(String nome, Integer idade, String genero, String localizacao, String status) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.localizacao = localizacao;
        this.status = status;
    }

    //Getter & setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
