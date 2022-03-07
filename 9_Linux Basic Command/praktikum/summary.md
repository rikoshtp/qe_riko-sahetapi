# TASK
## 1. Cobalah semua Linux Command yang sudah dijelaskan di materi ini.(Screenshot dan Analisa/Keterangan)
### Basic Commands
![image](https://user-images.githubusercontent.com/75010847/157004870-1f648cb7-3d03-404f-9365-ed8154474ecc.png)
- **cal** : memiliki fungsi untuk menampikan calender, namun tidak bekerja pada gitbash windows
- **date** : untuk menampikan tanggal pada zona waktu yang tertera pada OS kita
### FILE SYSTEM Commands
![image](https://user-images.githubusercontent.com/75010847/157005816-0e6936d3-8793-48ec-b6f2-412821ae91fa.png)

- **touch** Digunakan untuk membuat file baru.
- **cat** digunakan untuk membuka file.

![image](https://user-images.githubusercontent.com/75010847/157008725-9259e7c0-0f3c-44d7-aa9d-6a1d5929c9f7.png)
- rm : digunakan untuk menghapus file.
- mkdir : untuk membuat directory baru.
- rmdir : menghapus directory yang kosong

![image](https://user-images.githubusercontent.com/75010847/157012161-3905532f-c868-47c7-ace9-d55ca0ce37cf.png)
- cd : Digunakan untuk berpindah direktori
- cp : Digunakan untuk melakukan copy file.
- pwd : Menampilkan nama direktori dimana saat itu sedang berada. 

### Processes CONTROL Commands
![image](https://user-images.githubusercontent.com/75010847/157012857-5053f730-8f1e-4fed-9f9e-994d1c1fa4a5.png)
- clear : menghapus semua command sebelumnya, oleh karena itu tidak terlihat
- top : tidak dapat bekerja pada gitbush windows
- history : melihat perintah apa saja yang pernah diketik

### UTILITIES Programs Commands
![image](https://user-images.githubusercontent.com/75010847/157016812-cc0fdf4e-703f-462f-beb4-344a521e50ea.png)

- ls :Berfungsi menampikan semua file di directory kerja kita
- find : mencari file atau directory, lebih ditujukan untuk mencari file yang berada di directory yang diberikan

![image](https://user-images.githubusercontent.com/75010847/157017058-14d87026-d7f2-45c1-955c-db1571c7e1d1.png)
- which : untuk mencari file yang dapat dieksekusi terkait dengan command yang diberikan
- sudo : super user do, berfungsi untuk menjalankan task yang memerlukan hak akses atau permission administratif.

### FILE ACCESS Permissions
![image](https://user-images.githubusercontent.com/75010847/157015695-a10ac117-4625-4ef8-9d21-38abbd5ab1bc.png)

- Chmod : untuk membaca, menulis, dan menjalankan permission dari file/directory. 777 mewakili izin untuk pengguna, grup, dan lainnya  dengan angka 777 merupakan combinasi dari 4+2+1 (read, write, and execute).


## 2. Buatlah Shell Script dengan minimal 5 Command dan jelaskan. (Screenshot dan Keterangan)

### a. Membuat file shell script

![image](https://user-images.githubusercontent.com/75010847/156996276-6051ef1e-8f0c-463e-99e1-379524f5c6ea.png)

- Baris pertama, ***echo*** untuk menampilkan output, ***'#!/bin/sh'*** merupakan isi yang akan ditampilkan, ***>*** perintah untuk menulis ke file, ***my-script.sh*** adalah nama filenya. 
- Baris kedua, ***echo*** Perintah untuk menampilkan, ***'echo Hello World'*** merupakan Isi yang akan di tampilkan, ***>>*** Perintah untuk menambahkan ke file, ***my-script.sh*** nama dari file
- Beris ketiga, menggunakan ***cat*** untuk membuat daftar konten atau isi file pada standar output, kemudian akan tercetak "echo Helo World" diakhir seperti pada sintaks yang dimasukan diantara tanda kutip pada file my-script.sh

### b. Menjalankan/run file
![image](https://user-images.githubusercontent.com/75010847/156999584-53faf432-5054-4022-ba39-98a51061102a.png)

tanda "***./***" Perintah untuk menjalankan file bash jika berada dalam 1 folder aktif, sedangkan my-script.sh adalah nama file yang akan dirun

### c. Melihat file yang dibuat pada directory
![image](https://user-images.githubusercontent.com/75010847/157000335-1358d054-7c22-4683-a5c2-60b8e0817340.png)

perintah ***ls*** untuk menampikan semua file di directory kerja 

### d. Membuat file baru dan mengisi file dengan variabel
![image](https://user-images.githubusercontent.com/75010847/157001911-538a78bf-8b5e-48bd-a0ba-787267f08570.png)

***nano*** digunakan untuk membuat file baru dan menuju ke GUI, kemudian cat untuk membuat daftar konten atau isi file pada standar output, kemudian tanda "./" untuk melakukan running

### e. Membuat file baru dan mengisi file dengan operasi pengkalian variabel
![image](https://user-images.githubusercontent.com/75010847/157003874-2e151b4f-7dcb-4e4f-bfe0-5a90e4f235bb.png)

***nano*** digunakan untuk membuat file baru dan menuju ke GUI, kemudian cat untuk membuat daftar konten atau isi file pada standar output, kemudian tanda "./" untuk melakukan running. 

