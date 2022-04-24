/*
1. Dewasa ini, pembuatan testing pada perangkat lunak umum dilakukan pada saat tahap implementasi yang dilakukan oleh software
   engineer. Berikan opini kalian apakah software engineer pada tahap implementasi wajib melakukan test atau tidak?
   Jawab:
    Menurut saya, sangat penting bagi software engineer dalam tahap implementasi untuk melakukan test. Karena jika tidak melakukan pengujian perangkat lunak,
    produk yang dihasilkan tidak akan berfungsi dengan baik. Ini dapat menyebabkan kerugian finansial yang besar.
    Berdasarkan Survei yang dilakukan oleh Institut Nasional Standar dan Teknologi (NIST)
    Pada tahun 2002, dilaporkan bahwa kesalahan perangkat lunak menyebabkan kerugian ekonomi tahunan sebesar $59,5 miliar di Amerika Serikat.
    Sepertiga dari kerugian ini dapat dihindari jika pengujian perangkat lunak yang lebih baik telah dilakukan.
    Tujuan utama dari pengujian perangkat lunak sebenarnya sederhana yaitu untuk memastikan bahwa software yang dihasilkan sesuai dengan kebutuhan
    (requirement) yang sebelumnya ditentukan. Ketika requirement dari suatu sistem telah disusun maka semestinya sudah ada suatu pengujian perencanaan
    (test plan). Selain itu suatu proses testing membutuhkan tujuan akhir yang dapat dinilai sehingga pihak tester bisa berhenti melakukan suatu
    testing ketika tujuan-tujuan itu tercapai.
    referensi: https://se.ittelkom-pwt.ac.id/2017/10/25/pentingnya-melakukan-pengujian-perangkat-lunak-software-testing/

2. Unit test dan integration test merupakan test yang dilakukan pada tahap implementasi. berikan pendapat kalian jika dua test
   ini tidak dilakukan beserta dampak yang akan terjadi pada perangkat lunak
   Jawab:
    Unit Testing: Tes unit adalah bagian terkecil dari aplikasi yang dapat uji. Tujuannya adalah untuk memberikan kode yang harus memenuhi persyaratan.
    Integration Testing : Pengujian integrasi: Dalam pengujian integrasi, kode dibagi menjadi beberapa bagian dan diuji sebagai grup. Tugas utama pengujian
    integrasi adalah menganalisis parameter seperti persyaratan fungsional, kinerja, dan keandalan yang ditempatkan pada elemen desain utama.
    Jadi jika tidak kita lakukan hal tersebut, seperti pendapat saya sebelumnya, maka kemungkinan produk yang dihasilkan tidak akan berfungsi dengan baik.
    referensi: https://socs.binus.ac.id/2020/06/30/software-testing/

3. Berikan pendapat kalian tentang pekerjaan QA Engineer sedangkan disisi lain Software Engineer telah melakukan testing
   Jawab:
    Penguji Perangkat Lunak  mengeksplorasi  cara untuk memeriksa cara kerja aplikasi dan menemukan kemungkinan cacat. Berbagai metode dan
    metodologi pengujian digunakan oleh penguji untuk menguji produk, menemukan bug, dan memeriksa apakah telah diperbaiki. Pengujian memungkinkan
    pelanggan dengan kemungkinan untuk melihat apakah produk yang dikembangkan memenuhi harapan mereka pada desain, kompatibilitas, fungsi, dll.
    Fokus utama Penguji adalah menguji aplikasi dan menemukan semua kemungkinan bug yang dapat merusak aplikasi.
    Sementara di sisi lain, Insinyur QA  mengikuti serangkaian metode dan aktivitas yang dirancang untuk memastikan bahwa aplikasi perangkat lunak sesuai standar
    atau SRS dan sesuai dengan semua spesifikasi. Ini adalah strategi yang direncanakan dari evaluasi proses pengujian yang ditujukan untuk hasil produk yang berkualitas.
    Insinyur QA mencari cara untuk  mencegah kemungkinan bug dalam proses pengembangan perangkat lunak. Mereka juga menangani hal-hal manajemen seperti metode
    dan teknik pengembangan, analisis proyek, daftar periksa, dll. QA melewati seluruh siklus hidup produk (SDLC) dan memimpin proses pemeliharaan perangkat lunak.
    Fokus utama mereka adalah Kontrol Kualitas dan untuk memastikan persyaratan terpenuhi dengan benar.
    referensi:  https://fintelics.medium.com/software-developer-vs-qa-engineer-tester-aeeea11a59ce
                https://www.edureka.co/community/56196/difference-software-engineer-quality-assurance-engineers

4. Terdapat banyak test pada perangkat lunak, mulai dari test business logic, UI, UX, Performa, sampai keamanan. Namun tidak
   semuanya dapat dilakukan karena keterbatasan waktu dan mahalnya biaya yang harus dikeluarkan. Berikan pendapat kalian dampak
   apa yang terjadi jika pengujian diatas tidak diberikan pada perangkat lunak
   Jawab:
    Pengujian perangkat lunak adalah proses mengevaluasi dan memverifikasi bahwa produk perangkat lunak atau aplikasi melakukan apa yang seharusnya
    dilakukan. Manfaat pengujian termasuk mencegah bug, mengurangi biaya pengembangan, dan meningkatkan kinerja.
    berdasarkan pendapat dari berbagai sumber, test business logic ini sangat penting karena memungkinkan penguji untuk memperbaiki semua ketidakakuratan di awal proses pengujian QA
    ketika kesalahpahaman logis hanya ada di atas kertas. Akhirnya, ini akan menghemat waktu pengembang, membuat proses pengembangan lebih efisien dan cepat.
    Disisi lain, UI / UX memainkan peran integral dalam membantu aplikasi agar menonjol. Oleh karena itu, memiliki UI yang terintegrasi dan harmonis atau
    UX dalam aplikasi seluler tidak hanya membantu bisnis untuk menarik lebih banyak pengguna tetapi juga meningkatkan kepuasan pelanggan.
    referensi:  https://www.ibm.com/topics/software-testing#:~:text=Software%20testing%20is%20the%20process,development%20costs%20and%20improving%20performance.
                https://testfort.com/blog/business-logic-in-qa-and-its-role-in-the-development-of-perfect-software#:~:text=Business%20Logic%20and%20Testing%20Documentation&text=This%20step%20is%20crucial%20because,process%20more%20efficient%20and%20fast.

5. Berikan pendapat kalian tentang testing perangkat lunak secara manual? Apakah di saat banyaknya testing secara otomatisasi dilakukan testing secara
   manual perlu dilakukan?
   Jawab:
    Tentunya perlu karena ada beberapa perbedaan utama antara pengujian otomatis dan pengujian manual. Dalam pengujian manual, manusia melakukan pengujian langkah
    demi langkah, tanpa skrip pengujian. Dalam pengujian otomatis, pengujian dijalankan secara otomatis melalui kerangka kerja otomatisasi pengujian,
    bersama dengan alat dan perangkat lunak lainnya.
    Meskipun pengujian manual tidak selalu seakurat otomatisasi, proses manual memungkinkan penguji memiliki lebih banyak fleksibilitas dalam operasinya.
    referensi: https://www.perfecto.io/blog/automated-testing-vs-manual-testing-vs-continuous-testing
 */