package com.project;

/* 
 * Super
 * 
 * super merupakah atribut dari this
 * 
 * super merupakan sebuah cara untuk membagi bagi yang mana yang akan di tampilkan
 * perbedaan signifikan dari overriding yaitu overriding dia akan menghapus fungsi dari class utama
 * sedangakan jika super dia akan melakukan pembagian yang mana yang akan digunakan
 * 
 * jika kita membuat this.name maka dia akan mengakses variable global yang ada pada class tersebut
 * jika kita membuat super.name maka dia akan mengakses variable global yang ada pada class parent atau superclass
 * 
 */

class main{
    public static void main(String[] args) {
        Hero pemain1 = new Hero();
        HeroStrength pemain2 = new HeroStrength();

        pemain1.display();
        pemain2.display();
        pemain2.displaySuper();
    }
}
