package pbo;

class Barang {
    private final String kodeBarang;
    private final String namaBarang;
    private int harga;

    // Constructor untuk menginisialisasi atribut
    public Barang(String kodeBarang, String namaBarang, int harga) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Accessor (getter) untuk mengambil data atribut
    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }

    // Mutator (setter) untuk mengubah data atribut
    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Method untuk menampilkan informasi barang
    public void showInfo() {
        System.out.println("Kode Barang: " + kodeBarang);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: Rp " + harga);
    }
}