package com.project;

/* 
 * Objek casting
 * 
 * casting merupakan penggantian nilai dari tipe data tertentu seperti ini 
 *      double nilai = 1.23;
 *      (int) nilai;    //ini akan menganti nilai daouble menjadi integer
 * 
 * lalu disini kita akan mencobanya pada sebuah objek apakah bisa kita casting?
 * didalam oop casting memiliki 2 tipe yaitu CASTING UP dan CASTING DOWN
 * 
 * casting up merupakan sebuah casting yang akan merubah ke superclassnya
 *      jika kita melakukan up casting maka ada beberapa atribut yang hilang
 * 
 * casting down merupakan sebuh casting yang akan merubah menjadi lebih rendah seperti superclass ke subclass
 *      Jika dilakukan downcasting maka akan terjadi error di karenakan tidak bisa dari superclass ke subclass 
 * 
 * JIka ingin downcasting akan bisa terjadi tetapi dengan syarat nilai awalnya harus sama
 * seperti kembali lagi kebentuk asalnya
 * 
 * casting ini berguna untuk melakukan polimorphisme tanpa kita sadari melakukan polimorphisme maka kita juga melakukan casting objek
 */

public class Main {
    public static void main(String[] args) {
        // pembuatan objek denngan class HeroIntel
        HeroIntel pemain1 = new HeroIntel("Panji", 100);
        pemain1.display();
        System.out.println(pemain1.tipe); //atribut pada HeroIntel ada sebelum di casting

        // MELAKUKAN CASTING UP
        Hero castUp = (Hero)pemain1; //ini sudah merubah tipe classnya yang awalnya HeroIntel manjadi Hero
        castUp.display();
        // System.out.println(castUp.tipe); ini tidak ada dan akan error karena sudah di casting

        Hero pemain2 = new Hero("Kucing", 100);
        pemain2.display();

        // MELAKUKAN DOWN CASTING
        // HeroAgility castDown = (HeroAgility)pemain2;
        // castDown.display();

        // MENGEMBALIKAN NILAI YANG SUDAH DI CASLTING
        HeroIntel pemain3 = (HeroIntel)castUp;
        pemain3.display();
    }
}
