package pbo;
// Class Baju sebagai subclass dari Barang
class Baju extends Barang {
    private final String ukuran;

    // Constructor untuk menginisialisasi atribut Baju dan atribut dari superclass Barang
    public Baju(String kodeBarang, String namaBarang, int harga, String ukuran) {
        super(kodeBarang, namaBarang, harga);
        this.ukuran = ukuran;
    }

    // Accessor (getter) untuk mengambil data atribut ukuran
    public String getUkuran() {
        return ukuran;
    }

    // Method untuk menampilkan informasi baju (override dari superclass Barang)
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Ukuran: " + ukuran);
    }
}