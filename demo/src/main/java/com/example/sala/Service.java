package com.example.sala;

import java.util.ArrayList;

public class Service {
  ArrayList<Model> salas = new ArrayList<>();

  public void setSalas(ArrayList<Model> salas) {
    this.salas = salas;
  }
  public ArrayList<Model> getSalas() {
    return salas;
  }

  public void cadastrarSala(String local, String numeroSala, int qtdLugares) {
    if(local == null || local.isEmpty() || numeroSala == null || numeroSala.isEmpty() || qtdLugares <= 0) {
      throw new IllegalArgumentException("Dados inválidos para cadastrar sala.");
    }
    if(numeroSala == null || numeroSala.isEmpty()) {
      throw new IllegalArgumentException("Número da sala não pode ser vazio.");
    }
    if (qtdLugares <= 0) {
      throw new IllegalArgumentException("Quantidade de lugares deve ser maior que zero.");
    }
    
    Model sala = new Model(local, numeroSala, qtdLugares);
    salas.add(sala);
  }
  public Model getSala(int index) {
    return salas.get(index);
  }

  public void atualizarSala(int index, String local, String numeroSala, int qtdLugares) {
    Model sala = salas.get(index);
    sala.setLocal(local);
    sala.setNumeroSala(numeroSala);
    sala.setQtdLugares(qtdLugares);
  }

  public void deletarSala(int index) {
    salas.remove(index);
  }
}
