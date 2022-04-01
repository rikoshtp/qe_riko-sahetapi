# (11) Fundamental Performance Test
## Resume
1. Performance Test
2. Metode Performance Test
3. Tipe-tipe dari perfomance Testing

### Performance Test

Merupakan teknik non-functional testing untuk menentukan parameter sistem dalam hal responsive dan stabilitas di bawah berbagai beban dan load kerja. Perfomance testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan, dan penggunaan resource. Hasil pengujian biasanya berupa number of virtual user, error rate, transaction per secon, average respon time, dll. 

Yang diukur dari Perfomance Test

- Performa suatu aplikasi sampai suatu batas tertentu.
Bukan merupakan functional-test
- Bisa dalam berbagai macam bentuk untuk memahami
reliability, stability dan availability pada environment-nya.
contoh:
- Mengamati response time ketika menjalankan request
dalam jumlah yang sangat banyak
- Melihat suatu sistem berinteraksi dengan jumlah data
yang cukup besar.

Perfomance Test Jarang Dilakukan karena, Pada umumnya performance testing cukup mahal untuk diaplikasikan dan dijalankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada. Hal ini disebabkan karena pengetesannya memerlukan persiapan yang dimana beberapa kasus harus membuat environment terpisah dari production agar tidak tercampurnya data test dengan data production. Environment ini ada juga yang membuatnya di server cloud yang biayanya bisa lebih besar dari environment production.
Yang harus diperhatikan dari Perfomance Test biasanya yang menjadi perhatian adalah throughput dan response data-nya. Contoh Kasus Performance Test:
Sebuah sistem baru yang akan di launch ke production, namun sebelum masuk ke production perlu dilakukan performance test untuk mengetahui throughput dan response time dari sistem tersebut. Untuk informasi endpoint yang akan di test adalah:

- /login
- /beli-pulsa
- /cek-out

Langkah yang harus dilakukan:
1. Membuat test plan
2. Membuat script test
3. Melakukan performance test
4. Menganalisa hasil performance test

### Metode Perfomance Test

1. **Membuat Test Plan**
Kenali yang dibutuhkan :
• Endpoint yang akan ditest :
- /login
- /beli_pulsa
- /cek_out

Kebutuhan masing - masing endpoint :
- Username dan password untuk endpoint /login
- Produk, denom dan nomor untuk pengetesan untuk endpoint /beli_pulsa
- Metode pembayaran yang dipilih untuk endpoint /cek_out

2. **Menentukan Metode Test**
• Pilih berdasarkan kondisi sistem, apakah belum pernah dites atau sudah (Selalu awali dengan load test untuk tahu kondisi awal sistem)
• Pilih berdasarkan situasi yang akan dihadapi

### **Tipe-tipe dari perfomance Testing**

1. Smoke Testing

Dilakukan untuk verify script yang sudah dibuat, apakah sistem tersebut dapat handle minimal load, tanpa masalah sama sekali. Biasanya hanya 1-2 VUs. Biasanya dilakukan setelah software dibuild untuk memastikan fungsi penting dari program dapat berjalan dengan baik. 

2. Load Testing

Load Testing adalah pengujian yang paling sederhana yang dilakukan untuk memahami perilaku sistem dalam keadaan beban tertentu. Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi yang kritis dengan memonitor dampak terhadap database, application server atau pendukung lainnya. Sederhananya load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak. Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai di load test. Bagaimana jika sistem belum pernah masuk ke production dan tidak diketahui idealnya?

3. Stress Testing

Metode ini untuk dilakukan untuk mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. Dilakukan bertahap menuju load normal, puncak, dan melebihinya, lalu turun untuk melihat proses recovery.

4. Spike Testing

Seperti stress test, namun kenaikan langsung menuju melebihi puncak dilakukan dalam waktu singkat. Jika stress test memberikan waktu untuk scale-out, disini tidak. Salah satu contoh adalah pada saat flash sale di suatu e-commerce, yang dimana banyaknya kunjungan pengguna yang langsung memuncak saat mengakses halaman flash sale.

5. Soak Testing

Untuk mengetahui reliability ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam). Dapat mengetahui apakah terdapat bug pada race condition, memory leaks, db connection dsb. Tips: metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di production.

**Tools Perfomance Test**

1. Cloud ninja, performance tools berbasis cloud ini memberdayakan tim untuk merekam dan memutar langsung pengujian beban konfrensif tanpa toleransi dinamis yang rumit dan menjalankan performance test di browser secara real dalam secara besar, tim dapat meningkatkan cekungan test dan potongan waktu pengujian beban lebih dari 60 persen.
2. HP LoadRunner, adalah alat performance testing paling popular saat ini, tools ini mampu mensimulasikan ratusan ribu pengguna, menempatkan aplikasi dibawah beban kehidupan nyata untuk menentukan perilaku mereka di bawah beban yang diharapkan.
3. JMeter, performance test yang populer untuk pengujian server, web, dan aplikasi.


# Praktikum / Task
1. Apa itu volume test? Apakah sama dengan load test?

jawab: 

Volume test adalah salah satu non-functional test yang menguji ketahanan suatu sistem ketika diberi database yang banyak. Dikenal juga dengan istilah flood test. Berbeda dengan load test yang menguji ketahanan secara umum, volume test berfokus pada sistem databasenya saja.

2. Bagaimana contoh sistem yang kurang stabil?

jawab: 

![image](https://user-images.githubusercontent.com/75010847/160999427-75cb0798-8b12-42bd-8c1f-8cf59f458a4b.png)

contoh sistem yang kurang stabil dapat dilihat dari gambar di atas. Dimana terdapat waktu rata-rata yang cukup baik yaitu 3 min ketika sedikit muatan pada jam 12:44, namun ketika diberi beban yang besar pada 10 menit kemudian, maka waktu load mendapat 3 kali lipat lebih lama yaitu mendapat waktu maximal 9 min.
