package com.project;

/* 
 * Inheritance (Pewarisan)
 * 
 * pada java OOP kita mengenal istilah inheritance 
 * yang berfungsi untuk menurunkan sebuah atribut/method yang ada pada suatu class tersebut
 * kyeword inheritance yaitu adalah extends 
 * contoh penulisan
 *  class pemain extends Hero {
 * 
 *  }
 * 
 * di atas memiliki arti bahwa class pemain akan mewariskan sebuah atribut atau method yang ada pada class Hero
 */

public class main{
    public static void main(String[] args) {
        Hero pahlawan = new Hero();
        pemain main = new pemain();

        pahlawan.name = "wawan";
        pahlawan.display();
        
        main.name = "ntah";
        main.display();
    }
}
