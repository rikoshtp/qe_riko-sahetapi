# (26) Testing in CI/CD Pipeline
## Resume
1. Continuous Integration (CI)
2. Continuous Delivery/Deployment(CD) 
3. Components of GiftHub Actions

### Continuous Integration (CI)
**Continuous Integration (CI)** adalah praktik mengintegrasikan kode ke dalam repositori bersama dan membangun/menguji setiap perubahan secara otomatis, sedini mungkin - biasanya beberapa kali sehari. Paling baik dicapai melalui integrasi dengan kontrol versi.

**What makes for good CI**

- Decoupled Stages, Setiap langkah dalam CI harus melakukan tugas tunggal yang terfokus.
- Repeatable, Otomatis dengan cara yang dapat diulang secara konsisten. Alat harus bekerja untuk pengembang lokal juga.
- Fail Fast, Gagal pada tanda pertama masalah

**Benefits of implementing CI**

- Detecting Bug in Early Stage
- Reduces Bug Count
- Development Process more Transparent
- Eficient

**Continuous Integration costs**

- Write Automated Test
- Server for Automated Test
- Merge the code as often as possible

### **Continuous Delivery/Deployment(CD)**

**Continuous Delivery/Deployment(CD)** menambahkan bahwa perangkat lunak dapat dirilis ke produksi kapan saja, seringkali dengan secara otomatis mendorong perubahan ke sistem staging. Deployment Berkelanjutan melangkah lebih jauh dan mendorong perubahan ke produksi secara otomatis UGO.  **Continuous Delivery** Secara otomatis menyiapkan dan melacak rilis ke produksi. Hasil yang diinginkan adalah siapa pun dengan hak istimewa yang memadai untuk menerapkan rilis baru dapat melakukannya kapan saja dalam satu atau beberapa klik. Dengan menghilangkan hampir semua tugas manual, pengembang menjadi lebih produktif. **Continuous Deployment** Setiap perubahan dalam kode sumber dikerahkan ke produksi secara otomatis, tanpa persetujuan eksplisit dari pengembang. Asalkan lolos quality control.

**What makes for good CD**

- Design with system in mind, Mencakup sebanyak mungkin bagian penerapan, seperti: Aplikasi, Infrastruktur, Konfigurasi, Data.
- Pipelines, Terus tingkatkan kepercayaan diri saat Anda bergerak menuju produksi.
- Globally Unique Versions, Mengetahui keadaan sistem setiap saat, Mampu menunjukkan perbedaan antara keadaan saat ini dan masa depan

**Tahapan atau proses CI/CD**

1. Commit, Developer akan menulis sejumlah code kemudian akan dieksekusi menggunakan version control system seperti GIT, atau memanggilnya commit
2. Build, Software atau aplikasi akan memasuki fase build, dimana developer akan menggabungkan code awal dan code yang baru kemudian mengcompilenya dengan compiler.
3. Test, developer akan melakukan testing pada aplikasi/software tersebut.
4. Deploy, Developer akan memulai tahap deploy dengan menjalankan software di test server atau pada stagging server, jika tidak masalah developer akan melanjutkan ke autotest. Jika keseluruhan software berfungsi sebagaimana mestinya, maka dapat menjalankan software ke production. Jika ada masalah kedepannya, developer akan memperbarui versi dari software tersebut melalui version control, hal ini akan berlangsung terus menerus hingga software bebas dari masalah.

**Benefits of Implementing CD**

- Reduce the Risk
- Painless deployment
- Reduces Costs
- Automated and Transparent Process
- Releases More Frequently

**Continuous Delivery / Deployment Costs**

- Strong Foundations in CI
- Need highest quality of test
- Documentation Needs to be updated Frequently

CI/CD Tools: Jenkins, Atlassian Bamboo, Circleci, AWS CodeBuild, Azure DevOps, Travis CI, Github Actions.

### Components of GiftHub Actions

**Workflow**

Workflow adalah proses otomatis yang dapat dikonfigurasi yang akan menjalankan satu atau lebih pekerjaan. Alur kerja ditentukan oleh file YAML yang diperiksa di repositori Anda dan akan berjalan saat dipicu oleh suatu peristiwa di repositori Anda, atau bisa dipicu secara manual, atau pada jadwal yang ditentukan.

**Events**

Event adalah aktivitas spesifik dalam repositori yang memicu alur kerja berjalan. Misalnya, aktivitas dapat berasal dari GitHub saat seseorang membuat permintaan tarik, membuka masalah, atau mendorong komit ke repositori.

**Runners**

Runner adalah server yang menjalankan alur kerja Anda saat dipicu. Setiap pelari dapat menjalankan satu pekerjaan pada satu waktu. GitHub menyediakan Ubuntu Linux, Microsoft Windows, dan runner macOS untuk menjalankan alur kerja Anda.

**Jobs**

Jobs adalah serangkaian langkah dalam alur kerja yang dijalankan pada runner yang sama. Setiap langkah adalah skrip shell yang akan dieksekusi, atau tindakan yang akan dijalankan. Langkah-langkah dijalankan secara berurutan dan saling bergantung satu sama lain. Karena setiap langkah dijalankan pada runner yang sama, Anda dapat berbagi data dari satu langkah ke langkah lainnya.

**Actions**

Action adalah aplikasi kustom untuk platform GitHub Actions yang melakukan tugas yang kompleks namun sering diulang. Gunakan tindakan untuk membantu mengurangi jumlah kode berulang yang Anda tulis di file alur kerja Anda.
