package org.example;

import java.util.Arrays;

public class DiffusionModeler {
  // This is just an example class to demonstrate how everything works
  // You should delete this file when you implement your own solution
  
  public String modelDiffusion(int steps, int trials) {
    int[] positions = new int[trials];
    for (int i = 0; i < trials; i++){
      //TODO: Time this section of code
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
      positions[i] = currentPosition;
    }
    return Arrays.toString(positions);
  }
}
