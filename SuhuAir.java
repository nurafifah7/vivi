/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;
import java.util.Scanner;

/**
 *
 * @0zura
 */
public class SuhuAir {
    public static void main (String [] args) {
        int T ; //ini rumus
        System.out.println(" Contoh If tiga kasus");
        System.out.println("Suhu (der. C) = ");
        
        //scanner untuk masukan suhu air
        Scanner scanner = new Scanner ( System.in);
        T = scanner.nextInt(); // masukan air dengan tipe in
        
        //proses pengecekean dengan if
        if (T < 0) {
            System.out.println("Wujud air beku" + T);
        } else if ( (0 <= T) && ( T <= 100)) {
            System.out.println("Wujud air cair" + T);
        } else if ( T > 100){
            System.out.println("Wujud air uap/gas" + T);
        }
    }
}
