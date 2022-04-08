# (24) Understanding JMeter Results
## RESUME
1. Membuat Test Plan
2. Throughput
3. Hal-hal yang diperlukan dalam melakukan laporan testing performa
### Membuat Test Plan

1. HTTP Request Defaults : [https://reqres.in/](https://reqres.in/)
2. Get List Users : /api/users/3
3. Post User : /api/users
Body Data :
{
"name": "${nama}",
"job": "Student ALTA"
}
4. CSV Name File, click here (uploaded through Zoom chatbox)
5. Response Assertion :
Select Radio Button Response code
Fill Pattern to test with 201
6. Before run your test, please save the test plan and save all listener with different name in desktop/This-is-your-report.jmx

### Throughput

Throughput = (number of requests) / (total time) * conversion
Where:
number of requests = number of executed requests
total time = (lastSampleStartTime + lastSampleLoadTime - firstSampleStartTime)
conversion : the unit of conversion value, example 1000 will convert the value to the second, 1000*60 will
convert the value to the minute, etc.

### Hal-hal yang diperlukan dalam melakukan laporan testing performa:

1. Pembahasan Data Yang Sudah Dimiliki
a. Summary tentang sistem
b. Kondisi awal sistem
c. Target yang ingin dicapai
2. Data Performance Test Yang didapatkan
a. Masukkan data dari metrics yang didapatkan
3. Interpretasi Data Performance Test
a. Interpretasi hasil dari metricsnya
4. Saran
a. Berikan saran agar sistem lebih baik lagi setelah dites


## TASK
*HTTP REQUEST*
![image](https://user-images.githubusercontent.com/75010847/162148235-b4841bd8-2632-4e8a-86b4-e90b739abedc.png)
- CONTACTS

![image](https://user-images.githubusercontent.com/75010847/162154428-67b3b668-ca9f-446b-87b5-23b7bddb9c98.png)


![image](https://user-images.githubusercontent.com/75010847/162153940-40bd974a-c044-4f1e-b57c-d6951ecc469a.png)

output:

![image](https://user-images.githubusercontent.com/75010847/162153533-c98e9e0a-7de7-40c1-9bbf-4b4ec1f58a62.png)


- PRODUCTS
![image](https://user-images.githubusercontent.com/75010847/162150013-79914eb6-4016-4b11-a2ec-ee597daa9c26.png)

output:

![image](https://user-images.githubusercontent.com/75010847/162153580-13f26881-3478-45f0-b6e8-e782dbdd78c7.png)


- FOODS
![image](https://user-images.githubusercontent.com/75010847/162152993-c669da3b-60ad-4a5c-b5f1-2ce2810b9908.png)

output:

![image](https://user-images.githubusercontent.com/75010847/162153646-407a3909-fcc9-492b-952a-92de5f1aae85.png)

![image](https://user-images.githubusercontent.com/75010847/162153672-71835fbf-fa9e-4687-bead-3ac0a746d86b.png)

![image](https://user-images.githubusercontent.com/75010847/162153708-7f5a077e-4db6-4978-b124-f9ad9308db0a.png)



