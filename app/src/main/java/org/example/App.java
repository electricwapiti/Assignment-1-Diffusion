package org.example;

public class App {
    public static void main(String[] args) {
      DiffusionModeler modeler = new DiffusionModeler();
      modeler.modelDiffusion(10,10);
      modeler.modelDiffusion(100,10);
      modeler.modelDiffusion(1000,10);
      modeler.modelDiffusion(10000,10);
      modeler.modelDiffusion(100000,10);
    }
}
