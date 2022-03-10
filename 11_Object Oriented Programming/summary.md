# (11) Object Oriented Programming
## Resume
1. Class
2. Object
3. Inheritance

## Class
Class adalah blueprint, prototype atau cetakan untuk membuat Object. Class berisikan deklarasi semua properties dan functions yang dimiliki oleh Object. Setiap Object dibuat dari Class. Dan sebuah Class bisa membuat Object sebanyak-banyaknya.

## Object
Object adalah data yang berisi field / properties / attributes dan method / function / behavior. Terdapat 3 tahapan dalam object:
1. Declaration : mendeklarasikan nama sebuah objek
2. Instantiation : memerlukan sebuah perintah new untuk menciptakan objek
3. Initialization : inisialisasi dari sebuah objek setelah perintah new
java
  Motor objectMotor = new Motor();

Motor merupakan Inisialisasi Nama Object, objectMotor merupakan Deklarasi Nama Object, new Motor(); merupakan Instantiation Object

Yang termasuk ke dalam Object pada OOP, yaitu Variabel dan Access Modifier.
Access Modifier sendiri terdiri dari:
- Public : Class, Package, Subclass, global
- Default : Class, Package
- Private : Class  
- Protected : Class, Package, Subclass

## Inheritance
Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain. Dalam artian, kita bisa membuat class Parent dan class Child. Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child.

Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh class Child
Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya