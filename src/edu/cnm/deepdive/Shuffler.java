package edu.cnm.deepdive;

import java.util.Random;

public class Shuffler {

  private final Random rng;

  /**
   * Randomly shuffles
   * @param rng
   */
  public Shuffler(Random rng) {
    this.rng = rng;
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(int[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      int temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(short[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      short temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(long[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      long temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(char[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      char temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(byte[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      byte temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(float[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      float temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   */
  public void shuffle(double[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      double temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }

  /**
   * randomly shuffles
   * @param data
   * @param <T>
   */
  public <T> void shuffle(T[] data){
    for (int dest = data.length - 1; dest > 0; dest--){
      int source = rng.nextInt(dest + 1);
      T temp = data[dest];
      data[dest] = data[source];
      data[source] = temp;

    }
  }





}
