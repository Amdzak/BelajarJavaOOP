package com.project;

public class HeroIntel extends Hero{
    String tipe;

    HeroIntel(String nama,double nyawa){
        super(nama, nyawa);
        this.tipe = "Intel";
    }

    public void display(){
        System.out.println(this.getNama() + " adalah " + this.tipe );
    }
}
