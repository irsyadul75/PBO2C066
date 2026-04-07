public class Laptop {
    // Java Modifiers: 'private' untuk enkapsulasi data
    private String merk;
    private int harga;

    // Java Constructor: Nama method sama dengan nama class
    public Laptop(String merk, int harga) {
        // Java 'this' Keyword: Digunakan untuk membedakan 
        // variabel class dengan parameter konstruktor
        this.merk = merk;
        this.harga = harga;
    }

    // Java Modifier: 'public' agar bisa diakses dari class lain
    public void tampilkanInfo() {
        System.out.println("Laptop " + this.merk + " seharga Rp" + this.harga);
    }

    public static void main(String[] args) {
        // Membuat objek baru (memanggil konstruktor)
        Laptop laptopSaya = new Laptop("ASUS", 15000000);
        laptopSaya.tampilkanInfo();
    }
}
