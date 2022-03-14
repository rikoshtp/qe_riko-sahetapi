# (13) Map Data Structure
## Resume
1. Pengertian Map
2. Implementasi Map
3. Sorted Map

### Pengertian Map
Map merupakan struktur data yang ada di java yang dapat digunakan untuk menyimpan banyak data di dalamnya. Data yang tersimpan di dalam map diidentifikasi di dalam key, dan setiap key akan memiliki datanya sendiri yang disebut value, jadi Map disebut juga penyimpanan data berbasis key value. Method yang dapat digunakan adalah menambah, menghapus, mengubah, dan juga memeriksa isi dari map.

### Implementasi Map
1. **HashMap**, merupakan implementasi dari Map yang menggunakan algoritma struktur data hashtable.
  ```java
public static void main (String(] args) {
  Map<String, Integer> bulan = new HashMap<>();
  bulan.put ("Januari", 1); //key: januari
  bulan.put ("Februari", 2);
  bulan.put ("Agustus", 8) ; //data 8 dengan key agustus
  System.out.println (bulan); //{Agustus=8, Januari=1, Februari=2}
}
```
2. **WeakHashMap**, masih menggunakan hash table, namun bedanya pada bagian Weakhashmap key dapat dihilangkan jika sudah tidak digunakan.
 ```java
 public static void main (String (] args) {
   Map<String, Integer> bulan = new WeakHashMap<>();
   bulan.put ("Januari", 1);
   bulan.put ("Februari", 2);
   bulan.put ("Agustus", 8) ;
   System.gc (); //akan menyebabkan beberapa key yang tidak digunakan lagi datanya maka akan hilang dari map
   System.out.println (bulan); //{Agustus=3, Januari=1, Februari=2}
}
 ```
3. **IdentityHashMap**, masih menerapkan hash table tapi jika key memiliki referensi dari memory berbeda maka dianggap sebagai data yang berbeda.
```java
public static void main (String (] args) (
  Map<String, Integer> bulan = new IdentityHashMap<>();
  var key = "Januari.Awal";
  var awal = "Awal";
  var key2 = "Januari"+"."+awal;
  bulan.put (key, 1);
  bulan.put (key2, 1);
  bulan.put ("Agustus", 8);               
  System.out.println (bulan.size()); //3
}
```
4. **LinkedHashMap**, di sini tidak ada perbedaan yang signifikan pada hashmap biasa, tetapi secara internal, linkedhashmap menerapkan dubly linkedlist dan juga hashtable sebagai struktur data dalam mapnya.
```java
public static void main (String(] args)
  Map<String, Integer> bulan new LinkedHashMap<> () ;
  bulan.put ("Januari", 1);
  bulan.put ("Februari", 2);
  bulan.put ("Agustus", 8) ;
  System.out.println (bulan); //{Januari=1, Februari=2, Agustus=8}
}
```
5. **ImmutableMap**, Map dalam bentuk ini tidak dapat diubah isinya, baik ditambah atau mengubah data yang sudah ada.
```java
public static void main (String[] args) {
   Map<String, Integer> bulan = Map.of(
           "Januari", 1,
           "Februari", 2,
           "Maret", 3
   ) ;
   System.out.println(bulan); //{Maret=3, Januari=1, Februari=2}
}
```

### Sorted Map
Sorted Map artinya map yang dapat diurutkan, baik secara ascending maupun descending. Pada dasarnya Method yang dapat digunakan untuk mengurutkan key yang ada map tersebut, selain itu method lainnya digunakan untuk mendapatkan key berdasarkan urutan yang diinginkan, bisa yang pertama/terakhir.
```java
public static void main (String(] args) {
   SortedMap<String, Integer> bulan = new TreeMap<> () ; //treemap=isi variabel
   bulap.put ("Januari", 1); //menambahkan data dengan put
   bulan.put ("Februari", 2);
   bulan.put ("Agustus", 8) ;
   System.out.println (bulan); //{Agustus=8, Februari=2, Januari=1} 
//data berurutan berdasarkan abjad dari key-nya.
}
```
**With Comparator**

Jika menggunakan data yang kompleks sebagai key, kemudian menggunakan comparator yang kompleks juga untuk membandingkan mana key yang memiliki urutan terlebih dahulu.
```java
public static void main (String[] args)
  SortedMap<Person, Integer> persons = new TreeMap<> (new Comparator<Person> () {
      @Override
      public int compare (Person ol, Person o2){
          return o2.getName ().compareTo (ol.getName () ):
			}
		});
		  persons.put (new Person ("Moryku"), l);
		  persons.put (new Person ("Alterra"), 2);
		  persons.put (new Person ("Academy"), 8);
		  for (var key: persons.entrySet ()) {
      System.out.println (key.getKey () .getName ()); //masing2 key ditampilkan berdasarkan abjad
	}
}
/*output
Academy
Alterra
Moryku*/ 
```
***Navigable Map***

Masih termasuk sorted map, tetapi dengan method-method yang menavigasi lebih lengkap mulai dari key yang paling rendah-tinggi, awal-akhir. Untuk menggunakan Navigable Map tipe data sortedmap diubah menjadi NavigableMap, tpi isi datanya teteap menggunakan TreeMap.
```java
public static void main (String (] args) {
   NavigableMap<String, Integer> bulan = new TreeMap<> ();
	  bulan.put ("Januari", 1):
	  bulan.put ("Februari", 2);
	  bulan.put ("Agustus", 8);
	System.out.println (bulan.lowerKey ("Februari"));
}
//Agustus
//Menampilkan Agustus karena data agustus lebih rendah dari februari
```
