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
public class contoh4 {
    public static void main(String[] args){
        String huruf;
        Scanner baca = new Scanner(System.in);
      
        System.out.print("Masukkan Hanya 1 huruf: ");
        huruf = baca.nextLine();
        
        
       if (huruf.equals("A")|| huruf.equals("I")|| huruf.equals("U")|| huruf.equals("E")|| huruf.equals("O")||huruf.equals("a")||huruf.equals("i")||huruf.equals("u")||huruf.equals("e")||huruf.equals("o"))
       { 
           System.out.println("Huruf Vokal");
       }
       else if (huruf.equals(""))
               {
                   System.out.println("Input kosong, Harap masukkan huruf");
               }
       else
       {
           System.out.println("huruf Konsonan");
       }
       }
}
