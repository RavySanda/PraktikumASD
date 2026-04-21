public class percobaan2Perulangan {
    public static void main(String[] args) {
        
        //menampilkan deretan bilangan dari angka 1 sampai n (11)
        int n = 11; 

        if (n < 10) {
            n += 10; //bila n<10 maka tambahkan 10 (n+=10)
        }

        for (int i = 1; i <= n; i++) {

            if (i == 10 || i == 15) {//Bilangan 10 dan 15 tidak dicetak
                continue;
            }

            if (i % 3 == 0) {
                System.out.print("# ");//Bilangan kelipatan 3 dicetak #
            } 
            else if (i % 2 == 0) {
                System.out.print(i + " ");//Bilangan genap selain kelipatan 3 dicetak sesuai angkanya

            } 
            else {
                System.out.print("* ");//Bilangan ganjil dicetak dengan simbol 
            }
        }
    }
}
