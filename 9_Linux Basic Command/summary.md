# (9) Linux Basic Command
## Resume
1. Definisi Linux Command
2. Macam-macam Tentang Command Linux
3. Shell Script

### Definisi Linux Command
**Linux Commands** adalah sebuah utilitas dari Sistem Operasi Linux. Semua tugas dasar dan dasar dapat dijalankan di terminal linux, terminal merupakan antarmuka baris perintah untuk berinteraksi dengan sistem, yang mirip dengan command promt di windows. Command di linux sensitif dari huruf besar/kecil.

**Kelebihan dari command line:**

1. Less Resource, ringan digunakan sehingga tidak memerlukan kompoter dengan spesifikasi tinggi bila ingin menggunakan command line.
2. Repetitive Task, dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali.
3. Powerful, karena hanya menggunakan teks, antarmuka sistem operasi ini terlihat lebih stabil dibanding GUI, hal ini tidak akan mempengaruhi aktifitas karena tidak memakai resource memori yang terlalu banyak.

### Macam-macam Tentang Command Linux
### **Linux Commands Structure**

**command** [options] [parameters]
contoh:
ls -a /usr
artinya : berfungsi menampilkan semua file di directory, menampilkan file dengan format panjang dari directory /usr
ls -a -l
ls -al

### **Basic Command**

- **cal** : memiliki fungsi untuk menampikan calender
- **date** : untuk menampikan tanggal pada zona waktu yang tertera pada OS kita

etc

### **File System Commands**

**touch** : memperbolehkan untuk membuat file baru yang kosong melalui baris perintah file linux.
**cat** : untuk membuat daftar konten atau isi file pada standar output, untuk menjalankan command ini menggunakan "cat nama.txt"
**cp** : untuk menyalin file untuk directory saat ini ke directory yang berbeda.
**mv** : untuk memindahkan file meskipun sebenarnya bisa menggunakan untuk mengganti/mengubah nama file, argumen yang ada di mv serupa dengan argumen yang ada di perintah cp.
**rm** : berfungsi untuk menghapus directory beserta isiny, namun saat menggunakan command ini harus berhati-hati sedang ada dimana directory saat ini karena sekali command rm dijalankan maka semua akan terhapus dan tak bisa dipulihkan.
**mkdir** : untuk membuat directory baru.
**rmdir** : menghapus directory yang kosong
**cd** : menjelajahi file/directory
**pwd** : untuk mencari path dari directory yang digunakan saat ini, command ini yang akan mengembalikan path yang absolute yang pada dasarnya merupakan path semua directory yang diawali dengan garis miring.

### **Processes Control Commands**

**Top** : Akan menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut, melakukan pengawasan terhadap resource sistem sangatlah disarankan terutama ketika mencari tau mana proses yang perlu dimatikan karena terlalu banyak menggunakan resource
**Clear** : untuk membersihkan terminal jika di dalamnya sudah terdapat sekali command
**history** : jika sudah lihai menggunakan linux kita bisa menjalankan command atau perintah setiap hari, misalnya menggunakan command history untuk mengecek command yang sudah ditambahkan sebelumnya.
etc

### **Utilities Programs Commands**

**ls** : Berfungsi menampikan semua file di directory kerja kita
which : Digunakan untuk mencari file yang akan dieksekusi terkait dengan command yang diberikan
**sudo** : super user do, berfungsi untuk menjalankan task yang memerlukan hak akses atau permission administratif.
**find** : mencari file atau directory, lebih ditujukan untuk mencari file yang berada di directory yang diberikan
etc

### **File Access Permissions**

chmod : untuk membaca, menulis, dan menjalankan permission dari file/directory
chown : mengubah atau mentransfer kepemilikan file untuk user khusus atau spesifik
etc

### Shell Script
Shell Script adalah sebuah bahasa pemrograman yang disusun berdasarkan command command shell. Shell merupakan program yang berfungsi sebagai jembatan antar user dan kernel. Keuntungan menggunakan shell script di dunia testing yaitu ketika harus mengeksekusi beberapa command secara berturut turut hal itu membuat kita harus menunggu command pertama baru bisa melakukan command berikutnya, dengan adanya shell script tidak perlu menunggu lagi hanya perlu menuliskan semua command berdasarkan urutan yang akan dijalankan/dieksekusi hanya dengan 1 click saja.
