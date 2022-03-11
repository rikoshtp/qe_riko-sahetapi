# (12) Iterable Data Structure
## Resume
1. Iterable dan Iterator
2. List 
3. Set

### Iterable dan Iterator
Iterable merupakan sekumpulan data atau struktur data yang dapat dilakukan iterasi atau perulangan kepadanya.

***Implementasi tujuan umum***

Implementasi tujuan umum adalah yang paling implementasi yang umum digunakan, dirancang untuk penggunaan sehari-hari. Mereka diringkas dalam tabel berjudul General-purpose-implementations.

![image](https://user-images.githubusercontent.com/75010847/157817942-a76b0903-1d12-4ec9-8d6f-1453866f1cc3.png)

Contoh penggunaan iterable 
```java
    public static void main(String[] args) {
	Iterable<String> names = List.of("alterra", "academy");
	for (var name: names ){
		 System.out.println(name);
	}
}
```
***Iterator (method)***

Iterator adalah kelas yang mengelola iterasi di atas Iterable. Itu mempertahankan keadaan di mana kita berada dalam iterasi saat ini, dan tahu apa elemen berikutnya dan bagaimana mendapatkannya. Contoh penggunaan:
```java
      import java.util.Iterator;
import java.util.List;
public class Main {
   public static void main(String[] args) {
       Iterable<String> names = List.of("alterra", "academy");
       Iterator<String> it = names.iterator();
       while(it.hasNext()) {
            String i = it.next();
            System.out.println(i);
			}
	}
}
```

### List (method)

- Antarmuka Daftar menyediakan cara untuk menyimpan koleksi yang dipesan.
- Ini adalah antarmuka anak Collection.
- Ini adalah kumpulan objek yang dipesan di mana nilai duplikat dapat disimpan.
- Karena Daftar mempertahankan urutan penyisipan, ini memungkinkan akses posisional dan penyisipan elemen.

Method yang terdapat pada list, biasanya digunakan untuk memanagement data yang terdapat pada list, seperti menambah, menghapus, mengecek apakah data tersedia dalam list, mencocokan apakah data dalam list sama dengan list lainnya.

*** ArrayList ***

Ini memberi kita array dinamis di Java. Padahal, itu mungkin lebih lambat dari standar array tetapi dapat membantu dalam program di mana banyak manipulasi dalam array diperlukan. data yang disimpan pada ArrayList bisa berapapun selama memori penyimpanan belum penuh.

*** LinkedList ***

Linked list terdiri dari node di mana setiap node berisi data dan dan referensi ke node berikutnya dalam daftar. Tidak seperti array, data tidak disimpan dalam satu blok memori yang berdekatan dan tidak memiliki ukuran yang tetap. Sebaliknya, ini terdiri dari beberapa blok memori di alamat yang berbeda.

### Set
***Hash Set***
Hash tidak menerima data duplikat. HashSet menyimpan elemen dengan menggunakan mekanisme yang disebut hashing. HashSet hanya berisi elemen unik. HashSet memungkinkan nilai nol. Kelas HashSet tidak disinkronkan. HashSet tidak mempertahankan urutan penyisipan. Di sini, elemen dimasukkan berdasarkan Kode hash. HashSet adalah pendekatan terbaik untuk pencarianoperasi. Kapasitas default awal HashSet adalah 16, dan faktor bebannya adalah 0,75.
```java
public static void main(String[] args) {
   Set<Integer> umur = new HashSet<> ();
   umur.add(3);
   umur.add(3);
   umur.add(4);
   umur.add(2):
   System.out.println(umur);  //output: [2,3,4]
}
```
***LinkedHashSet***

Kelas Java LinkedHashSet berisi unik elemen hanya seperti HashSet. Kelas Java LinkedHashSet menyediakan semua opsional mengatur operasi dan mengizinkan elemen nol.
Kelas Java LinkedHashSet tidak disinkronkan. Kelas Java LinkedHashSet mempertahankan penyisipan memesan.
```java
public static void main(String[] args) {
  Set<Integer> umur = new LinkedHashSet<>();
  umur.add(3);
  umur.add(3);
  umur.add(4);
  umur.add(2);
  System.out.println(umur); //output: [3,4,2]
}
```

***EnumSet***

Itu hanya dapat berisi nilai enum dan semua nilai harus dimiliki oleh enum yang sama. Itu tidak memungkinkan untuk menambahkan nilai nol, melemparkan NullPointerException dalam upaya untuk melakukannya. Ini bukan thread-safe, jadi kita perlu menyinkronkannya secara eksternal jika diperlukan. Elemen disimpan mengikuti urutan di mana mereka dideklarasikan di enum. Ini menggunakan iterator fail-safe yang bekerja pada salinan, sehingga tidak akan membuang. ConcurrentModificationException jika koleksi dimodifikasi saat mengulanginya.
```java
public class Main {
  enum months {
      JANUARY, FEBRUARY, MARCH, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
	}
  public static void main(String[] args) {
      Set<months> set = EnymSet.allof(months.class);
      Iterator<months> iter = set.iterator();
      while (iter.hasNext())
         System.out.println(iter.next()):
		}
}
```
