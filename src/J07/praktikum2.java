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
public class praktikum2 {
    public static void main(String[] args){
        String identitas = "Zara Zeva Az Zurra / X RPL 3 / 40";
        System.out.println("identitas : "+ identitas);
        
        System.out.print("\nSaran Resep dari Bahan milik Anda\n");
        
        Scanner baca = new Scanner(System.in);
        
        System.out.println("Bahan pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukkan no pilihan Anda :");
        int bahan1 = baca.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            } else{
                System.out.println("1. minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }                       
        }
        else{
        System.out.println("Mohon maaf, pilihan tidak ditemukan, "
                + "tidak dapat memberikan saran resep");
        }
        
        System.out.print("Masukkan no pilihan Anda :");
            int bahan2 = baca.nextInt();
        
        if(bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat milk shake banana"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat psang goreng"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat pisang rebus");
                }
            else 
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat sandwich telur"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat telur rebus");
                }
            
        }else
            System.out.println("Mohon maaf, pilihan tidak ditemukan,"
                    + "tidak dapat memberikan saran resep");
        }
    }
    

