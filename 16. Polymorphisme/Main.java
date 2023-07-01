package com.project;

/* 
 * Polymorphisme atau banyak bentuk
 * 
 * Polymorphisme merupakan sebuah cara untuk membuat 1 class yang dapat di gunakan oleh class yang lain
 * jadi begini jika dalam inheritance ada yang namanya supercalss dan subclass 
 * nahh subclass pasti termasuk dari superclass tetapi super class tidak ermasuk dari subclass
 * polymorphisme sendiri juga memudahkan kita dalam membuat berbagai banya bentuk jika ingin memanggil dalam suatu method
 * polymorphisme sendiri bakal terlihat jiksa kita sudah bermain di interface
 * contoh kasus : 
        class Hero{
            String name;
            double nyawa,att;
        }
        
        class HeroStrength extends Hero{
        
        }
        
        class HeroIntell extends Hero{
        
        }
        
        public static void main(Hero musuh){ // DISINILAH POLYMORPHISME DI PAKAI
            
        }
 *      
 * dari kasusu di atas ada method main yang memiliki parameter Hero yang mana dia adalah superclass
 * jadi jika ada class lain yang menjadi subclass dari Hero maka dia bisa masuk dalam method main
 */



public class Main{
    public static void main(String[] args) {
        // Tipe data hero dengan membuat objek Hero
        Hero pemain1 = new Hero("Killua");
        // Tipedata Herofighter dengan membuat objek HeroFighter
        HeroFighter pemain2 = new HeroFighter("Gon");
        // Tipedata Herofighter dengan membuat objek HeroMagic
        Hero pemain3 = new HeroMagic("Kurapika");
        Hero pemain4 = new HeroSniper("Lesley");

        // semua tipe data dapat di display dengan baik di karenakan method display ada di superclass
        pemain1.display();
        pemain2.display();
        pemain2.showoff();
        pemain3.display();
        pemain4.display();

        //JIka kita memasukan kedalam sebuah array list yang bertipe data hero apakah bisa di displau juga?
        Hero[] pahlawan = new Hero[4];
        pahlawan[0] = pemain1;
        pahlawan[1] = pemain2;
        pahlawan[2] = pemain3;
        pahlawan[3] = pemain4;

        // pahlawan[1].showoff(); bakal gagal karena method showoff hanya ada di class HeroFighter dan di araylist ini sudah di CASTING dengan tipe class HERO

        pahlawan[0].display(); //bisa muncul karena method display ada

        pemain1.Serang(pemain4); //disinilah letak polimorphisme ada pada method serang

    }
}
