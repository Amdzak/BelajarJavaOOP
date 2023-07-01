package com.project;

/* 
 * untuk membuat constructor pada subclass di perlukan paramater dengan tipedata yang sama dengan constructor parent
 * lalu kita menggunakan keyword super() untuk menggunakan constructor dari di parent
 */

public class HeroStrength extends Hero {
    
    HeroStrength(String nama,double nyawa){
        super(nama, nyawa);
    }
}
