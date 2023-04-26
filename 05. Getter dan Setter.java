//2023/04/22 21:51

/*
 * Getter dan Setter (ENCAPSULASI)
 * 
 *  Enkapsulasi digunakan untuk membatasi batasan dari sebuah class yang mana kita tidak ingin dapat di akses oleh 
 *  class lain atau sembarang class disini penggunaan enkapsulasi dengan access modifier berupa
 *  PRIVATE DAN PUBLIC
 * 
 *  disini saya akan menggunakan contoh kasus dengan code berupa sebuah data data
 * 
 *  Getter 
 *  Getter berguna untuk mengambil data dan hanya memiliki akses (READ ONLY)
 *  Getter biasanya dibuatkan metode di dalam class tersebut
 *  JIka ingin hak aksesnya hanya dapat membaca(READ ONLY) maka kita hanya harus melakukan return kepada program tersebut
 *  Hanya dengan return saja maka kita sudah bisa melakukan getter berupa read only
 * 
 *  Setter
 *  Setter dapat berrguna untuk merubah nilai data yang memiliki access modifier nya private
 *  setter identik dengan tipedata void 
 *  dengan menggunkana setter kita hanya dapat menjadikan fungsi tersebut menjadi write only
 *  jadi kita tidak dapat melakukan pembacaan(display) pada data tsb hanya bisa melakukan penulisan saja
 * 
 *  kita juga dapat melakukan readonly dan write only dengan getter dan setter contoh kasus sederhanaya kita akan menggunakan
 *  LINGKARAN SEBAGAI latihanya
 *  
 */

 class Data{
    public int pubData;
    private int privData;
    private double privData2;
    
    public Data(){
        this.pubData = 0;
        this.privData = 34;
    }

    void display(){
        System.out.println("\npublic = " + this.pubData);
        System.out.println("prvate Getter = " + this.privData);
        System.out.println("private Seeter = " + this.privData2);
    }

    public int getPrivData(){
        return this.privData;
    } 

    public void setprivData2(double nilai){
        this.privData2 = nilai;
    }
 }

 class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // setter (menulis)
    public void setJari2(double jari2){
        this.diameter = jari2 * 2;
    }

    // getter (membaca)
    public double getJari2(){
        return this.diameter/2;
    }
 }


public class Main{
    public static void main(String[] args) {
        Data objek = new Data();

        //membaca dan menulis data unutk access modifier public
        objek.pubData = 20;
        System.out.println("Nilai data public = " + objek.pubData);

        //read only private variabel dengan GETTER
        int getterPrivData = objek.getPrivData();
        System.out.println("Nilai data Private dengan Getter = " + getterPrivData);

        //write only dengan menggunakan setter dan tidak dapat mendisplay
        objek.setprivData2(20); //hanya menulis saja dan tidak mendisplay

        //cara lain jika ingin medisplay nya dengan seperti ini
        objek.display();

        // setter dan getter pada lingkaran (Write and Read only )
        Lingkaran ling = new Lingkaran(20);

        System.out.println("\nJari-Jari awal : " + ling.getJari2());
        ling.setJari2(15); // merubah jari-jari
        System.out.println("Jari-Jari setelah di rubah : " + ling.getJari2());
    }
}
