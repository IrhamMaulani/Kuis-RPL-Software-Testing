/*
No. 1, Menurut website "https://www.sekawanmedia.co.id/blog/metode-software-development/" penting  untuk mencari
kesalahan seperti bug, error ataupun permasalahan lain yang dapat muncul dari software tersebut.
Sedangkan menurut pendapat saya lebih agak spesifik dan dijabarkan, tahapan pengujian (testing) ini wajib dilakukan
dan kepentingannya tergantung oleh skala pula, semakin besar skala nya semakin besar tahapan pengujian tersebut,
jika sudah menyangkut dengan perusahan yang besar dan mencakup skala yang besar pula maka saya katakan tahapan ini
wajib dilakukan untuk menemukan banyak kesalahan sebelum digunakan oleh orang banyak dan apalagi yang dapat menimbulkan
kerugikan  pada pihak lain dan pengujian ini lebih spesifiknya dilakukan oleh QA.
No. 2, Menurut website "https://www.testim.io/blog/unit-test-vs-integration-test/" perbedaan unit test
dan integration test ada pada tempat dan bagian pengujiannya maka,
dari pendapat saya terkait referensi diatas, untuk unit test jika tidak dilakukan maka saat publishing akan
banyak bug atau kesalahan yang lebih spesifiknya dibagian codebase yang berjalan di internal aplikasi, boros biaya,
developer kurang memahami code dibanding yang melakukan testing. Untuk integration test agak sama tetapi kesalahannya
yaitu akan banyak kesalahan di bagian service-service di luar sistem aplikasi kita misalnya yang berhubungan dengan
REST API atau service thrift (service third party), kedua hal tersebut jika tidak dilakukan maka mungkin akan membuat
ketidakakuratan aplikasi.
No. 3, Dari website "https://glints.com/id/lowongan/apa-itu-quality-assurance/" yang menjabarkan mengenai pekerjaan
QA dan dari hal tersebut saya dapat dapat mengambil kesimpulan dan serta pendapat bahwa tugas dari QA tidak hanya
berfokuskan atau melakukan testing pada produk tersebut QA juga dapat melakukan hal lain seperti memastikan bahwa produk
sudah dapat bekerja dengan baik dan memaparkan masalah apa saja yang perlu diperbaiki, QA juga dapat berfokus kepada
quality and needs, meningkatkan efisiensi, membantu motivasi semua anggota agar dapat bekerja lebih baik, dll.
No. 4,  Pada website "https://testfort.com/blog/business-logic-in-qa-and-its-role-in-the-development-of-perfect-software"
menjelaskan peran pentingnya business logic pada software yaitu menentukan bagaimana data dapat ditampilkan, disimpan,
dibuat, dan diubah. menyediakan sistem untuk memandu bagaimana objek bisnis bekerja satu sama lain.
sedangkan untuk UI dan UX test yang saya baca dari website "https://www.toptal.com/designers/ux/user-testing-methods" ,
Pengujian UI berfokus pada pengujian antarmuka pengguna situs web untuk memastikan semuanya berfungsi sebagaimana
mestinya dan pengguna memahami cara menggunakan UI dan untuk UX test berfokus pada keseluruhan pengalaman pengguna dan
bagaimana produk atau situs web membuat pengguna merasa.
jadi untuk pendapat saya setelah membaca beberapa website tersebut dapat saya bayangkan dampak apa saja yang diberikan
jika tidak mengimplementasikan test-test tersebut seperti :
untuk test business logic jika tidak dilakukan maka software dapat pemanduan objeck bisnis tidak terpadu secara pasti,
dan fungsi dari penampilan, menyimpanan, pembuatan, dan perubahan mungkin tidak berjalan semestinya,
untuk UI dan UX, antarmuka pada software akan tidak pasti berjalan semestinya juga dan kita tidak tahu bagaimana
pengalaman dan rasa pengguna terhadap software yang dibuat.
untuk performa dan keamanan dapat saya bayangkan jika tidak dilakukan maka keefisienan software yang digunakan akan
kurang dan keamanan software apalagi jika software menyangkut data pribadi ditakutkan akan di exploit karena bagi saya
keamanan harus sering di uji dan kasarnya di bobol diri sendiri agar kita tahu agar bagaimana kita membuat sistem
keamanan yang lebih kuat dan jika dibiarkan tidak diuji maka sistem keamanan pada software tersebut akan lemah
begitu saja dan tidak terupdate.
No. 5,  untuk menjawab apakah kita masih memerlukan testing secara manual setelah adanya testing secara otomatisasi kita
perlu tahu apa saja kelebihan dari masing-masing test, disini saya membaca website
"https://www.perfecto.io/blog/automated-testing-vs-manual-testing-vs-continuous-testing" untuk mengetahui apa kekurangan
dan kelebihan dari masing-masing test,
menurut pendapat saya setelah melihat beberapa dari kekurangan dan kelebihan dari masing-masing test kapan kita
memerlukan test otomatisasi ? kapan kita menggunakan manual ? apakah manual test perlu ? kelebihan dari otomatisasi
sendiri yaitu cepat, efisien, mudah sedangkan manual mempunyai kelebihan tertentu dalam keadaan tertentu yaitu saat
menangani test yang rumit dan memerlukan perasaan seperti test UX kita pasti memerlukan perasaan/pendapat dari diri
kita sendiri karena ini menyangkut rasa kenyamanan pengguna bukan robot.
 */