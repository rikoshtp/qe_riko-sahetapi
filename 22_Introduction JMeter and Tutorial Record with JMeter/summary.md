# (22) Introduction JMeter and Tutorial Record with JMeter

## resume
1. Kenapa JMeter?
2. Komponen JMeter
3. Penggunaan JMeter

Beberapa Tools yang dapat didigunakan pada pengujian pada sebuah website yang ingin diketahui performancenya: JMeter, Grafana K6, Locust, BlazeMeter, LoadNinja.

### **Kenapa JMeter?**

Berlisensi Apache, JMeter adalah perangkat lunak sumber terbuka, aplikasi desktop Java 100% murni, yang dirancang untuk memuat uji perilaku fungsional dan mengukur kinerja situs web. Awalnya dirancang untuk aplikasi web pengujian beban tetapi sejak itu diperluas ke fungsi pengujian lainnya. JMeter juga terbuat dari aplikasi desktop berbasis Java yang dirancang untuk menguji perilaku suatu website sehingga pengguna dapat melihat apakah website tersebut memiliki fungsionalitas yang sesuai.

Keuntungan yang didapat jika menggunakan JMeter:

- Open Source, sehingga kita dapat melihat kode dari aplikasi Jmeter ini, jika ada masalah dapat melihat sendiri permasalahan tersebut terjadi dimana.
- Easy to user with GUI/ Non GUI

### **Some components of JMeter script**

- **Test Plan**
    
    Rencana besar tes yang akan dilakukan (parent)
    
- **Thread Groups**
Kumpulan thread yang menjalankan skenario yang sama
- **Samplers**
Sebutan untuk request yang dikirim ke server web.
- **Config elements**
Elemen yang digunakan untuk konfigurasi atau modifikasi sampler requests yang dikirim ke server sehingga jika ingin memodifikasi sampler maka dapat menggunakan config elements.
- **Listeners**
Perekam data yang dihasilkan dari tes. merekam apapun yang terjadi saat test dilakukan
- **Timers**
Fitur ini akan jalan duluan sebelum semua fitur yang lain berjalan. Mencatat waktu saat testing dilakukan.
- **Assertions**
Seperti assert pada API/Web/Testing, merupakan kriteria tambahan untuk menguji apakah pass/tidak
- **Pre-post processors**
    
    Fitur yang memproses response data sebelum/sesudah tes
    
    ### Tahap penggunaan JMeter
    
    1. Install Tools (JDK, JMeter, Plugin)
    2. Open/run JMeter dari Terminal
    3. Select template
    4. Enable HTTP(S) Test script Recorder
    5. Start HTTP(S) Test Script Recorder
    6. Set up Proxy on your Firefox Browser
    7. Record
    8. stop Record
