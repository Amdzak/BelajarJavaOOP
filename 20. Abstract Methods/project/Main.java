package com.project;

import com.hero.HeroIntel;
import com.hero.HeroMagic;

/* 
 * Abstract Methods
 * 
 * Abstract Methods secara garis besar kegunaan nya yaitu setiap subclass yang ada harus memiliki methods tersebut
 * untuk penulisan syntax abstract methods yaitu hanya seperti ini :
 *      public abstract void display(); tanpa perlu adanya kurung kurawal dan keyword abstract berada di depan tipe data nya
 * maka nanti dia akan memaksa kepada sebuah turunannya unutk membuat method tersebut
 */

 class Main{
    public static void main(String[] args) {
        HeroIntel pemain1 = new HeroIntel("Nana", 100);
        pemain1.display();

        HeroMagic pemain2 = new HeroMagic("\nAtlas", 100);
        pemain2.display();
        

    }
}
