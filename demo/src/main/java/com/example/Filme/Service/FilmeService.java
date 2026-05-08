package com.example.Filme.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.Filme.Model.Filme;

public class FilmeService {
    
    private List<Filme> filmes;


    public FilmeService() {
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(String nome, String diretor, int ano, String genero) {
        Filme filme = new Filme(nome, diretor, ano, genero);
        filmes.add(filme);
    }

    public List<Filme> listarFilmes() {
        return this.filmes;
    }

    public boolean removerFilme(String nome) {
        return filmes.removeIf(filme -> filme.getNome().equalsIgnoreCase(nome));
    }

}