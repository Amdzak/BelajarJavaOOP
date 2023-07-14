package com.hero;

public abstract class Hero{
    private String nama;
    private int level;

    public Hero(String nama){
        this.nama = nama;
        this.level = 1;
    }

    protected String getNama(){
        String get = "Hero " + this.nama + "Lv " + this.level;
        return get;
    }

    public abstract void display();
}
