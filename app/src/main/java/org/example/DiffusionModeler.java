package org.example;

/**
 * Simulates a one-dimensional diffusion process and prints the results for each trial.
 *
 * param: steps The number of steps (N) each trial will take.
 * param: trials The number of trials (M) to simulate.
 *
 * return: This method does not return a value; it prints the results in tabular format:
 *         Number of Steps (N), Trial Number (M), Final Position (D), and Time Taken (µs).
 **/
public class DiffusionModeler {  
  public void modelDiffusion(int steps, int trials) {
    System.out.println("Number of Steps (N)\tTrial Number (M)\tFinal Position (D)\tTime Taken (µs)");
    
    for (int i = 0; i < trials; i++){
      long startTime = System.nanoTime();
      int currentPosition = 0;
      
      for(int j = 0; j < steps; j++){
        int direction = (int) Math.round(Math.random());
        if(direction == 0) {
          currentPosition--;
        } else {
          currentPosition++;
        }
      }

      long endTime = System.nanoTime();
      long timeTaken = endTime - startTime;
      long timeTakenMicro = timeTaken / 1_000;
      System.out.printf("%d\t%d\t%d\t%d%n", steps, i, currentPosition, timeTakenMicro);
    }
  }
}
