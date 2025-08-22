package org.example;

public class App {
    public static void main(String[] args) {
      DiffusionModeler modeler = new DiffusionModeler();
      System.out.println("Number of Steps (N)\tTrial Number (M)\tFinal Position (D)\tTime Taken (ms)");

      runAndPrint(modeler, 10, 10);
      runAndPrint(modeler, 100, 10);
      runAndPrint(modeler, 1000, 10);
      runAndPrint(modeler, 10000, 10);
      runAndPrint(modeler, 100000, 10);
    }

    private static void runAndPrint(DiffusionModeler modeler, int steps, int trials) {
      for (int i = 0; i < trials; i++) {
          int[] result = modeler.modelDiffusion(steps, 1); // single trial
          System.out.printf("%d\t%d\t%d%n", steps, i + 1, result[0]);
          //Compute timing information thru benchmark, then manually create table
          
          // for each combination of steps & trials
          //main fxn -- final output distance
          //benchmark -- avg time over trials


      }
    }
}
