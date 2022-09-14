package br.com.etecia.atividade1309;

public class Cafe {
    private String titulo;
    private String descricao;
    private int imgCafe;


    public Cafe(){

    }

    public Cafe(String titulo,String descricao,int imgcafe){
        this.titulo = titulo;
        this.descricao = descricao;
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

    public int getImgCafe() {
        return imgCafe;
    }

    public void setImgCafe(int imgCafe) {
        this.imgCafe = imgCafe;
    }
}
