# (18) RESTful API Testing with Rest Assured
## Resume
1. Rest API Concept
2. Fundamental API
3. Test Pyramid

### Rest API Concept

Rest API merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan layanan berbasis web, umumnya menggunakan HTTP sebagai protokol untuk berkomunikasi data, rest merupakan salah satu implementasi dari web service sebagai standar yang digunakan untuk pertukaran data dari aplikasi maupun sistem. Terdapat request dan respons terhadap data yang dikirim dan diterima, data yang digunakan dalam Rest API biasanya JSON.

### Fundamental API

Test Process dari sebuah API, pertama definisikan API yang akan ditest, kemudian inputkan data yang dibutuhkan di body requestnya selanjutnya send request ke server lalu lakukan validasi terhadap respon yang diberikan.

### Test Pyramid

Test Pyramid paling bawah adalah UNIT Test, merupakan pengujian perangkat lunak yang menguji tiap unit atau komponen dari sebuah perangkat lunak, unit testing dilakukan saat masa pengembangan atau pada saat menuliskan kode program dari sebuah perangkat lunak oleh developer, komponen yang diuji adalah unit unit(function, method, procedur, modul, objek) dari perangkat lunak. Tujuannya adalah untuk memvalidasi setiap unit dari perangkat lunak dapat berjalan seperti yang diharapkan.
Di atas Unit Testing terdapat Component Testing, merupakan pengujian perangkat lunak dilakukan pada setiap component individu secara terpisah tanpa mengintegrasikan dengan komponen lain. Umumnya perangkat lunak secara keseluruhan terdiri dari beberapa component. Ini adalah salah satu jenis black box testing yang sering dilakukan oleh tim QA,
Di atasnya lagi terdapat Integration testing, merupakan pengujian dari gabungan unit yang ada di dalam software, QA melakukan pengujian dimana unit tersebut bekerja sebagai suatu kombinasi bukan lagi suatu unit yang individual. Integration Testing baiknya dilakukan secara bertahap untuk menghindari kesulitan ketika terjadi error/bug.
Level paling atas/ujung lancip terdapat UI Test atau end-to-end test adalah yang paling dekat dengan pengguna, user input harus memicu tindakan yang tepat, data harus disajikan kepada pengguna dengan tampilan/status UI harus berubah dengan tepat sesuai dengan yang diharapkan, ini adalah testing tingkat tertinggi, dengan menggunakan framework atau tools end to end test memberitahu browser atau web apa yang dilakukan seperti click, ketik serta expected result yang diharapkan.

Berdasarkan Test Pyramida, dapat didapat hal yang penting seperti

1. Semakin tinggi level atau semakin tinggi tingkatnya semakin sedikit test yang dilakukan, karena semakin tinggi level untuk membuat test case dan maintenance memerlukan biaya yang lebih mahal. Testing di level rendah dari sebuah test pyramid cenderung berjalan lebih cepat karena tidak memperlukan pedoman DOM yang lengkap dan mudah dimaintenance karena pengujian masih di tahap kecil.
2. Penulisan test di tiap level berbeda tiap detailnya, harus focus pada unit test, menulis banyak test kecil dan cepat untuk mencakup semua cabang pernyataan kondisi I/O fungsinya. Menulis beberapa integration test untuk memastikan aplikasi memiliki behaviour dengan benar.
3. Meskipun dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk ditest, kita tetap tidak dapat menguji semua tipe testing, apakah UInya cocok dengan design, itulah test di level tinggi harus focus pada scenario yang penting.
