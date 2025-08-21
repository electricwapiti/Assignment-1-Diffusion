package org.example;
import java.util.Arrays;

public class DiffusionModeler {  
  public String modelDiffusion(int steps, int trials) {
    int[] positions = new int[trials];
    for (int i = 0; i < trials; i++){
      long startTime = System.currentTimeMillis(); //Time this section of code
      int currentPosition = 0;
      //random number generation Java
      for(int j = 0; j < steps; j++){
        int direction = (int) Math.round(Math.random());//generate random number java
        if(direction == 0) {
          currentPosition--;
        } else {
          currentPosition++;
        }
      }

      long endTime = System.currentTimeMillis();
      long timeTaken = endTime - startTime;
      System.out.printf("%d\t%d\t%d\t%d%n", steps, i, currentPosition, timeTaken);
      positions[i] = currentPosition;
    }
    return Arrays.toString(positions);
  }
}
