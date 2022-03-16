# (14) Pengenalan RESTful API
## Resume
1. API & REST API
2. JSON dan HTTP Respons
3. API TESTING

### API & REST API

API adalah singkatan untuk "Application Programming Interface". API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/ sistem yang terpisah.

Tujuan pembuatan API adalah untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga developer tidak perlu membuat fitur yang serupa. API berperan sebagai pembawa pesan yang menerima permintaan dari pengguna dan memberitahu sistem apa yang harus dilakukan dan memberi respon yang sesuai untuk permintaan tersebut.

**REST API**

- **REST - singkatan dari "Representational State Transfer"**

Merupakan standar arsitektur komunikasi berbasis web yang sering diterapkan dalam pengembangan aplikasi berbasis web. umumnya menggunakan HTTP sebagai protokol untuk komunikasi data. REST juga merupakan salah satu implementasi dari Web Service sebagai standar yang digunakan untuk pertukaran data antara aplikasi maupun sistem. REST API berisi aturan atau batasan untuk membatasi programmer untuk mengakses atau melakukan tindakan tertentu pada sebuah database. Jika API adalah penghubung maka REST API yang membuat aturan sesuai keinginan programmer dalam merancang web services.

- **HTTP Method.**

![image](https://user-images.githubusercontent.com/75010847/158543879-a0ac9c3d-e100-486c-b163-b28558f625ab.png)

**REST API Component,** terdiri dari 4:

- **Method** : seperti get, push, detele.
- **URL (Base URL + Path)** : Cara untuk melakukan request, terdiri dari kata kunci yang menunjukan ke server apa yang kita coba lakukan.
- **Header** : Adalah kumpulan field dan value yang terkait dengan pemberian informasi tentang pesan ke penerima. Header juga berisi informasi autentifikasi yang memberitahu bahwa pesan tersebut sah
- **Body** : request body mendefinisikan parameter apa yang dikirim ke server, ini menentukan informasi yang diupdate, dibuat, maupun dihapus.

### JSON & HTTP Respons

JSON (Javascript object notation) adalah sebuah format data yang digunakan untuk pertukaran dan penyimpanan data. JSON merupakan bagian dari Javascript, bisa dibaca dengan berbagai bahasa pemrograman.

```json
{
          "first name" "Sammy",
          "last name" : "Shark",
          "location" "Ocean",
          "online": true,
          "followers" : 987
} ;
```

**HTTP Response Code**

- 200 OK, arti dari respon ini menandakan bahwa request yang dikirim "success".
- 201 Created, artinya request yang dikirim sukses dan resourcenya berhasil dibuat, biasanya respon code ini dipakai untuk method post dan put.
- 400 Bad Request, ini terjadi ketika melakukan request post atau put, kemudian datanya tidak sesuai ataupun ada salah dalam formatnya.
- 404 Not Found, Respon code ini terjadi ketika resource yang diperlukan tidak ditemukan.
- 401 Unauthorized, Respon code ini terjadi karena kita tidak melakukan authentifikasi terlebih dahulu sebelum melakukan request.
- 405 Method, HTTP Method yang digunakan ketika request tidak support atau salah http methodnya, misal ingin melakukan post tapi menggunakan method get.
- 500 Internal, Error karena kesalahan di server

### API TESTING

API Testing adalah test yang dilakukan pada layer dimana API yang didesign untuk berinteraksi atau komunikasi pada aplikasi dipastikan functionalitasnya melalui rangkaian atau set dari sebuah test. Sederhananya API Testing diharapkan bisa memberikan gambaran bagaimana respon dari aplikasi web tanpa ataupun sebelum GUI-nya siap. API Testing bertujuan meluaskan cakupan testing itu sendiri dan melakukan testing sedini mungkin, dimana GUI masih belum sepenuhnya belum siap untuk ditest.

API Testing dibedakan menjadi 3 macam, yakni:

- Functionality, test ini ditujukan untuk memvalidasi sebuah fitur apakah sudah berfungsi atau belum.
- Load Test, bertujuan untuk menguji kekuatan suatu sistem, apakah mampu mengolah data dari beban yang diberikan.
- Security, test ini bertujuan untuk menguji keamanan dari suatu sistem.

**API Testing Tools:**

- PostMan
- JMeter
- Rest-assured
- Frisby.js

**Perbedaan Unit Test & API Test:**
Unit Test
• Dilakukan oleh Developer
• Fungsi - fungsi terpisah
• Developer bisa mengakses source code.
• Hanya Dasar functionality yang di test.
• Scopenya terbatas.
• Biasanya dilakukan sebelum build.

API Test
• Tester perform it (Dilakukan oleh S*oftware Tester*).
• End to End.
• Tidak bisa mengakses source code.
• Hanya fungsi API saja.
• Semua functional issue.
• Scopenya lebih luas
• Dilakukan setelah build.

**API Testing Process:**

1. Spesification review, tahap ini memiliki tujuan untuk mereview dari spesifikasi API dan use case document.
2. Test Spesification Development, tahap ini penting untuk memastikan detail dokumen mengenai test condition dan expected result di setiap test case.
3. Test Framework Development, Pada tahap ini harus memilih harus memakai tools apa dalam API testing nanti
4. Test Case Development, pada tahap ini akan dibuat test scenario dan test casenya.
5. Execution & Result, akan mengeksekusi test scenario yang telah dibuat lalu membuat report dari hasil testing yang sudah dilakukan.

**Test Cases for API Testing**, Contoh:
• Mendapatkan balikan(response) yang
sesuai dengan inputan.
• Apakah memberikan balikan atau tidak.
• Apakah mengganggu fitur yang lain atau tidak.
• Update struktur data.
• Memodifikasi data yang ada.

**Best Practices of API Testing**

- Kelompokkan test case kedalam beberapa kategori. Contoh satu fitur memiliki method (post, get, put) satukan dalam satu folder dengan nama fitur tersebut
- Beri judul yang sesuai pada setiap test. Contoh ketika melakukan testing method get suatu user, bisa beri nama API tersebut "Get User"
- Harus berhati - hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
- Ketika membuat test case harus dipikirkan juga segala kombinasi input pada API

**Type Of Output of an API**

- Bisa berbentuk apa saja, tapi pada umumnya JSON atau XML.
- Status balikan (response) apakah Passed atau Fail
- Memanggil fungsi API lain.

**Common Types of Test in API Testing**

- Memverifikasi apakah kita mendapat **respon** dari API.
- Memverifikasi apakah hasil input/request sudah **sesuai** atau belum.
- Memverifikasi apakah data yang kita **input/update** sudah benar-benar berubah atau bertambah.
- Memverifikasi **waktu** response yang diberikan.

**Type of Bugs that API testing Detects**

- Gagal melakukan error handling pada kedaan tertentu.
- Kesulitan untuk tersambung dan mendapat respon API.
- Isu keamanan.
- Performance Issues.
- Error atau warning yang tidak tepat.
- Struktur dari data respon tidak benar (JSON & XML)

**Advantages of Testing API,** beberapa keuntungannya antara lain:

- Efisiensi waktu.
- Bahasa yang independen
- Mengurangi biaya testing
- Mengurangi resiko

**Challenges of API Testing**
- Kombinasi parameter, pemilihan parameter.
- Tidak ada GUI (Graphical User Interface).
- Kita harus mengetahui terlebih dahulu parameter
- Perlu juga mengetest error handling dari setiap API.

**Kesimpulan**

API terdiri dari sekumpulan Classes/functions/procedures yang mewakili lapisan logika bisnis. Jika API tidak diuji dengan benar, ini dapat menyebabkan masalah tidak hanya pada aplikasi APL tetapi juga pada aplikasi pemanggil. Ini adalah tes yang sangat diperlukan dalam rekayasa perangkat lunak.
