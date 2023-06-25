package com.project;

import com.terminal.Console;

// kita bisa mengunakan class saja tanpa menggunakan keyword sebab dai berada dalam 1 folder yang sama dengan main
class Player {
    private String nama;

    Player(String nama){
        this.nama = nama;
    }

    String getNama(){
        return this.nama ;
    }

    void show(){
        System.out.println("Menggunakan class palyer");
        System.out.println("nama pemain: " + this.nama);
    }
}
