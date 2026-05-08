package com.example.Filme.Model;

public class Filme {
    private String nome;
    private String diretor;
    private int ano;
    private String genero;
    private int id;

    public Filme(String nome, String diretor, int ano, String genero, int id) {
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
        this.genero = genero;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

}
