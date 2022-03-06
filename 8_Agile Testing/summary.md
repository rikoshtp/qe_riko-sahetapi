# (8) Agile Testing
## Resume
1. Definisi SDLC
2. Agile Testing Manifesto
3. Testing Pyramid

### Definisi SDLC
SDLC (Software Development Life Cycle merupakan psoses yang digunakan untuk merancang, mengembangkan, dan menguji software yang berkualitas tinggi. Tujuannya adalah untuk menyediakan alur terstruktur dalam membantu organisasi menghasilkan software berkualitas tinggi yang diselesaikan dengan perkiraan waktu yang singkat dan biaya yang rendah, namun tetap memenuhi atau melebihi harapan pelanggan. Dalam praktiknya SDLC mulai dengan mengevaluasi sistem yang ada untuk mendefinisikan persyaratan pada sisetem yang baru, baru setelah itu software akan dibuat sesuai dengan tahapan-tahapan SDLC yang ada.

**Fungi SDLC:**

- Sebagai sarana komunikasi antara tim developer dengan pemegang kepentingan
- Membagi peranan dan tanggung jawab yang jelas antara developer, designer, business analys dan manager proyek
- Dapat memberikan gambaran input dan output yang jelas dari 1 tahap menuju tahap selanjutnya.

**Fase SDLC**

1. Requirements Gathering
2. Design
3. Development (Code)
4. Testing
5. Deployment
6. Maintenance

### Agile Testing Manifesto
Testing manifesto perlu diterapkan dalam setiap mindset tim, perbedaan antara testing manifesto dengan testing aplikasi di step akhir development akan sangat berpengaruh terhadap proses development. salah satu pengaruhnya adalah dengan kondisi adanya kebutuhan untuk pengukuran dan meningkatkan upaya pengujian sebagai seorang QA dapat mengevaluasi dan meningkatkan seberapa baik sebagai seoarang software testing dan hal itu tidak bisa didapatkan jika menggunakan testing dengan metode yang hanya ada di setiap akhir proses development. 5 Kunci dalam melakukan Agile Testing Manifesto:
1. Testing is an activity not a phase
2. Prevent bugs rather than finding bugs
3. Don't be a checker, be a tester
4. Don't try to break the system, instead help build the best possible system
5. The whole team is responsible for quality, not just the tester

### Testing Pyramid
Strategi yang dapat membantu tim development dan automation dalam membuat software testing berkualitas tinggi dan andal, ini dapat mengurangi waktu yang dibutuhkan tim untuk mengidentifikasi apakah perubahan yang dilakukan dapat merusak sistem dengan menawarkan feedback secara langsung. Testing Pyramid yang beroperasi pada 3 tingkat (UI,Service, Unit Testing) membantu mengurangi jumlah waktu yang dihabiskan oleh tim automation dalam mengeksekusi test case dalam mengkategorikan setiap fitur baru ke dalam 1 atau semua test.
Terdapat 3 level di Testing Pyramid:

1. level yang paling bawah yaitu Unit Testing (merupakan pengujian perangkat lunak yang menguji setiap unit seperti function, method, procedure, modul maupun objek atau komponen dari setiap perangkat lunak, unit testing dilakukan pada saat pengembangan atau pada saat menuliskan code program dari sebuah perangkat lunak, tujuan dari unit testing adalah untuk memvalidasi setiap unit code perangkat lunak dapat berjalan seperti yang diharapkan),
2. Tingkatan Selanjutnya yakni integration testing adalah pengujian dari hasil penggabungan Unit yang ada di dalam software, biasanya QA menguji unit tersebut sebagai suatu kombinasi bukan lagi subagai suatu unit yang individual. Integrasi testing baiknya dilakukan secara bertahap untuk menghindari penelusuran saat terjadi error/bug.
3. Level yang paling atas yaitu UI Testing atau end-to-end test adalah yang paling dekat dengan integrasi pengguna pada aplikasi web/android/ios. User input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna, status UI harus berubah seperti yang diharapkan. Dengan menggunakan Tools atau framework testing akan memberitahu web/browser apa yang harus dilakukan seperti click, ketik serta expected result yang ada.

Berdasarkan Testing Pyramid dapat dengan mudah melihat beberapa hal penting seperti:

1. Semakin tinggi level semakin sedikit test yang dilakukan. Testing di level rendah dari sebuah pyramid cenderung berjalan lebih cepat karena tidak memerlukan pedoman yang lengkap dan mudah dimaintenance karena masih di skala kecil.
2. Penulisan test di setiap level berbeda tingkat detailnya, harus focus pada unit test, menulis banyak unit test kecil dan cepat untuk mencakup semua cabang pernyataan kondisi, input, dan output function. Menulis beberapa integration test untuk memastikan aplikasi kita memiliki behavior dengan benar.
3. Meskipun dapat menampikan semua aplikasi dan koneksi dari ujung ke ujung ketika ditest, kita tetap tidak dapat menguji semua tipe testing apakah UInya cocok dengan design, itulah mengapa test dengan level tinggi harus focus pada scenario yang penting.

## Task
Jawaban Task terdapat di link berikut https://docs.google.com/document/d/1sMNHNLUFoQKYibor2QDBmhzfAIwmqUIh70kgtLThFSg/edit?usp=sharing
