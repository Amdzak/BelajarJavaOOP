package com.project;

/* 
 * Overloading constructor dan method 
 * 
 * merupakan sebuah cara untuk membuat sebuah cara untuk membuat metode dengan nama yang sama tapi kelakuanya beda
 * contoh 
 *  Player pemian1 = new Player("Hallo dunia");
 *  Player pemian2 = new Player();
 * 
 * contoh di atas merupakan sebuah contoh dimana ada 2 keadaan yang satu ada namanya dan yang satu tidak ada namanya
 * di sinilah fungsi atau peran overloading berguna yaitu kita membuat 2 kemungkinan yang ada 
 * dengan cara membuat method yang ada parameter dan tidak ada parameter
 */

public class main {
    public static void main(String[] args) {

        // overloading constructor
        Player pemain1 = new Player("Wawan");
        Player pemain2 = new Player();
        Player pemain3 = new Player();
        Player pemain4 = new Player("Kilua");

        pemain1.show();
        pemain2.show();
        pemain3.show();
        pemain4.show();

        // overloading method
        int a = Math.tambah(10, 2);
        System.out.println(a);
        double b = Math.tambah(2,0.98);
        System.out.println(b);
    }    
}
