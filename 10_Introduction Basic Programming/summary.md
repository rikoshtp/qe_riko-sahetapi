# (10) Introduction Basic Programming
## Resume
1. Definisi Java
2. Tipe data, Array, dan Operator
3. Input-Output, Branch, Looping

## Definisi Java
Bahasa pemrograman Java adalah bahasa pemrograman yang beriorientasi pada object, dan program java tersusun dari bagian yang disebut class. Class sendiri terdiri dari berbagai metode yang melakukan pekerjaan dan mengembalikan informasi setelah melakukan tugasnya.
Alasan bahasa pemrograman Java dipergunakan, diantaranya:

1. Bahasa yang digunakan sederhana
2. Hanya focus pada object
3. Pengamanan yang cukup ketat
4. Dapat dipakai di sistem operasi manapun
5. Menggunakan sistem acception handling (bagian yang memisahkan penanganan masalah dan bagian code normal).
6. Mendukung nativ method
7. Terdapat garbage collector (mengumpulkan sampah secara otomatis)
8. Daftar pustaka yang lengkap
9. Adanya fitur GUI (Graphical User Interface)
10. Penyempurnaan dari C++
11. Bisa digunakan di berbagai platform (lintas platform)

Tools yang dipakai untuk mendevelop Java adalah

- JDK, komponen inti dari java dan untuk proses developing, debugging, dan monitoring. Di dalamnya terdapat JRE (Java Runtime Environtment) untuk mendukung aplikasi java untuk dijalankan.
- IDE, tools yang membantu developer untuk membuat aplikasi, di dalamnya terdapat source code editor, build outomation tools, dan debugger. Contoh IDE: BlueJ, NetBeans, Eclipse, IntelJ IDEA.

## Tipe data, Array, dan Operator
Tipe Data terdapat beberapa jenis, yaitu:
**Integer** adalah tipe data integer 32 bit yang digunakan untuk menyimpan angka dalam *range* cukup besar. contoh:

`int number = 1;`

**String** adalah kumpulan beberapa karakter (char). Contoh:

`String word = "alterra academy";`

**Float** Merupakan sebuah tipe data yang bisa digunakan untuk menampung angka desimal 7 digit. contoh 

`float angka = (float) 0.0000007;`

**Double** Merupakan sebuah tipe data yang mirip seperti tipe data float, namun memiliki kapasitas yang lebih besar 15 digit. Contoh

`double total = 0.000000000000015;`

**Boolean** merupakan sebuah tipe data yang memiliki 2 (dua) macam nilai, yaitu **true** dan **false**. Contoh: 

`boolean status = false;`

**Char** merupakan sebuah tipe data yang bisa digunakan untuk menampung karakter. contoh:

`char huruf = 'a';`

**Array,** 
Array merupakan sebuah variabel yang dapat menyimpan banyak data dalam 1 variabel, array menggunakan sebuah index untuk memudahkan akses terhadap data yang disimpannya, index array selalu dimulai dari 0, dan index juga tidak selalu dalam bantuk angka, bisa juga char atau text. Contoh:

```java
char[] alterra = new char[]{
    'a', 'l', 't', 'e', 'r', 'r', 'a'
};
```

***Operator***
Terdapat beberapa operator dalam java, yaitu:
- Assignment (=)
- Arithmetic (+,-,*,/,%)
- Unary (+, -, ++, --, !)
- Equality dan Relational (==, !=,>, >=, <, <=)
- Conditional (&&, ||)

## Input-Output, Branch, Looping
- **Input :** Nilai yang dimasukkan
- **Proses :** Serangkaian langkah yang dilakukan untuk mengelola input yang diberikan
- **Output :** Menampilkan hasil olah data.

**Branch**

Percabangan atau branching adalah istilah yang digunakan untuk menyebut alur program yang bercabang, percabangan juga dikenal dengan control flow/structure kondisi/structure if/decision. Contoh percabangan: 

- if,
- else,
- switch

**Looping**

Looping merupakan sebuah perulangan, yang termasuk perintah looping adalah: For, While, Do While.

Looping dalam pemrograman dibagi menjadi 2 jenis:

1. Count Loop: Perulangan yang jumlah perulangannya terhitung (pasti). contoh: 
    - For
    
    ```java
    for (int i = 1; i< 3; i++) {
    Systen.out.println(i)
    ```
    
    - Foreach
    ```java
       public class Looping {
       public static void main(String[] args) {
           int angka[] = {1,2,3,4,5,6};

           for (int item : angka) {
              Systen.out.println(item + " );
            }
            
          }
       }
    ```
    
2. Uncount Loop: Perulangan yang jumlah pengulangannya tidak terhitung atau tidak tentu. contoh: 
- While, melewati blok kode selama kondisi yang ditentukan benar.
  ```java
      import java.util.Scanner;
      public class WhileLoop {
        public static void main(String[]args) {
        boolean running = true;
        int counter = 0;
        String result;
        Scanner scanner = new Scanner(System.in);
        
        while (running) {
            System.out.println("Apakah anda ingin keluar ????");
            System.out.println("Jawab [ya/tidak]");
            result = scanner.nextLine();
            if (result == "ya") {
                running = false;
            }
            counter++;
          }
        }
      }

  ```
- do while, Loop ini akan mengeksekusi blok kode satu kali, sebelum memeriksa apakah kondisinya benar, kemudian akan mengulangi loop selama kondisinya benar.
 ```java
 String nohp = "081111000";
int nilai = 1; :%3B
do {
  System.out.printin(nohp + nilai);
  nilai++;
} while (nilai <= 10);
```
