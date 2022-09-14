package br.com.etecia.atividade1309;

public class Muffin {

    private String titulo;
    private String descricao;
    private String avaliacao;
    private int Cafe;


    public Muffin(){

    }

    public Muffin(String titulo,String descricao,String avalicao,int Cafe){
        this.titulo = titulo;
        this.descricao = descricao;
        this.avaliacao = avalicao;
        this.Cafe = Cafe;
    }

    public String getTitulo() {return titulo;}

    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getDescricao() {return descricao;}

    public void setDescricao(String descricao) {this.descricao = descricao;}

    public String getAvaliacao() {return avaliacao;}

    public void setAvaliacao(String avaliacao) {this.avaliacao = avaliacao;}

    public int getCafe() {return Cafe;}

    public void setCafe(int cafe) {Cafe = cafe;}
}
