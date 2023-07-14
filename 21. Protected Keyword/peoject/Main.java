package com.project;

import com.hero.HeroIntel;

/* 
 * Protected Keyword
 * 
 * Protected keyword merupakan sebuah keyword yang hanya bisa di akses oleh subclass
 * jika dalam konteks turunan(inheritance) keyword protedtecini hanya bisa di akses oleh subclass
 * dan superclass tidak dapat mengaksesnya jadi keyword ini berguna untuk pembatasan penggunaan dari sebuah atribut atau method
 * penempatan katakunci protected seperti penempatan public private final yaitu berada paling depan dari sebuah method atau atribut
 */

public class Main{

 public static void main(String[] args) {
    HeroIntel pemain1 = new HeroIntel("Gon");
    pemain1.display();

    // pemain1.getNama(); ini tidk bisa karena getNama hanya bisa di akses oleh subclassnya saja sedangkan class Main bukan merupakan sublcass nya
 }   
}
