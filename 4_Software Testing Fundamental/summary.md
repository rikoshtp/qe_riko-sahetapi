# (4) Software Testing Fundamental
## Resume
Dalam materi ini mempelajari:
1. Definisi Pengujian Perangkat Lunak
2. Platform Pengujian
3. Jenis Pengujian Perangkat Lunak

### Definisi Pengujian Perangkat Lunak
Menurut Standar ANSI / IEEE 1059, Software Testing adalah sebuah proses menganalisis item perangkat lunak untuk mendeteksi perbedaan antara kondisi yang ada dan yang dibutuhkan (yaitu, cacat) dan untuk mengevaluasi fitur dari item perangkat lunak. 

Bug pada perangkat lunak bisa mahal atau bahkan berbahaya. Bug perangkat lunak berpotensi menyebabkan kerugian moneter dan manusia. Oleh karena itu Pengujian Perangkat lunak sangat penting, karena dapat:

- Menghemat Uang
- Menjamin kualitas produk
- Keamanan Terjaga
- Kepuasan Konsumen/Pelanggan

### Platform Pengujian
Terdapat 4 macam platform pengujian perangkat lunak, diantaranya:

- API (Application Programming Interface) adalah sekumpulan definisi dan protocol untuk membangun dan mengintegrasikan aplikasi software.
- Web, adalah sebuah kumpulan halaman yang berisikan informasi tertentu dan dapat diakses oleh banyak orang melalui internet, dapat dibuka melalui URL.
- Mobile, ada 2, yaitu Android dan IOS
- Desktop

### Jenis Pengujian Perangkat Lunak
1. **Functional Testing,** Contoh:
- Manual Testing:
• Dalam proses ini, penguji perangkat lunak menjalankan kasus uji dan menghasilkan laporan pengujian
• Ini adalah metode klasik dari semua jenis pengujian dan membantu menemukan bug dalam sistem perangkat lunak.
- Automate:
• Penguji menulis kode/skrip pengujian untuk mengotomatiskan eksekusi pengujian.
• Alat otomatisasi penguji untuk mengembangkan skrip pengujian dan memvalidasi penggunaan perangkat lunak yang sesuai
• Tujuannya adalah untuk menyelesaikan eksekusi tes dalam waktu yang lebih singkat.
2. **Non Functional Testing,** dilakukan setelah Functional Testing dilakukan. Contoh:
- Perfomance Testing didefinisikan sebagai jenis perangkat lunak pengujian untuk memastikan perangkat lunak aplikasi akan bekerja dengan baik di bawah beban kerja yang diharapkan. beberapa point penting yang diperhatikan:
- Speed: Menentukan kecepatan respon suatu aplikasi
- Scalability: Menentukan maksimum user load yang dapat dihandle oleh aplikasi.
- Stability: Menentukan kestabilan aplikasi dari berbagi jenis jumlah load.

Hasil dari perfomance testing inilah yang bisa dijadikan sebagai pedoman bagian mana yang harus ditingkatkan seperti di logical code, query database, atau penggunaan CPU dan memory.

3. **Maintenance,** dilakukan setelah aplikasi dirilis ke konsumen atau customers, diperlukan untuk mempertahankan atau meningkatkan karakteristik kualitas non-functional dari komponen sistem selama masa pakai. Contoh:
Regression Testing: Jenis pengujian perangkat lunak untuk mengonfirmasi bahwa fitur baru atau perubahan kode tidak berdampak buruk pada fitur yang ada.

**Terdapat 4 Tingkat Pengujian pada perangkat lunak:**

1. **Unit Testing**, adalah tingkat pengujian perangkat lunak di mana unit individu / komponen perangkat lunak diuji. Unit testing dilakukan saat masa development dari sebuah perangkat lunak oleh developer. komponen yang diuji ialah unit-unit (function, method, prosedur, modul, objek) dari software. Tujuan Unit Testing untuk memvalidasi setiap unit dari code perangkat dapat berjalan seperti yang diharapkan. Beberapa automation tools yang tersedia: JUnit, NUnit, JMokid, Emma, PHP Unit, dll.
2. **Integration Testing**, adalah tingkat pengujian perangkat lunak di mana unit individu digabungkan dan diuji sebagai sebuah kelompok. Biasanya Software Tester menguji setiap Unit bekerja sebagai kombinasi. Integration Testing bertujuan untuk memeriksa sebuah aplikasi atau software berfungsi atau berjalan dengan baik, memeriksa kinerja dari sebuah aplikasi dan software, mengetes struktur program yang sudah dirancang.
3. **System Testing**, adalah tingkat pengujian perangkat lunak di mana perangkat lunak yang lengkap dan terintegrasi diuji yang dilakukan end-to-end testing untuk memverifikasi semua scenario berjalan dengan baik. Cakupan system testing akan mengecek kemampuan functional dan non-functional dari sebuah software.
4. **Acceptance Testing**, adalah tingkat pengujian perangkat lunak di mana sistem diuji untuk penerimaan. Digunakan untuk menentukan apakah system yang didevelop telah memenuhi kebutuhan pengguna, dilakukan pada tahap terakhir proses pengujian sebelum system diserahkan kepada pengguna. tujuannya adalah apakah aplikasi susah sesuai proses bisnis atau tidak.

## Task
![Task1_Sec4](https://user-images.githubusercontent.com/75010847/155479749-02a4da5e-2c79-43de-b105-6cd6410ec879.png)

Pada pengujian terhadap tutorial entity, dengan jumlah kelas 1 mendapatkan nilai Line Coverage 6 dari 9 (67%) dimana terdapat 6 pengujian yang mampu melalui garis eksekusi sedangkan terdapat 3 gagal dilalui atau terdapat kesalahan/cacat. Pada Cakupan Mutasi sebanyak 2 dari 3 (67%) yang dimana terdapat 2 mutasi yang gagal/mati dan 1 mutasi yang berhasil selamat. Pada Line Coverage (Cakupan Garis) diperlukan perbaikan mengenai 3 issue yang gagal tersebut. Pada Mutation Coverage nilai belum mencapai 100%, Untuk mendapatkan mutasi score senilai 100%, maka langkah yang perlu dilakukan adalah menambahkan test case untuk program "tutorial entity" tersebut.

Pada pengujian terhadap tutorial service, dengan jumlah kelas 1 mendapat Cakupan Garis 6 dari 6 (100%) yang berarti pengujian mampu melalui semua jalur/garis eksekusi yang ditentukan. Selain itu Cakupan Mutasi mendapatkan sebanyak 3 dari 4 (75%) yang dimana terdapat 3 mutasi yang terbunuh dan 1 berhasil selamat dari mutasi, untuk mendapatkan mutasi score senilai 100%, maka langkah yang perlu dilakukan adalah menambahkan test case untuk program tersebut.


![Task2_Sec4](https://user-images.githubusercontent.com/75010847/155479734-6279ab56-f493-459f-8484-9a3ca25f8d7e.png)

Terlihat terdapat 5 line coverage yang diuji, mendapatkan nilai 3/5 (60%) yang berarti terdapat 3 baris code yang berhasil melalui pengujian, sedangkan 2 baris code gagal.

