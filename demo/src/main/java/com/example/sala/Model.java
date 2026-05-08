package com.example.sala;

public class Model {
  private String local;
  private String numeroSala;
  private int qtdLugares = 0;

  public Model (String local, String numeroSala, int qtdLugares) {
    this.local = local;
    this.numeroSala = numeroSala;
    this.qtdLugares = qtdLugares;
  }

  public String getLocal() {
    return local;
  }
  public String getNumeroSala() {
    return numeroSala;
  }
  public int getQtdLugares() {
    return qtdLugares;
  }

  public void setLocal(String local) {
    this.local = local;
  }
  public void setNumeroSala(String numeroSala) {
    this.numeroSala = numeroSala;
  }
  public void setQtdLugares(int qtdLugares) {
    this.qtdLugares = qtdLugares;
  }
}
