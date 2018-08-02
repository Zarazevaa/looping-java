/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J07;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class contoh5 {
    public static void main(String[] args){
        
        Scanner baca = new Scanner (System.in);
        double bil1, bil2, hasil;
        char opr;
        
        System.out.print("Masukkan bilangan I: ");
        bil1 = baca.nextDouble();
        System.out.print("Masukkan bilangan II: ");
        bil2 = baca.nextDouble();
        System.out.print("Masukkan operator: ");
        opr = baca.next().charAt(0);
        
       switch(opr) 
       {
           case '+':
               hasil = bil1 + bil2;
               System.out.println(hasil);
               break;
           case '-':
               hasil = bil1 - bil2;
               System.out.println(hasil);
               break;
           case 'x':
               hasil = bil1 * bil2;
               System.out.println(hasil);
               break;
           case '/':
               hasil = bil1 / bil2;
               System.out.println(hasil);
               break;
           case '%':
               hasil = bil1 % bil2;
               System.out.println(hasil);
               break;
           default:
       }
               
           
       
        
    }
    
}
