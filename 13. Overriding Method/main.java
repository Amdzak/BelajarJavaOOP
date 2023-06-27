package com.project;

/* 
 * Overriding method
 * 
 * merupakan penimpaan method dengan nama yang sama yang ada pada super class
 * penimpaan ini berfungsi jika kita memiliki tambahan atribut baru di dalam subclass maka jika kita ingin menampilkan dengan nama yang sama
 * cara ini dapat di impelntasikan
 */

public class main {
    public static void main(String[] args) {
        hero pemain1 = new hero();
        pemain1.name = "Kilua";
        pemain1.display();

        herostrength pemain2 = new herostrength();
        pemain2.name = "Senku";
        pemain2.kekuatan = 0.20;
        pemain2.display();

    }
}
