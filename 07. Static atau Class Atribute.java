// 2023/05/26 23:21

/* 
 * STATIC VARIBEL ATAU CLASS ATRIBUT
 * 
 * yang di maksudkan dengan static disini yaitu 
 * kita menaruh keyword STATIC kedalam sebuah variabel atau atribut terbeut, yang artinya dia menempel kedalam suatu class 
 * yang mana dia akan ada di dalam semua objek
 * 
 * jika yang non static nilai nya akan beribah ubah tergantung dari objeknya 
 * 
 * jadi kesimpulan yang bisa saya ambil penggunaan static berfungsi untuk menyimpan nilai yang sama dan dapat ada disemua object 
 * contoh seperti nilai PHI dalam matematika yang nilainya 3.14 kita buat dia menjadi static agar dapat ada di semua obejct 
 * lalu rekomendasi penggunakan dalam setter static yaitu dengan menggunakan nama classnya bukan mlagi menggunakan this.  untuk menghidari ambiguitas dalam n=penamaan atau kepemilikan dari sebuah variabel
 * 
 * untuk pemanggilan dapat hanya di lakukan dengan cara menuliskan nama classnya lalu di ikuti dengan nama variabelnya 
 * contoh
 * 
 * class pus{
 *  static String nama = "kucing";
 * }
 * 
 * public static void main(String args[]){
 *  System.out.println(pus.nama);  --> dia akan otomatis menampilkan output kucing
 * }
 */

 class Display{
    static String jenis = "kendaraaan"; /* DIA AKAN ADA di seluruh objek dan dapat di akses oleh semuanya */
    private String nama;

    Display(String nama){
        this.nama = nama;
    }

    public void setJenis(String jenisKendaraan){
        // jenis = jenisKendaraan; /* ALTERNATIVE PERTAMA DALAM PENULISAN SETTER DENGAN VARIAVEL STATIC */
        // this.jenis = jenisKendaraan; /* ALTERNATIVE KEDUA DALAM PENULISAN SETTER DENGAN VARIAVEL STATIC */
        Display.jenis = jenisKendaraan; /* REKOMENDASI DALAM PENULISAN SETTER DENGAN VARIAVEL STATIC */
    }

    void show(){
        System.out.println("ini adalah " + this.nama);
    }
 }

public class main {
    public static void main(String[] args) {
        Display Tampilan1 = new Display("Montor");
        Tampilan1.show();

        Display Tampilan2 = new Display("Mobil");
        Tampilan2.show();

        Tampilan1.setJenis("HEWAN");

        System.out.println(Tampilan1.jenis);
        System.out.println(Tampilan2.jenis);
        System.out.println(Display.jenis);

    }
}
