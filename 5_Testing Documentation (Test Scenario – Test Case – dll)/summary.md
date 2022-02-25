# (5) Testing Documentation (Test Scenario – Test Case – dll)
## Resume
Dalam materi ini mempelajari:
1. Test Scenario 
2. Test Case
3. Contoh Implementasi

### Test Scenario 
Test Scenario merupakan sebuah dokumen yang berisi sekumpulan langkah-langkah sistematis yang disusun oleh Software Tester, agar sistem yang akan diuji dapat memenuhi ketentuan yang diinginkan oleh user, memenuhi standar tertentu, serta dapat berfungsi dengan baik. Test Scenario merupakan tingkatan tertinggi dari sebuah Test Case.

Ada beberapa **tujuan** dalam membuat Test Scenario:

1. Memudahkan Developer dan Tester untuk melakukan Testing.
2. Menjadi dasar pengembangan bagi pengerjaan project
3. sebagai dasar client maupun product owner menyesuaikan dengan system requirement

Beberapa **Tools** yang dapat digunakan untuk membuat Test Scenario:

1. Google Spreadsheet
2. Test Rail,
3. Test Link,
4. [Test.io](http://test.io/), dll

Bagaimana membuat Test Scenario yang baik? berikut kriterianya:

1. System Requirement: kunci sehingga dapat menyusun scenario test sesuai flow yang telah ditentukan
2. Give detail: memberikan rincian secara spesifik hal-hal yang perlu diketahui oleh user
3. Give Context: user bersikap seolah-olah user melakukan hal tersebut
4. Crystal clear, easy to understand: berikan penjelasan secara detail, terkait test step dan spesifikasi expected result.
5. Combite: user dapat melakukan apapun sesuai dengan system requirement yang diberikan
6. coherent, antara sceranio/step 1 dengan lainnya harus bersinambungan.
7. proofS, lengkapi dengan hasil yang didapatkan dari hasil scenario yang dilakukan, contoh resultnya pass or fail
8. konsisten, penggunaan kata harus konsisten, jika penggunakan kata menggunakan field email, maka pada kata test step selanjutnya harus sesuai dengan kata yang ditulis di awal.
9. end user mind, don't assume, contoh: dalam pemberian notifikasi, client membutuhkan berupa pop-up atau alert message
10. don't forget cover negatif test, tidak semua step yang dilakukan berkondisi positif, "think offsite of the box" tulis semua kemugnkinan yang ada
11. update: perubahan itu pasti, catat semua perubahan dan perbarui versi pembuatannya.

### Test Case
**Test Case** atau uji kasus adalah suatu rancangan atau rangkaian mengenai tindakan yang dilakukan oleh Software Tester untuk melakukan verifikasi terhadap fitur atau fungsi tertentu pada sebuah perangkat lunak.

Pembuatan **test case bertujuan** untuk agar suatu system dapat dijalankan dengan baik sesuai dengan kebutuhan awal, serta mampu memberi respon ketika mendapat suatu masukan yang tidak valid.

**Test Case** memiliki beberapa **component**:
test case id, test case description, pre-condition, test step, expected result, actual result, dan status.

Beberapa hal yang perlu diperhatikan dalam membuat **Test Case**:

1. **Sederhana dan transparant**
dalam pembuatan test case, penguji harus membuat yang sederhana, jelas, dan ringkas, supaya orang lain dapat mengeksekusi. Gunakan bahasa yang mudah dipahami sehingga membantu pemahaman pengujian menjadi mudah dan pelaksanaan pengujian menjadi lebih cepat.
2. **End user in mind,**
tujuan utama pembuatan software adalah untuk membuat kasus uji yang memenuhi persyaratan client yang mudah digunakan dan dioperasikanm dengan demikian software tester harus mampu membuat kasus uji dengan mengingat perspektif dari pengguna akhir.
3. **Hindari pengulangan kasus uji.**
Dalam pembuatan test case usahakan untuk tidak membuat pengujian yang berulang. Jika sebuah test case diperlukan untuk mengeksekusi test case lain penguji dapat memanggil test case tersebut ke dalam kolom pre-condition.
4. **Jangan berasumsi**
    
    Dalam membuat test case jangan mengasumsikan mengenai fitur dan fungsi dari perangkat yang sedang diuji. Pengujian harus sesuai dokumen dan spesifikasi.
    
5. **Test Case harus dapat diidentifikasi**
    
    Nama dari testcase id harus dapat diidentifikasi sehingga memudahkan software tester ketika akan melacak error atau mengidentifikasikan persyaratan perangkat lunak pada tahap berikutnya.
    
6. **Repeat-able and soft standing**
    
    Dalam membuat test case, test case harus menghasilkan hasil yang sama setiap kali, siapapun yang akan melakukan pengujiannya.
    
7. **peer review**
    
    Test case yang dibuat harus bisa ditinjau oleh orang lain, hal ini memungkinkan orang lain menemukan sebuah cacat yang terlewatkan,

### Contoh Implementasi
Test Scenario : Check the Login Functionality

Test Case 1: Enter valid email and valid password

Test Case 2: Enter valid email and invalid password

Test Case 3 : Enter invalid email and valid password

Test Case 4 : Enter invalid email and invalid password


## TASK: 
Test Case "Sepulsa.com" https://docs.google.com/spreadsheets/d/1-BvAXMBZw_ZzyXejxlv39lSeV9jLRmUIHab2C1L5UrE/edit?usp=sharing
