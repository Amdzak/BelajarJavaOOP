package com.hero;

// Penggunaan keyword abstract berada di depan class
public abstract class Hero{
    private String nama;
    // private int nyawa;

    public Hero(String nama){
        this.nama = nama;
        // this.nyawa = nyawa;
    }

    public void display(){
        System.out.println("Nama "+ this.nama);
        // System.out.println("Nyawa "+ this.nyawa);
    }
}
