package com.project;

public class HeroAgility extends Hero{
    String tipe;

    HeroAgility(String nama,double nyawa){
        super(nama, nyawa);
        this.tipe = "Agility";
    }

    public void display(){
        System.out.println(this.getNama() + " adalah " + this.tipe );
    }
}
