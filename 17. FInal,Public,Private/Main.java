package com.project;

/* 
 * Final,Public,Private Keyword
 * 
 *  Public  Merupapakn sebuah keyword yang bisa di lihat dan di pakai oleh class manapun, dia juga dapat di turunkan jika
 *          menggunakan inheritance, tapi jika di dalam inheritance di superclass menggunkan public maka di subclass juga
 *          harus menguunaan public 
 * 
 *  Private Merupakan sebuah keyword yang akan membuat tidak dapat di akses oleh class manapun, jika sudah menggunakan 
 *          Ketword Private maka yang bisa mengakses hanyalah getter
 * 
 *  Final   Merupakan sebuah keyword yang dia bisa di turunkan tetapi dia tidak dapat di override atau di timpa
 *          Tetapi dalam class yang sama keyord final dapat di Overload
 * 
 * kesimpulan nya keyword final merupakan sebuah keyword yang nilainya sudah di tidak dapat di ganti lagi
 *      keyword private akan membuat nilainya tidak dapat di akses 
 *      keyword public dapat di akses siapapun tetapi jika di turunkan turunanya harus memiliki keyword yang sama
 */

public class Main {
    public static void main(String[] args) {
        Hero pemain1 = new Hero("Gon",100);
        HeroIntel pemain2 = new HeroIntel("Killua",100);

        pemain1.display();
        pemain2.display();

        // kita mencoba getter dikedua variabel pemain ternyata bisa di gunakan 
        System.out.println(pemain1.getNyawa());
        System.out.println(pemain2.getNyawa());

        // disini kita mencoba setter di kedua variabel pemain
        pemain1.SetNyawa(120);
        pemain2.SetNyawa(130);
        pemain1.display();
        pemain2.display();
        
        //disini kita mencoba menggunakan method overload 
        pemain1.SetNyawa("reset");
        pemain1.display();

        pemain2.SetNyawa("reset");
        pemain2.display();
    }
}
