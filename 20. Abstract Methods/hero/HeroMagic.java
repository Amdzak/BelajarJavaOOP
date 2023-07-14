package com.hero;

public class HeroMagic extends Hero{
    private String tipe;

    public HeroMagic(String nama,double nyawa){
        super(nama, nyawa);
        this.tipe = "HeroMgic";
    }

    // pembuatan fungsi atau method karena di superclass di buat abstract
    public void display(){
        System.out.println(this.getNama() + " Hp : " + this.getNyawa() + " " + this.tipe);
    }
}
