package com.project;

public class Hero {
    String name;
    double health;

    Hero(String name,double health){
        this.name = name;
        this.health = health;
    }

    void display(){
        System.out.println("\nNama : " + this.name);
        System.out.println("Nyawa : " + this.health);
    }
}
