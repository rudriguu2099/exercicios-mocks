package com.example.sala;
import java.util.ArrayList;

public class Controller {
  private Service service;

  public Controller(Service service) {
    this.service = service;
  }

  public void cadastrarSala(String local, String numeroSala, int qtdLugares) {
    service.cadastrarSala(local, numeroSala, qtdLugares);
  }
  public Model getSala(int index) {
    if (index < 0 || index >= service.getSalas().size()) {
      throw new IndexOutOfBoundsException("Index inválido: " + index);
    }
    return service.getSala(index);
  }
  public ArrayList<Model> getSalas() {
    return service.getSalas();
  }

  public void atualizarSala(int index, String local, String numeroSala, int qtdLugares) {
    service.atualizarSala(index, local, numeroSala, qtdLugares);
  }

  public void deletarSala(int index) {
    service.deletarSala(index);
  }
}
