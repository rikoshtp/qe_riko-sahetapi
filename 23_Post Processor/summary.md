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

![image](https://user-images.githubusercontent.com/75010847/161706158-258f84aa-7915-4e7e-a31f-cb633382639f.png)

2. Path 2: [GET]/api/unknown/${id}

![image](https://user-images.githubusercontent.com/75010847/161706846-71ae7723-b281-4a89-99f3-d5913c7950fb.png)

hasil: Terjadi error karena path tidak ditemukan
![image](https://user-images.githubusercontent.com/75010847/161706802-db53e9ea-1d1e-4681-9840-e1c5ce476b21.png)


![image](https://user-images.githubusercontent.com/75010847/161706586-5d6b9e3e-3b60-4c5a-9184-4057eca4aa07.png)


3. Path 3: [POST]/api/users

![image](https://user-images.githubusercontent.com/75010847/161706894-ec7a4fc6-0cc6-45a6-817a-7f1a2b566a95.png)

hasil: 

![image](https://user-images.githubusercontent.com/75010847/161706931-49034a92-f571-448b-ab9f-ae25964c619d.png)
