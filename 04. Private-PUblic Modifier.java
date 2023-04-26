//2023/04/22 18:58

/*
 * Public dan private modifier
 * 
 *  accsess modifier merupakan sebuha code program yang memungkinkan kita unutk melakukan pembatasan akses dalam sebuah program
 *  dalam pemrograman java ada beberpaa access modifier yang kita bahas pasa saatini adalah public dan private 
 * 
 *  Public
 *  merupakan access modifier yang memungkinkan sebuah variabel dapat di akses oleh fungsi atau class apapun dan dimanapun
 *  dia dapat di baca(ouput) dan menulis data(mengubah)
 *  dapat di akses dari luar class
 * 
 *  Private 
 *  merupakan access modifier yang membuat kita memiliki bataan akses terhadap suatu program garis besarnya access modifier 
 *  private hanya bisa di akses dari dalam class yang sama
 * 
 */

class pemain{
    //atribut
    public String nama; //bisa di baca dan di tulis dari luar class karena public
    int lv,serang;
    private int nyawa; //hanya bisa di baca dan di tulis dari dalam class

    //constructor
    pemain(String nama,int lv,int nyawa,int attack){
        this.lv = lv;
        this.nama = nama;
        this.nyawa = nyawa;
        this.serang = attack;
    }

    //membuat fungsi output PUBLIC
    public void display(){
        serangan(10);
        System.out.println("\nNama \t: " + this.nama);
        System.out.println("Lv \t: " + this.lv);
        System.out.println("Nyawa \t: " + this.nyawa);
        System.out.println("Attack Power \t: " + this.serang);
    }

    private void serangan(int att){
        this.serang += att;
    }

    //membuat ganti nama dengan Public modifier
    public void gantiNama(String gantiNama){
        this.nama = gantiNama;
    }

    //membuat ganti serangan 
    public void getAtt(int att){
        this.serang += att;
    }

    //membuat fungsi display tapi dengan access modifier private
    private void output(){
        System.out.println("\nNama \t: " + this.nama);
        System.out.println("Lv \t: " + this.lv);
        System.out.println("Nyawa \t: " + this.nyawa);
    }
}

public class Main{
    public static void main(String[] args) {
        pemain Player1 = new pemain("Ahmad",2,10,100);

        //public access modifier
        System.out.println(Player1.nama); //yang di maksdu membaca data
        Player1.nama = "Wawan"; //yang di maksud menulis data
        System.out.println(Player1.nama);

        /*
            //private access modifier
            System.out.println(Player1.nyawa); //yang di maksdu membaca data
            Player1.nyawa = 100; //yang di maksud menulis data
            System.out.println(Player1.nyawa);
        */

        //akses display dengan public modifier
        Player1.display();

        //akses gantiNama dengan public modifier
        Player1.gantiNama("Mimin");
        Player1.display();

        //output display dengan access modifier private
        // Player1.output();
        // tidak dapat di akses oleh class main sebab access modifiernya berupa private

        Player1.getAtt(20);
        Player1.display();// sekarang sudah bisa menampilkan serangan musuh yang berjumlah +10 di setiap pendisplayan program 
        //bisa di akalin dengan cara memangilnya di dalam sebuha class yang sama
    }
}
