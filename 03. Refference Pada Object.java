//2023/04/20 15:49

/*
 * Reference pada object 
 * 
 * Reference pada object merupakan sebuah addres yang merujuk pada sutu tempt objek itu berada
 * jika terjadi kesamaan pada address maka akan mengakibatkan kesalahkan dalam system untuk memahami addres mana yang akan di tuju
 * langsung saja untuk memahami codingan berikut ini 
 * 
 * garis besar pada materi ini adalah
 *  jika kita memlakukan pembuatan objek baru pada suatu main meotde jangan sampai kita melakukan assingment terhadap suatu objek 
 *  sebab jika itu terjadi maka akana da suatu kesalahan yan di namakan pass by reffrece yang mana kita hanya mengubah 1 objek dan seluruh objeknya akan ikut terganti
 * 
 */

class film{
    String judul;
    int harga;

    film(String judul,int harga){
        this.judul = judul;
        this.harga = harga;
    }

    void tampilkan(){
        System.out.println("\nJudul film\t " + this.judul);
        System.out.println("Harga film\t " + this.harga);
    }
}

public class Main{
    public static void main(String[] args) {
        film bioskop = new film("Kucing Slato",20000);
        bioskop.tampilkan();

        // untuk melihat addressnya  bioskop
        String addresBioskop = Integer.toHexString(System.identityHashCode(bioskop));
        System.out.println(addresBioskop); //untuk melihat addresnya

        //jika kita melakukan assigmnet ebuah objek tenata dengan kata-kata new

        film bioskop2 = bioskop;
        bioskop2.tampilkan(); //akan menampilkan hasil yang sama seperti yang awal

        String addresBioskop2 = Integer.toHexString(System.identityHashCode(bioskop2));
        System.out.println(addresBioskop2); //untuk melihat addresnya
        // Maka yang terjadi adalah addresnya sama dan akan mengakibatkan salah perhitungan jika kita melakukan pergantian di salah satu variabel dan akan mengakibatkan ketidak sesuaian hasil
        
        bioskop.judul = "Kucing Lompat";
        bioskop.tampilkan();
        bioskop2.tampilkan(); 
        // Maka akan terjadi kesamaan pada 2 buah program yang berbahaya jika kita melakukan pengambilan data pada suatu fungsi dan kita yang awalnya ingin menganti 1 data saja maka akan terjai pergantian di selutuh data
    }
}
