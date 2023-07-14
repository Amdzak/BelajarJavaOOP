package com.project;

public class HeroIntel extends Hero{

    HeroIntel(String nama,double nyawa){
        super(nama,nyawa);
    }

    // contoh bahwa jikak superclass memiliki keyowrd public maka subclassnya juga harus sama
    public void display(){
        System.out.println(this.nama + " Memiliki Hp " + this.getNyawa()); //disini private nyawa dapat di ambil hanya dengan getter
    }
    
}
