# (17) Behaviour Driven Development
## Resume
1. Apa itu BDD?
2. Apa itu Cucumber?
3. Gherkin BDD Language

### Apa itu BDD?

TDD (Test Driven Development) merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan codenya. Proses TDD berfocus pada komponen komponen dalam sistem, dan test case ditulis dalam bahasa pemrograman. BDD Juga menerapkan konsep test first namun dengan focus yang berbeda, dalam BDD test tim development akan menuliskan berbegai scenario yang menjelaskan behaviour sistem dari perspektif pengguna. Scenario dituliskan menggunakan format bahasa yang mudah dipahami oleh seluruh stakeholder. BDD memiliki tujuan utama untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder, tim bisnis maupun technical yang terlibat dalam pengembangan sistem.

BDD Format, terdapat 3 tahapan untuk melakukan test dalam BDD:

1. Menentukan User Story, untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan.
2. Menuliskan scenario
3. Implementasi test scripts dalam setiap file berdasarkan skenario.

### Apa itu Cucumber?

Cucumber adalah sebuah tools yang mendukung BDD. Cucumber membaca semacam ketentuan yang dapat dieksekusi dimana ditulis menggunakan text biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang dituliskan dalam ketentuan tersebut, ketentuan tersebut terdiri dari beberapa skenario.

### Gherkin BDD Language

**Meta**: Search feature for users
This feature is very important because it will allow users to
filter products
**Narrative**:
As a user
I want to searches, without spelling mistake, for a product
name present in inventory
So all the products with similar name should be displayed
**Scenario**: Search laptop
Given User is on the main page of [www.myshopingsite.com](http://www.myshopingsite.com/)
When User searches for laptops
Then search page should be updated with the lists of laptops
