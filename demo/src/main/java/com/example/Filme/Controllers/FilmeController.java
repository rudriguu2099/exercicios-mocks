package com.example.Filme.Controllers;

import java.util.List;
import com.example.Filme.Model.Filme;
import com.example.Filme.Service.FilmeService;

public class FilmeController {
    
    private FilmeService filmeService;

    public FilmeController() {
        this.filmeService = new FilmeService();
    }

    public List<Filme> listarFilmes() {
        return filmeService.listarFilmes();
    }

    public void cadastrarFilme(String nome, String diretor, int ano, String genero) {
        filmeService.adicionarFilme(nome, diretor, ano, genero);
    }

    public boolean deletarFilme(String nome) {
        return filmeService.removerFilme(nome);
    }
}
