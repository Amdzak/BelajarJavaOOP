// 2023/04/05 12:01

/*
  Class merupakan sebuah pembungkus aatau di ibaratkan sebagai sebuah wadah unutk menenpatkan / mewujudkan sebuah objek
  jika kita sudah memberi nama class maka nama class tersebuh bisa menjadi tipe data contoh pemahamanya seperti ini 
    DALAM JAVA DASAR :
        int nama = 5; ---> nama bisa di gunakan lagi sebagai sebuah variabel 
                            nama += 5;
    DALAM CLASS :
        class kue {} ---> class dgn nama kue, kata kue bisa di jadikan tipe data dengan menambhakan kata new 
                            kue manis = new kue();  ---> kue menjadi tipe data dan manis mejadi variabel sama seperti penggunakan metode dan parameternya jika di java dasar
    
  syntax penulisannya sendiri adalah :

    class namaVariabel {
        
    }

    class Kucing{

    }


  Pemberian data pada class bisa di lakukan dengan menggunakan tipe data yang ada pada java
  pemberian nama pada class di lakukan seperti pemberian deklarasi 
  contoh
    class mahasiswa{
        String nama; //ini contoh memberi kan sebuah data kepada class
    }
  untuk melakukan pemanggilan data pada class kita yang perlu melakukan nya dengan cara memberi . dan nama variabel yg sudah di deklarasikan
   contoh 
    void main(String[] args){
        mahasiswa siswa = new mahasiswa();
        siswa.nama = "Ahmad";  //unutk pemnggilan data yang dala pada class yaitu seperti ini
    }    
 */



//MEMBUAT CLASS BARU DENGAN NAMA BEBAS

class mahasiswa{
    String nama;
    String nim;
    String kelas;
    int umur;


}

public class Main { 
    public static void main(String[] args) {
        
        //INSTASIASI ATAU MEMBUAT OBJEK BARU DARI SEBUAH CLASS
        mahasiswa anggota = new mahasiswa();//instasiasi di tandai dengan kata NEW

        //PENGGUNAAN DAN PEMANGGILAN
        anggota.nama = "Ahmad";
        anggota.nim = "2231730098";
        anggota.kelas = "1D";
        anggota.umur = 20;

        //MENAMPILKAN
        System.out.println(anggota.kelas);
        System.out.println(anggota.nama);
        System.out.println(anggota.nim);
        System.out.println(anggota.umur);


        //INSTASIASI ATAU MEMBUAT OBJEK BARU DARI SEBUAH CLASS
        mahasiswa anggota1 = new mahasiswa();//instasiasi di tandai dengan kata NEW

        //PENGGUNAAN DAN PEMANGGILAN
        anggota1.nama = "Ahmad";
        anggota1.nim = "2231730098";
        anggota1.kelas = "1D";
        anggota1.umur = 20;

        //MENAMPILKAN
        System.out.println(anggota1.kelas);
        System.out.println(anggota.nama);
        System.out.println(anggota.nim);
        System.out.println(anggota.umur);
    }
}
