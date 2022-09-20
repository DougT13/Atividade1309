package br.com.etecia.atividade1309;

public class Tea {
    private String titulo;
    private String descricao;
    private String avaliacao;
    private int imgCafe;


    public Tea(){

    }

    public Tea(String titulo, String descricao, String avaliacao, int imgCafe){
        this.titulo = titulo;
        this.descricao = descricao;
        this.avaliacao = avaliacao;
        this.imgCafe = imgCafe;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAvaliacao() {return avaliacao;}

    public void setAvaliacao(String avaliacao) {this.avaliacao = avaliacao;}

    public int getImgCafe() {
        return imgCafe;
    }

    public void setImgCafe(int imgCafe) {
        this.imgCafe = imgCafe;
    }
}
