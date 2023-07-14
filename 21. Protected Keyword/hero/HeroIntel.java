package com.hero;

public class HeroIntel extends Hero{
    public HeroIntel(String nama){
        super(nama);
    }

    public void display(){
        System.out.println(this.getNama());
    }
}
