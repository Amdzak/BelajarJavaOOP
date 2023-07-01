package com.project;

/* 
 * Constructor pada Subclass 
 * 
 * jika kita membuat sebuah inheritance pada subclass dan kita ingin membuat consturctor pada subclass tersebut maka
 * ada sebuah cara yaitu dengan menggunakan keyword super() dia sudak mengidentifikasi sebagai constructor
 */

public class Main{
    public static void main(String[] args) {
        Hero pemain1 = new Hero("Zoro", 100);
        HeroStrength pemain2 = new HeroStrength("Sanji", 100);

        pemain1.display();
        pemain2.display();
    }
}
