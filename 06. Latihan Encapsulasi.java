
//2023/04/24 16:41

/*
 * Latihan encapsulasi dengan konteks permainan game sederhana
 * 
 *  
 */

 class Player{
    private String nama;
    private int nyawaAsal;
    private int baseAttack;
    private int level;
    private int kenaikannyawa; // setiap naik level maka akan menambahkan nyawa
    private int kenaikansenjata;
    private int totalDmg;
    private boolean hidup;

    private Weapone weapone;
    private Armor armor; // mengambil objek armor dam memasukankedalam class payer

    // constructor
    public Player (String nama){
        this.nama = nama;
        this.nyawaAsal = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.kenaikannyawa = 25;
        this.kenaikansenjata = 25;
        this.hidup = true;
    }

    // Method untuk mendisplay 
    public void display(){
        System.out.println("\nNama : " + this.nama);
        System.out.println("Level : " + this.level);
        System.out.println("Nyawa : " + this.getNyawa() +"/" +this.maxHealth());
        System.out.println("Attack : " + this.getAttPower());
        System.out.println("Status: " + (this.hidup ? "Hidup" : "Mati"));
    }

    public void attcak(Player penantang){
        int damage = this.getAttPower();
        System.out.println("\n" + this.nama + " menyerang " +penantang.getNama() +" damage : "+ damage);
        penantang.defence(damage);
        levelUP();
    }

    public String getNama(){    
        return this.nama;
    }

    public int getNyawa(){
        return this.maxHealth() - this.totalDmg;
    }

    public void defence(int damage){
        int damageTotal = this.armor.getDefencepower();
        int damageDiterima;

        System.out.println(this.nama + " Defence Power = " + damageTotal);

        if(damage > damageTotal){
            damageDiterima = damage - damageTotal;
        } else{
            damageDiterima = 0;
        }

        System.out.println("damage diterima = " + damageDiterima);
        this.totalDmg += damageDiterima;

        if(this.getNyawa() <= 0){
            this.hidup = false;
            this.totalDmg = this.maxHealth();
        }

        this.display();
    }

    public void levelUP(){
        this.level++;
    }

    public void setWeapone(Weapone senjata){
        this.weapone = senjata;
    }

    // settter untuk armor
    public void setArmor(Armor armor){ //Setter write only yang berguna untuk membatasi penambahan 
        this.armor = armor;
    }

    // getter(read-only) untuk nyawa keseluarahan
    public int maxHealth(){
        return this.nyawaAsal + (this.level * this.kenaikannyawa) + this.armor.getAddNyawa(); // getter untuk nyawa keseluruhan di tambah dengan armor
    } 

    private int getAttPower(){
        return this.baseAttack + (this.kenaikansenjata * this.level) + weapone.attackPower();
    }
 }

 class Weapone{
    private String nama;
    private int attack;

    public Weapone(String nama,int attack){
        this.nama = nama;
        this.attack = attack;
    }

    public int attackPower(){
        return this.attack;
    }
 }

 class Armor{
    private String nama;
    private int Defence;
    private int nyawa;

    public Armor(String nama,int defence,int  nyawa){
        this.nama = nama;
        this.Defence = defence;
        this.nyawa = nyawa;
    }

    public int getAddNyawa(){
        return this.nyawa + this.Defence*2; //setter untuk menambahkan nyawa keseluruhan jika di tambah dengan nyawa armor tsb
    }

    public int getDefencepower(){
        return this.Defence * 2;
    }

 }

public class Main{
    public static void main(String[] args) {

        Player pemain1 = new Player("Zilong");
        Armor armor1 = new Armor("Zirah Besi",40,100);
        Weapone senjata1 = new Weapone("Tombak", 50);        
        pemain1.setWeapone(senjata1);
        pemain1.setArmor(armor1);


        Player pemain2 = new Player("Alucard");
        Armor armor2 = new Armor("Baju Biru",20,100);
        Weapone senjata2 = new Weapone("Pedang", 100);        
        pemain2.setWeapone(senjata2);
        pemain2.setArmor(armor2);

        pemain1.display();        
        pemain2.display();

        pemain1.attcak(pemain2);
        pemain2.attcak(pemain1);
        pemain2.attcak(pemain1);
        pemain2.attcak(pemain1);
    }
}
