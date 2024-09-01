/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author Asus
 */
public class BankBeraksi {
    public static void main(String[] args) {
        System.out.println("Selamat Datang di Bank ABC");
        //objek Bank
        Bank duit = new Bank(100000);
        duit.getSaldo();
        //method untuk simpan, ambil, dan cek saldo
        duit.simpanUang(500000);  
        duit.getSaldo();
        duit.ambilUang(150000);
        duit.getSaldo();
    }
}