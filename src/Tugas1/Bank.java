/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class Bank {
    //variabel saldo
    int saldo;
    //konstruktor
    public Bank(int uang){
        this.saldo = uang;
    }
    //method simpan,ambil, dan tampilkan saldo
    public void simpanUang(int x){
        System.out.println("\nSimpan Uang: Rp. "+x);
        saldo = saldo + x;
    }
    void ambilUang(int x){
        System.out.println("\nAmbil Uang: Rp. "+x);
        saldo = saldo - x;
    }
    void getSaldo(){
        System.out.println("Saldo saat ini: Rp. "+saldo);
    }

}