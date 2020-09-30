/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class OperatorSc {
    public static void main(String[] args) {
  int x, y, z;

  x = 10;
  y = 20;
  z = 30;

  // T T
  // T F
  // F T
  // F F

  //SET A
  boolean a = (x < z) && (x == x);
  boolean b = (x < z) && (x == z);
  boolean c = (x == z) && (x < z);
  boolean d = (x == z) && (x > z);
  //SET B    
  boolean aa = (x < z) & (x == x);
  boolean bb = (x < z) & (x == z);
  boolean cc = (x == z) & (x < z);
  boolean dd = (x == z) & (x > z);

}
}
