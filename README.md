Muhammad Rizky Fadillah, [22/07/2023 21:27]
# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi penjualan baju menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa pilihan baju serta jumlah baju yang ingin dibeli, dan memberikan output berupa informasi baju yang dipilih, dan total harga pembelian 

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. Class adalah template atau blueprint dari object. Pada kode ini, Barang, Baju, dan ProgramPenjualanBaju adalah contoh dari class.

```bash
public class Barang {
    ...
}


public class Baju extends Barang {
    ...
}

public class ProgramPenjualanBaju {
    ...
}
```

2. Object adalah instance dari class. Pada kode ini, Barang barang1 = new Barang(kodeBarang, namaBarang, harga); adalah contoh pembuatan object.

```bash
Barang barang1 = new Barang("B001", "Baju Polos", 100000);
```

3. Atribut adalah variabel yang ada dalam class. Pada kode ini, kodeBarang,  namaBarang,  harga dan ukuran adalah contoh atribut.

```bash
String kodeBarang;
String namaBarang;
Int harga;
String ukuran;
```
4. Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Barang` dan `Baju`.


```bash
public Barang(String kodeBarang, String namaBarang, int harga) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
}

public Baju(String kodeBarang, String namaBarang, int harga, String ukuran) {
    super(kodeBarang, namaBarang, harga);
    this.ukuran = ukuran;
}
```

5. Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setHarga` adalah contoh method mutator.


```bash
public void setHarga(int harga) {
    this.harga = harga;
}
```

6. Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodeBarang`, `getNamaBarang`,  `getHarga` dan `getUkuran` adalah contoh method accessor.


```bash
public String getKodeBarang() {
    return kodeBarang;
}

public String getNamaBarang() {
    return namaBarang;
}

public int getHarga() {
    return Harga;
}
public String getUkuran() {
    return ukuran;
}
```



7. Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kodeBarang`, `namaBarang`, `harga` dan `ukuran`  dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.


```bash
private String kodeBarang;
private String namaBarang;
private int harga;
private String ukuran;
```

8. Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Baju` mewarisi `Barang` dengan sintaks `extends`.


```bash
public class Baju extends Barang {
    ...
}
```

9. Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `showInfo()` di `Barang` merupakan overloading method `showInfo` dan `showInfo` di `Baju` merupakan override dari method `showInfo` di `Barang`.


```bash
public void showInfo() { System.out.println("Kode Barang: " + kodeBarang); 
System.out.println("Nama Barang: " + namaBarang); 
System.out.println("Harga: Rp " + harga); }

@Override
public void showInfo() { 
super.showInfo(); System.out.println("Ukuran: " + ukuran); }
...
```
Muhammad Rizky Fadillah, [22/07/2023 21:27]
10. Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else dalam method getHarga.

```bash
if (kembalian >= 0) {
    System.out.println("Kembalian: Rp " + kembalian);
} else {
    System.out.println("Uang tidak cukup!");
}
```


11. Perulangan adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahBarang; i++) {
    ...
}
```

12. Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input dan method System.out.println untuk menampilkan output.

```bash
Scanner input = new Scanner(System.in);

// ...

// Input data barang dan ukuran
for (int i = 0; i < jumlahBarang; i++) {
    System.out.println("\nData Barang ke-" + (i + 1));
    System.out.print("Kode Barang: ");
    String kodeBarang = input.nextLine();
    System.out.print("Nama Barang: ");
    String namaBarang = input.nextLine();
    System.out.print("Harga: Rp ");
    int harga = input.nextInt();
    input.nextLine(); // Membersihkan newline dari buffer
    System.out.print("Ukuran: ");
    String ukuran = input.nextLine();

    daftarBarang[i] = new Baju(kodeBarang, namaBarang, harga, ukuran);
}
```


13. Array adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, Baju[] daftarBarang = new Baju[jumlahBarang]; adalah contoh penggunaan array.

```bash
Baju[] daftarBarang = new Baju[jumlahBarang];
```

14. Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk menangani error.

```bash
try {
    // Input pembayaran dari pelanggan
    System.out.print("\nMasukkan jumlah uang yang dibayarkan: Rp ");
    int pembayaran = input.nextInt();

    // Hitung kembalian
    int kembalian = pembayaran - totalHarga;
    if (kembalian >= 0) {
        System.out.println("Kembalian: Rp " + kembalian);
    } else {
        System.out.println("Uang tidak cukup!");
    }
} catch (Exception e) {
    System.out.println("Input tidak valid. Masukkan angka yang benar.");
}
```


## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | TOTAL      | 100 |

## Pembuat

Nama: Muhammad Rizky Fadillah
NPM: 2110010245
