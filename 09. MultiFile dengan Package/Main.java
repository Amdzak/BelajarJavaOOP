package project;

/* 
 * Mulfi file dengan package 
 * 
 * dalam materi nin kita akan membuat file lain dengan package atau lokasi yang berbeda
 * yang mana seperti kita membuat file CSS baru di tempat lain lalu kita akses 
 * jika penampatan file tersebut dalam 1 folder yang saam maka pengaksesan sebuah file dapat di akses dengan memanggil classnya saja
 * 
 * jika file tersebut ada pada sebuah folder terpisah maka kita dapat mengaksesnya dengan menggunkaan import
 * tinggal kita tulisa saja seperti ini 
 *      import namaFolder.namaFolder.NamaFile;
 */

import Terminal.Console;

public class main{
    public static void main(String args[]){
        Player pemain1 = new Player("Minato");

        pemain1.show();

        Console.log("Hello World");
    }
}
