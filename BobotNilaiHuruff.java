/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bobotnilaihuruff;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class BobotNilaiHuruff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); 
    String huruf = "";
    System.out.println("Masukkan nilai huruf (A - E)");
    huruf = input.nextLine();
    
    switch(huruf){
        case "A":
            System.out.println("4");
            break;
        
            case "a":
            System.out.println("4");
            break;
            
            case "B":
            System.out.println("3");
            break;
            
            case "b":
            System.out.println("3");
            break;
            
            case "C":
            System.out.println("2");
            break;
            case "c":
            System.out.println("2");
            break;
            case "D":
            System.out.println("1");
            break;
            case "d":
            System.out.println("1");
            break;
            case "E":
            System.out.println("0");
            break;
            case "e":
            System.out.println("0");
            break;
            
        
        default:
            System.out.println("Hurus tidak terdaftar");
            break;
        
    }
    }
    
}
