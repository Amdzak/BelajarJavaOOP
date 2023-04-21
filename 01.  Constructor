//2023/04/01 21:37

/*
 * Constructor
 *  merupakan sebuah metode atau fungsi yang pertamakali di panggil saat objek itu di buat
 *  constructor sendiri merupakan fungsi yang namanya harus sama persis seperti nama class nya
 *  dengan adanya constructor maka program class akan melakukan eksekusi fungsi constructor tersebut
 *  didalam constructor juga dapat di berikan parameter seperti didalam fungsi yang ada dalam java dasar
 *  jika ada 2 contructor dengan nama yang sama maka java akan otoamtis mengcek apakah sesuai dengan parameter atau tidak nya
 *  contoh class tanpa constructor 
 *      class noConstructor{
 *          String nama;
 *          int usia;
 *       }
 * 
 *  contoh class dengan constructor
 *      class kucing{
 *          String nama;
 *          int usia;
 *          String hasil;
 * 
 *          //INI MERUPAKAN FUNGSI CONSTRUCTOR YANG MANA AKAN DI PANGGIL PERTAMA KALI OLEH SI CLASS TANPA PARAMETER
 *          kucing(){
 *              System.out.print("INI ADA CONSTRUCTOR");
 *          }
 * 
 *          //INI MERUPAKAN FUNGSI CONSTRUCTOR YANG MANA AKAN DI PANGGIL PERTAMA KALI OLEH SI CLASS DENGAN PARAMETER
 *          kucing(String kesatu,String kedua){
 *              kesatu = "Salto";
 *              kedua = "turu";
 *              System.out.println(kesatu + kedua);
 *          }
 *      }
 */


class binatang{
    String nama,jenis,tipe;
    int usia;

    //CONSTRUCTOR TANPA PARAMETER
    binatang(){
        nama = "\nAnjing";
        jenis = "hewan";
        tipe = "kanibal";
        usia = 20;
    }

    //CONSTRUCTOR DENGAN PARAMETER
    binatang(String setNama,String setJenis,String setTipe,int setUsia){
        // setNama = "Kucing";
        // setJenis = "Karnivora";
        // setTipe = "Mamalia";
        // setUsia = 10;

        System.out.println(setNama);
        System.out.println(setJenis);
        System.out.println(setTipe);
        System.out.println(setUsia);

    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        binatang hewan = new binatang("\nKucing","Kernivora","Mamalia",10);
        binatang hewan1 = new binatang();
        System.out.println(hewan1.nama);
        System.out.println(hewan1.jenis);
        System.out.println(hewan1.tipe);
        System.out.println(hewan1.usia);
    }
}
