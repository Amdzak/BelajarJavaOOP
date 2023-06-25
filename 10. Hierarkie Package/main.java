package com.project;

/* 
 * Hierarkie Package
 * hirarkie package merupakan sebuah tataan dalam membuat package
 * didalam package  biasanya memiliki beberapa file dan di dalam file memiliki beberapa class
 * didalam class tersebut memiliki keyword yang mengatur tatanan nya
 * public (bisa di lihat oleh semua class karena public )   => public class Player
 * default(visible hanya bisa dilihat oleh main dalam artinya dia berada dalam 1 file)     => class Player
 * 
 * import static merupakan sebuah import yang akan mengambil static metode dari class tersebut
 * 
 */

//  ini akan menginport class console secara keseluruhan
 import com.terminal.Console;

//  ini hanya mengambil lognya saja atau metode static dari clas Console
 import static com.terminal.Console.log;

public class main {
    public static void main(String[] args) {
        Player pemain1 = new Player("Ahmad");
        pemain1.show();
        System.out.println();

        Console.log("Menampilkan data dengan Console.log");
        Console.log(pemain1.getNama());

        log("Menampilkan data dengan log saja");
        log(pemain1.getNama());
    }
}
