# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama perusahaan dan nomor, dan memberikan output berupa informasi detail dari nomor tersebut seperti nomor, nama perusahaan, tempat, no kloter dan urutan kategori.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Perusahaan`, `PerusahaanDetail`, dan `PerusahaanBeraksi` adalah contoh dari class.

```bash
public class Perusahaan {
    ...
}

public class PerusahaanDetail extends Perusahaan {
    ...
}

public class PerusahaanBeraksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `prs[i] = new PerusahaanDetail(namaperusahaan, nomor);` adalah contoh pembuatan object.

```bash
prs[i] = new PerusahaanDetail(namaperusahaan, nomor);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaperusahaan` dan `nomor` adalah contoh atribut.

```bash
String namaperusahaan;
String nomor;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Perusahaan` dan `PerusahaanDetail`.

```bash
public Perusahaan(String namaperusahaan, String nomor) {
    this.namaperusahaan = namaperusahaan;
    this.nomor = nomor;
}

public PerusahaanDetail(String namaperusahaan, String nomor) {
    super(namaperusahaan, nomor);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaPerusahaan` dan `setNomor` adalah contoh method mutator.

```bash
public void setNamaPerusahaan(String namaperusahaan) {
    this.namaperusahaan = nama;
}

public void setNomor(String nomor) {
    this.nomor = nomor;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaPerusahaan`, `getNomor`, adalah contoh method accessor.

```bash
public String getNamaPerusahaan() {
    return namaperusahaan;
}

public String getNomor() {
    return nomor;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `nomor` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaperusahaan;
private String nomor;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PerusahaanDetail` mewarisi `Perusahaan` dengan sintaks `extends`.

```bash
public class PerusahaanDetail extends Perusahaan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Perusahaan` merupakan overloading method `displayInfo` dan `displayInfo` di `PerusahaanDetail` merupakan override dari method `displayInfo` di `Perusahaan`.

```bash
public String displayInfo() {
    return displayInfo() + "\nNama Perusahaan: " + getNamaPerusahaan;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getTempatPerusahaan` dan seleksi `switch` dalam method `getProdi`.

```bash
public String getTempatPerusahaan() {
    if(getNomor().substring(2, 4).equals("10")){
        return "Martapura";
    } else {
        return "Perusahaan Daerah lain";
    }

    //return getNomor().substring(2, 4).equals("10") ? "Martapura" : "Perusahaan Daerah Lain";
}

public String getKategori() {
    switch(getNomor().substring(4, 6)) {
        case "01":
            return "Administrasi";
        case "02":
            return "Logistik";
        default:
            return "Dan Seterusnya";
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < perusahaan.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan NOMOR" + (i + 1) + ": ");
String nama = scanner.nextLine();

System.out.println("\nData Perusahaan :");
System.out.println(Perusahaan.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `PerusahaanDetail[] mahasiswas = new PerusahaanDetail[2];` adalah contoh penggunaan array.

```bash
PerusahaanDetail[] perusahaan = new PerusahaanDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
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
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Fadli Ajidhansyah
NPM: 2110010505
