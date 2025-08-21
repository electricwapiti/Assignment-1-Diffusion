package org.example;

public class DiffusionModeler {  
  public int[] modelDiffusion(int steps, int trials) { 
    int[] positions = new int[trials];
    for (int i = 0; i < trials; i++){
      int currentPosition = 0;
      
      for(int j = 0; j < steps; j++){
        int direction = (int) Math.round(Math.random());
        if(direction == 0) {
          currentPosition--;
        } else {
          currentPosition++;
        }
      }
      positions[i] = currentPosition;
    }
    return positions;
  }
}
