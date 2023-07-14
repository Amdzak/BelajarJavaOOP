package com.hero;

public class HeroIntel extends Hero{
    private String tipe;

    public HeroIntel(String nama,double nyawa){
        super(nama, nyawa);
        this.tipe = "HeroIntel";
    }

    // pembuatan fungsi atau method karena di superclass di buat abstract
    public void display(){
        System.out.println(this.getNama() + " Hp : " + this.getNyawa() + " " + this.tipe);
    }
}
