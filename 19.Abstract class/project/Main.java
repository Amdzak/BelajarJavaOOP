package com.project;
// import com.hero.Hero; ini sudah tidak di perlukan karena bertipe abstract dan tidak dapat di gunakan
import com.hero.HeroIntel;
import com.hero.HeroAgility;

/* 
 * Abstract class
 * 
 * Abstract merupakan sebuah keyword yang mana kita memaksa sebuah subclass untuk mengambil turunan dari si superclass
 * penggunaan keyword abstract ini memiliki tujuan supaya superclass nya tidak dapat di buat sebagai objek untuk lebih mudahnya abstract ini bisa sebagai tamplate
 * 
 * untuk mempermudah pemahaman Abstract itu mirip dengan inheritance hanya memiliki perbedaan di bagian turunan nya
 * jika inheritance dia akan menurunkan semua perilakunya keapada subclass
 * sedangkan jika abstract dia akan memaksa menurunkan kepada subclassnya jadi di bagian subclassnya itu harus memiliki konponen yang ada pada superclass
 * 
 */

public class Main{ 
    public static void main(String[] args){
        // ini sudah tidak bisa karena Class hero sudah memiliki keword abstract
        // Hero pemain1 = new Hero(); 

        // pembuatan objek dari turunan superclass
        HeroIntel pemain2 = new HeroIntel("Panji");
        pemain2.display();

        HeroAgility pemain3 = new HeroAgility("Sumantao");
        pemain3.display();
    }
}
