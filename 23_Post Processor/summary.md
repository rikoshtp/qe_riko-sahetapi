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

# TASK
![image](https://user-images.githubusercontent.com/75010847/161705449-c2c62925-e77c-4c65-82ad-ab8e75fcd923.png)

Jawab: 
1. Path 1: [GET]/api/users?page=2

![image](https://user-images.githubusercontent.com/75010847/161707073-2c1357a5-75aa-4c5d-a727-a529ed207bef.png)

hasil :

![image](https://user-images.githubusercontent.com/75010847/161927607-0ea2861d-99d6-4dfd-b7ca-f827b6d49e5f.png)

2. Path 2: [GET]/api/unknown/${id}

![image](https://user-images.githubusercontent.com/75010847/161927320-9500aa1a-eaf1-4810-abd8-d3a58fd3d012.png)

hasil: 
![image](https://user-images.githubusercontent.com/75010847/161927440-c0f497e2-263d-47ea-9595-39cee5506e1b.png)


![image](https://user-images.githubusercontent.com/75010847/161927494-ab996dbf-ea9b-4ead-9869-f36dc4665cce.png)


3. Path 3: [POST]/api/users

![image](https://user-images.githubusercontent.com/75010847/161706894-ec7a4fc6-0cc6-45a6-817a-7f1a2b566a95.png)

hasil: 

![image](https://user-images.githubusercontent.com/75010847/161927649-83e62368-7493-43b2-81d8-4c9563941dc9.png)
