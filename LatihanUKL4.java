//Buatlah program menghitung volume tabung dengan menggunakan konsep fungsi. Sertakan parameter dalam fungsi tersebut 

import java.util.Scanner;

public class LatihanUKL4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jariJari = 0;
        double tinggi = 0;
        double phi = 3.14;

        //Inputan
        System.out.println("=====Menghitung Volume Tabung=====");
        System.out.println();
        System.out.println("Masukkan jari-jari");
        jariJari = input.nextDouble();
        System.out.println("Masukkan tinggi");
        tinggi = input.nextDouble();
        System.out.println("Anda memasukkan jari-jari: " + jariJari + " cm");
        System.out.println("Anda memasukkan tinggi: " + tinggi + " cm");
        System.out.println("Phi yang digunakan: " + phi);

        //Output
        System.out.println("Volume tabung adalah: " + jariJari* jariJari * tinggi * phi);
        
    }
}

