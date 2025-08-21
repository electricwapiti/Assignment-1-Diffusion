package org.example;

public class App {
    public static void main(String[] args) {
      DiffusionModeler modeler = new DiffusionModeler();
      System.out.println(modeler.modelDiffusion(10, 10));
    }
}
