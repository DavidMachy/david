/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package úloha1;

import java.util.Scanner;

/**
 *
 * @author xmacd02
 */
public class Úloha1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Zadej Jmeno:");
        String jmeno = sc.nextLine();
        System.out.print("Zadej vek:");
        String vek = sc.nextLine();        
        System.out.print("Zadej hmotnost v kg:");
        String hmotnost = sc.nextLine();        
        System.out.print("Zadej vysku v cm:");
        String vyska = sc.nextLine();        
        System.out.print("Zadej oblibenou barvu:");
        String barva = sc.nextLine();        
        double bmi = Double.parseDouble(hmotnost)/((Double.parseDouble(vyska)/100.0)*(Double.parseDouble(vyska)/100.0));
        System.out.print("Cloveku jmenem " + jmeno + " je " + vek + " let,váží " + hmotnost + " kg a meri " + vyska + " cm. Jeho oblibena barva je " + barva + ". Vaše BMI je " + bmi);
              
    }
    
}
