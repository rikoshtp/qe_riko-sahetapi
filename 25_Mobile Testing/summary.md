# (25) Mobile Testing
## Resume
1. Pengertian Mobile Testing
2. Mobile automation testing with Appium
3. Menjalankan Appium Desktop & Inspector

### Pengertian Mobil Testing

Mobile testing adalah proses dimana aplikasi mobile yang dikembangkan diuji untuk kegunaan dan konsistensinya, ada 2 macam testing yang diujikan pada perangkat mobile yaitu:

1. Pengujian Software: fungsi dan eksistensi yang akan diuji.
2. Pengujian Hardware: prosessor, wifi, layar, dll.

Aplikasi mobile sendiri terdiri dari 3 macam, yaitu: aplikasi mobile native, hybrid, wide. Pengujian aplikasi mobile lebih komplex daripada pengujian desktop atau lainnya, karena memiliki berbagai macam ukuran layar dan berbagai macam sistem operasi yang dipakai. Untuk mengatasi semua masalah teknis di atas, ada beberapa macam testing yang selayaknya dilakukan pada aplikasi mobile seperti Usability testing (untuk memastikan bahwa aplikasi mobile mudah digunakan), Interface Testing (pengujian pilihan menu, bookmark, dll), Low Level Resource Testing (pengujian memory, database, dll), Performance Testing (kemampuan berbagi dokumen, kapasitas batery, dan jaringan), Operational testing (backup/rencana recovery), Instalation Testing (validasi aplikasi dengan install/uninstall aplikasi dari perangkat mobile), dan yang terakhir Security testing (Pengujian aplikasi untuk memvalidasi apakah data terlindungi di sistem informasi). Untuk keberhasilkan pengujian dibutuhkan scenario/strategi yang memumpuni, seperti pemilihan perangkat yang paling banyak digunakan, dan analisis pasar berdasarkan pengguna.

### Mobile automation testing with Appium

Appium adalah mobile web native dan hybrid software application test automation tools yang open source yang dapat digunakan pada android maupun IOS (Cross Platform) menggunakan API yang sama.

- Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.
- Appium mendukung banyak bahasa pemrograman seperti java, python,
javascript, ruby, dll.
- Pustaka Appium dibuat di atas pustaka Selenium.
- Mendukung aplikasi Android, iOS, dan Windows.
Komponen Appium
• Di Appium, ada dua komponen utama yang kami gunakan :
    - Server Appium. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan desktop appium atau menginstal perintah appium menggunakan npm.
    - Klien Appium. Pustaka ditulis dalam beberapa bahasa untuk membuat skrip pengujian sehingga kami dapat mengirim perintah ke server appium.

**Untuk Mengatur Appium di komputer lokal Anda, Anda perlu menginstal beberapa alat /
Perpustakaan :**

- Java JDK 8/ 11. Anda juga perlu mengatur variabel lingkungan Java_HOME.
- Instal Android SDK Platform-Tools & Command-line tools, ini dapat dengan mudah dilakukan dengan menginstal
-AndroidStudio. Anda juga perlu mengatur variabel lingkungan ANDROID_HOME.
- Desktop Appium. Digunakan untuk memeriksa lokasi elemen dan menjalankan uji otomatisasi di komputer lokal.
- Node JS (Untuk menginstal perintah appium menggunakan npm).
- appium-dokter. Yang ini OPSIONAL, tetapi ini dapat membantu Anda mengidentifikasi prasyarat yang hilang.

### Menjalankan Appium Desktop & Inspector

1. Connecting the Devices
2. Checking the Connected Devices
3. Running Appium Desktop
4. Using Appium Inspector
5. Desired Capabilities
6. Desired Capabilities to Start Inspector Session
7. Filling the Capabilities
8. Show UI from Appium Inspector
