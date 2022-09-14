package br.com.etecia.atividade1309;

public class Cafe {
    private String titulo;
    private String descricao;
    private int Cafe;


    public Cafe(){

    }

    public Cafe(String titulo,String descricao,int Cafe){
        this.titulo = titulo;
        this.descricao = descricao;
        this.Cafe = Cafe;
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
        return Cafe;
    }

    public void setImgCafe(int imgCafe) {
        this.Cafe = imgCafe;
    }
}
