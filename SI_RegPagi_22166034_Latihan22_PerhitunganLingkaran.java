/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166034_latihan22_perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 * Nama     : Nur Hidayah
 * Kelas    : PBO 022
 * NIM      : 22166034
 * Deskripsi Program : Perhitungan Lingkaran
 */
public class SI_RegPagi_22166034_Latihan22_PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("======Perhitungan Lingkaran======");
        System.out.println(); 
        
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari lingkaran
        System.out.print("Masukkan nilai diameter lingkaran: ");
        double diameter = scanner.nextDouble();
        
        // Perhitungan
        double jariJari = diameter / 2;
        double luas = Math.PI * Math.pow(jariJari, 2);
        double keliling = 2 * Math.PI * jariJari;

        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println();
        
        // Output hasil perhitungan
        System.out.println("jariJari lingkaran : " + jariJari );
        System.out.println("Luas lingkaran : " + luas);
        System.out.println("Keliling lingkaran : " + keliling);
            
    } private static double konversiKeCm(double nilai) {
            //contoh sederhana: 1 satuan ke cm
            return nilai * 2.54; // 1 inci = 2.54 cm
        }
}  
