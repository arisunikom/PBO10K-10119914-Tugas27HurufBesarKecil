/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas27;
import java.util.Scanner;
/**
 *
 * @author 
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        var Keyboard = new Scanner(System.in);
        System.out.println("Masukan Kalimat : ");
        kalimat = Keyboard.next();
        
        System.out.println("\n===== Hasil Formating =====");
        System.out.println("Huruf Besar : ".concat(kalimat.toUpperCase()));
        System.out.println("Huruf Kecil : ".concat(kalimat.toLowerCase()));
    }
    
}
