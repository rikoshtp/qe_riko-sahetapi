# (23) Post Processor
## Resume
1. Pengertian post processor
2. Json Extractor
3. Json Path

### Pengertian Post Processor 

Post Processor merupakan Elemen rencana pengujian yang digunakan untuk melakukan tindakan tertentu setelah pemrosesan permintaan sampler. Pemroses pos ini biasanya digunakan untuk mengekstrak nilai tertentu dari respons permintaan sampler, mis. kita dapat mengekstrak nilai variabel sesi dari permintaan HTTP dan meneruskan nilai variabel sesi ke permintaan berikutnya.

### **JSON Extractor**

pada JSON Extractor dapat mengambil nilai-nilai yang terdapat pada data Json yang dihasilkan dari respon saat kita melakukan request. Data dalam format Json dapat diolah oleh JMeter menggunakan Json Extractor(pada Post Processor).

### **JSON Path**

Aturan yang dapat digunakan untuk ekstrak isi dari json response

Beberapa ekspresi yang umum digunakan :

- $ =  root element, Seluruh data JSON yang didapatkan itu adalah dolar
- . = child operator (object), Mengakses child dari sebuah objek
- [] = child operator (array),  Mengakses elemen array berdasarkan index dari elemen array.
- .. = recursive descent (langsung ke objek), Operasi rekursif, misal ada objek di dalam array, jika ingin mengambil semua objek dalam array tersebut bisa menggunakan tanda titik-titik, tanpa menulis index dari elemen array tersebut
- "*" = wildcard (all things), mengambil keseluruhan
- [start:end] = array slice operator borrowed, memotong array dari index start sampai end
