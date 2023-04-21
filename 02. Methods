//2023/04/03 16:00

/*
 *  Methods
 *  Methods dalam class hampir sama cara penulisanya seperti methis dalam fungsi main 
 *  ada tambahan untuk penggunan tulisa this. itu berfungsi untuk mengambil variabel global dari sebuah class
 *  contoh  
 * 
 *      class ntah{
 *          String nama;
 *          int usia;
 * 
 *      ntah (String nama,int usia){
 *          this.nama = nama; --> this.nama dia mengacu kepada varibel global yang ada pada class sedangkan nama mengacu pada paremeter ntah
 *          thin.usia = usia; --> this.usia dia mengacu kepada varibel global yang ada pada class sedangkan nama mengacu pada paremeter ntah
 *  }
 * }
 * 
 *  DIDALAM CLASS METHODS MEMILIKI 4 JENIS TIPE YAITU
 *      instance methods = adalah method yang dapat di penggil oleh sebuah object indentifernya yaitu (public,private,protected) di panggilnya dengan menggunkan .NamaMethod
 *      static methods = adalah method yang tidak perlu pemanggilan oleh sebuah object dan dapat di akses langsung oleh classnya identifernya yaitu (static)
 *      abstract methods = merupakan methods yang tidak dapat di implementasikan di dalam class nya hanya berisi deklarasi methods identifernya (abstract)
 *      final methods = merupakan methods yang tidak dapat di override (diganti) oleh classnya memiliki identifernya (final)
 */

 class hewan{
    //Data global
    String nama;
    int usia;

    //construction
    hewan(String nama,int usia){
        this.nama = nama;
        this.usia = usia;
    }

    //methods tanpa return, tanpa parameter
    void show(){
        System.out.println("\nNama = " + this.nama);
        System.out.println("Usia = " + this.usia);
    }

    //methods tanpa return,dengan parameter
    void setNamaHewan(String nama){
        this.nama = nama;
    }
    void setUsiaHewan(int usia){
        this.usia = usia;
    }

    //methods dengan return, tanpa parameter
    String getNamaHewan(){
        return this.nama; // sebab kita membutuhkan nilai dari nama yang berada pada variabel global di class
    }

    int getUsiaHewan(){
        return this.usia;
    }

    //methods dengan return dan dengan parameter
    String sapa(String pesan){
        return pesan + this.nama;
    }
}

public class Main{
    public static void main(String[] args) {
        hewan ksatu = new hewan("Kucing",12);

        ksatu.show();
        ksatu.setNamaHewan("Mimin");
        ksatu.setUsiaHewan(10);
        ksatu.show();

        System.out.println(ksatu.getNamaHewan());
        System.out.println(ksatu.getUsiaHewan());

        String data = ksatu.sapa("\nNama dia adalah ");
        System.out.println(data);
    }
}
