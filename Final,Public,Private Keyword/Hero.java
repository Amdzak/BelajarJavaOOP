package com.project;

public class Hero {
    String nama;
    private double nyawa;


    Hero(String nama,double nyawa){
        this.nama = nama;
        this.nyawa = nyawa;
    }

    // getter
    double getNyawa(){
        return this.nyawa;
    }

    //setter dengan final
    final double SetNyawa(double nyawa){
        return this.nyawa = nyawa;
    }

    // overload setter 
    void SetNyawa(String nama){
        if (nama.equals("reset")) {
            System.out.println("Nyawa telah di Reset");
            this.nyawa = 100;
        }
    }

    public void display(){
        System.out.println(this.nama + " Memiliki Hp " + this.getNyawa()); //disini private nyawa dapat di ambil hanya dengan getter
    }
}
