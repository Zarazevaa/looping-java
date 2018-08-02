/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J06;
import java.util.Scanner;
/**
 *
 * @author ZEVA
 */
public class kalkulator {
    public static void main(String[] args) {
        char opr;
        double bil1, bil2;
        
        
        
        Scanner baca = new Scanner (System.in);
        
        
        System.out.print("masukkan bil1: " );
        bil1 = baca.nextDouble();
        System.out.print("masukkan operator: " );
         opr = baca.next().charAt(0);
        System.out.print("masukkan bil2: " );
         bil2 = baca.nextDouble();
       
       
        
        if (opr == '+')
        {
            System.out.print((bil1 + bil2));
        }
        else if (opr == '-')
        {
            System.out.print((bil1 - bil2));
        }
         if (opr == 'x')
        {
            System.out.print((bil1 * bil2));
        }
         else if (opr == '/')
        {
            System.out.print((bil1 / bil2));
        }
         if (opr == '%')
        {
            System.out.print((bil1 % bil2));
        }
         else if (opr == 'x')
        {
             System.out.print("Operator tidak valid");
        }
        else
            System.out.print("Operator tidak valid");
        }
    }
            
    

