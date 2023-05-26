// 2023/05/26 23:27

/* 
 * STATIC ATAU CLASS METHODS
 * 
 * Dalam konteksnya segala sesuatu yang berhubungan dengan static dia akan ada di manapun 
 * hampir sama penggunaan nya seperti STATIC ATAU CLASS ATRIBUT
 */

 import java.util.ArrayList;

 class Pemain{
    private static int jumlahPemain;
    private String nama;
    private static ArrayList<String> namaPlayer = new ArrayList<String>(); /* DIAMON OPERATOR <> BEFUNGSI UNTUK MEMBERIKAN TIPEDATA YANG SPESIFIK */

    Pemain(String nama){
        this.nama = nama;
        Pemain.jumlahPemain++;
        Pemain.namaPlayer.add(this.nama); /* BERFUNGSI SEBAGAI ARRAY YANG NAMA BISA MENAMPUNG NAMA DARI PLAYER */
    }

    void show(){
        System.out.println("Nama player = " + this.nama);
    }

    static void JumlahPemain(){
        System.out.println("Jumlah player = " + Pemain.jumlahPemain);
    }

    public static ArrayList<String> getNamaPemain(){
        return Pemain.namaPlayer;
    }
 }

public class main {
    public static void main(String[] args) {
        Pemain player1 = new Pemain("Luffy");
        Pemain player2 = new Pemain("Zoro");
        Pemain player3 = new Pemain("Saitama");
        Pemain player4 = new Pemain("Aceng");

        Pemain.JumlahPemain();
        System.out.println("Nama Pemain = " + Pemain.getNamaPemain());
    }
}
