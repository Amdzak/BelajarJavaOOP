package project;

class Player {
    private String nama;
    
    Player(String nama){
        this.nama = nama;
    }

    void setNama(String name){
        this.nama = name;
    }

    void show(){
        System.out.println("Player name = " + this.nama);
    }
    
}
