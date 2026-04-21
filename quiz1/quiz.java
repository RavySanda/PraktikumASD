package quiz1;
class quiz24 {
    String nama24;
    double harga24;
    int stok24;
    double diskon24;
    double hargaDiskon;

    // Konstruktor Default
    public quiz24() {

    }

    // Konstruktor Berparameter
    public quiz24(String nama24, double harga24,int stok24 , double diskon24) {
        this.nama24 = nama24;
        this.harga24 = harga24;
        this.stok24 = stok24;
        this.diskon24 = diskon24;
    }

    void tampilInformasi24 () {
        System.out.println("Nama: " + nama24);
        System.out.println("Harga: " + harga24);
        System.out.println("Stok: " + stok24);
        System.out.println("Diskon " + diskon24);
        
    }

    void updateIpk(double diskon24){
        hargaDiskon = harga24 * diskon24;

}
}





