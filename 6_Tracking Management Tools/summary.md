# (6) Tracking Management Tools
## Resume
Dalam materi ini mempelajari:
1. Pengertian JIRA
2. Pembuatan Project pada JIRA
3. Yang harus diperhatikan oleh Quality Engineer pada JIRA

### Pengertian JIRA
Jira dikembangkan oleh Atlassian sebagai alat bantu yang bertujuan untuk pelacakan bugs, pelacakan issue, dan project management. Beberapa fitur unggulan yang dimiliki Jira: adanya fitur test asignment, Scrum dan Kanban boards, Raoadmaps, Konektivitas dengan aplikasi lain, Pelaporan/reporting.

### Pembuatan Project di JIRA
Beberapa langkah dan penjelasan tentang pembuatan project pada JIRA:

1. Membuat project baru dengan click “Create project”
2. Kemudian memilih Scrum
3. Lalu pilih template scrum dengan klik “Use template”
4. Pilih “Team-Managed Project”, kemudian isi nama project dan key, kemudian Create Project.
5. Setelah project dibuat, pada bagian Board pada PLANNING, buat panel yang berfungsi sebagai progress/alur dari suatu pekerjaan maupun project, defaul dari JIRA memberikan 3 panel yaitu: TO DO, IN PROGRESS, FINISH. Namun kita dapat menambahkan FINISH, DELIVER, TESTING, NEED FIX, DONE.

Pengertian tiap PANEL Board
1. **TODO** = Berisi story yang akan dikerjakan dan sudah diprioritaskan saat planning, story yang ditepatkan paling atas menandakan prioritas utama.
2. **IN PROGRESS** = Berisi story yang sedang dikerjakan Software Engineer atau Developer.
3. **FINISH** = Berisi story yang sudah selesai dikerjakan oleh para developer, namun belum siap untuk tahap testing.
4. **DELIVER** = Berisi story yang telah siap memasuki tahap testing oleh Quality Engineer.
5. **TESTING** = Berisi story yang sedang ditesting oleh Quality Engineer.
6. **NEED FIX** = Berisi hasil proses testing yang tidak lolos kriteria oleh team development.
7. **DONE** = Berisi story yang sudah lolos dari kriteria testing oleh team development.

### Yang harus diperhatikan oleh Quality Engineer pada JIRA
Ketika menemukan sebuah bug pada testing, yang pertama harus membuat issue bertipekan bug, kemudian jelaskan kondisi, expected harus seperti apa, dan langkah-langkah untuk melakukan testing tersebut. Kemudian pindahkan story atau issue yang berkaitan dengan bug ke panel atau kolom in progress.
