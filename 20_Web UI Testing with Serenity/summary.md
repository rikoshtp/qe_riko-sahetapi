# Web UI Testing with Serenity
## Resume
1. Pengenalan Web Testing
2. Architecture Serenity BDD
3. BDD Framework with Jbehave

### Pengenalan Web Testing

Web automation testing adalah suatu cara yang digunakan untuk melakukan testing web yang akan dibuat, cara kerjanya seperti layaknya manusia yang melakukan kegiatan di suatu website. Contoh agar dapat menggunakan Twitter maka harus melakukan registrasi terlebih dahulu, di sini tugas QA memastikan apakah yang dikerjakan software engineer sudah benar dan tidak ada miss dalam berbagai hal tersebut. Web automation testing dikerjakan terpisah dengan unit test. 

Terdapat beberapa tools yang digunakan dalam UI Testing,

1. Katalon ([katalon.com](http://katalon.com/)) bisa digunakan dalam pengetesan mobile app maupun desktop. Testing tools ini dapat merekam langkah, menangkap elemen web pada web aplikasi, memainkan test case yang sudah ada dan reportnya.
Katalon bisa digunakan untuk pemula maupun yang ahli dalam QA. Jika terdapat error ketika melakukan play sesuai record yang dibuat maka dapat menambah script untuk pengecekan lebih lanjut.
2. Cypress ([cypress.io](http://cypress.io/)) adalah free test tools dimana bisa dirun pada CI dan dapat digunakan pada operation system pada Mac, Linux, Windows. Saat ini Cypress hanya dapat mengerjakan testing pada website saja, jadi belum dapat melakukan pengerjaan pada native mobile app. Testing tool ini support menggunakan bahasa apapun seperti Ruby, Javascript, C#, PHP, dll.
3. Robot framework ([robotframework.org](http://robotframework.org/)), menggunakan bahasa python. Merupakan salah satu framework dari Selenium dapat dicombine menggunakan custom function menggunakan bahasa Python. Merupakan Open Source tools yang digunakan untuk Web, API, dan mobile.
4. Test Project ([testproject.io](http://testproject.io/)), merupakan tools end-to-end testing yang kepopularitasnya bisa disejajarkan dengan Katalon.
5. Serenity BDD ([serenity-bdd.info](http://serenity-bdd.info/)) merupakan library open source yang membantu tester dalam menulis automation acceptence test yang terstruktur dan lebih terawat dengan baik yang menghasilkan laporan pengujian yang kaya makna (leaving documentation) yang tidak hanya melaporkan hasil pengujian tapi fitur apa yang telah diuji.

### Architecture Serenity BDD

![image](https://user-images.githubusercontent.com/75010847/160375500-d48a4622-2097-4805-9425-fc0c64941803.png)

• Serenity adalah Kerangka BDD open source yang membantu membuat tes penerimaan otomatis yang terstruktur dengan baik dan dapat dipelihara.
• Arsitektur Serenity terdiri dari Persyaratan, Pengujian, Langkah, Halaman, dan Laporan.

Define Requirements
• Saat menggunakan Serenity, Anda mulai dengan persyaratan yang perlu Anda terapkan.
• Ini sering dinyatakan sebagai "cerita" pengguna dengan kriteria penerimaan yang membantu memperjelas persyaratan.
• "Cerita" inilah yang diotomatiskan Serenity.
Search by keyword
In order for buyers to find what they are looking for more efficiently As a seller I want buyers to be able to search for articles by keywords

Automate Acceptance Criteria
• Next, describe the acceptance criteria in high-level business terms.
• Record these acceptance criteria using either a BDD tool such as Cucumber with the form "feature", so that Serenity can run them.
Feature: Search by keyword
In order for buyers to find what they are looking
As a seller
I want buyers to be able search articles by keywords
Scenario: Search for articles by keyword
Given I want to buy a wool scarf
When I search for wool'
Then I should see only articles related to wool
Scenario: Search by shop name
Given I want to see articles from a particular shop
When I search by shop 'docksmith'
Then I should find 1 shop call 'docksmith

Implement the Test
• Implement the acceptance criteria into a code, so that they can run against the actual application.
• Under the hood, tests are broken down into nested steps for better readability and easier maintenance

Report on Test Result
Serenity memberikan laporan rinci tentang hasil tes dan eksekusi, termasuk Narasi untuk setiap tes Tangkapan layar untuk setiap langkah dalam tes- Hasil tes termasuk waktu eksekusi dan pesan kesalahan jika tes gagal

### BDD Framework with Jbehave

Frame Ada 5 langkah untuk implementasi Jbehave untuk automation.

1. Write Story
Tulis menggunakan Gherkin Syntax (Given(Initial condition), When (aksi yang akan dilakukan, Then(untuk validasi)) ditulis dalam plain text untuk mempermudah dalam mereview story
2. Configure Stories
Configure stories and steps. Pada tahap ini QA akan menentukan story mana yang akan dijalankan dan juga format output yang digunakan jika hanya menggunakan Jbehave.
3. Browser Interaction
Map Steps to browser manipulation
4. Run Stories
IntellijIDEA, maven
5. View Reports
Make a report using Serenium
