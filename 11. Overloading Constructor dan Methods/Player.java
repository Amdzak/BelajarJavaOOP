package com.project;

/* 
 * Disinilah peran overloading method dia membuat beberapa kemungkinan yang ada supaya dapat menangkap salah satunya
 */

public class Player {
    private String nama;
    private static int jumlah;

    Player (String nama){
        int nilai = Player.jumlah++;
        this.nama = nama;
    }

    Player(){
        int nilai = Player.jumlah++;
        this.nama = "Player" + nilai;
    }

    void show(){
        System.out.println("Nama : " + this.nama);
    }
}
