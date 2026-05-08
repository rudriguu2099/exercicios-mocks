package com.example;
import com.example.sala.*;
public class Main {
  public static void main(String[] args) {
    Service service = new Service();
    Controller controller = new Controller(service);
    controller.cadastrarSala("Sao Paulo", "101", 50);
    controller.cadastrarSala("Rio de Janeiro", "202", 30);
    controller.cadastrarSala("Quixadá", "666", 333);

    System.out.println("Salas criadas:");
    controller.getSalas().forEach(sala -> System.out.println(sala.getLocal() + " - " + sala.getNumeroSala() + " - " + sala.getQtdLugares()));

    controller.atualizarSala(1, "Rio de Janeiro", "202A", 35);
    controller.deletarSala(0);
    System.out.println("\nSalas após atualização:");
    controller.getSalas().forEach(sala -> System.out.println(sala.getLocal() + " - " + sala.getNumeroSala() + " - " + sala.getQtdLugares()));
  }
}
