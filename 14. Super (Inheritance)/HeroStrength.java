package com.project;

public class HeroStrength extends Hero {
    String name = "Class Strength";

    /* akan menampilkan Class Strength */
    void display(){
        System.out.println("ini adalah " + this.name); 
        this.dumyMethod();
    }
    
    /* akan menampilkan Class Hero sebab ada super yang mana akan mengkases class parentnya */
    void displaySuper(){
        System.out.println("ini adalah " + super.name); 
        super.dumyMethod();
    }

    void dumyMethod(){
        System.out.println("Method ini berada di subClass");
    }
}
