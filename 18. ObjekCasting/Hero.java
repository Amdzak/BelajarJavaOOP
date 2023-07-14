package com.project;

public class Hero {
    private String nama;
    private double nyawa;

    Hero(String nama, double nyawa){
        this.nama = nama;
        this.nyawa = nyawa;
    }

    // getter
    public double getNyawa(){
        return this.nyawa;
    }

    public String getNama(){
        return this.nama;
    }

    // setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNyawa(double nyawa){
        this.nyawa = nyawa;
    }

    void display(){
        System.out.println(this.nama + " Hero Biasa");
    }
}
