package com.project;

public class Hero {
    String nama;

    Hero(String name){
        this.nama = name;
    }

    void display(){
        System.out.println("\nNama : " + this.nama);
    }

/* 
 * disinilah polimorphisme terjadi
 * yaitu pada method Serang ada parameter Hero yang mana kita bisa memasukan banyak jenis class turunan kedalam method ini
 * seperti namanya yaitu banyak bentuk 
 */ 
    void Serang(Hero attack){
        System.out.println(this.nama + " menyerang " + attack.nama);
    }
}
