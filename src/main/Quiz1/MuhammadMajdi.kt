/*
1. Menurut website "https://www.sekawanmedia.co.id/blog/metode-software-development/" penting  untuk mencari
kesalahan seperti bug, error ataupun permasalahan lain yang dapat muncul dari software tersebut.
Sedangkan menurut pendapat saya lebih agak spesifik dan dijabarkan, tahapan pengujian (testing) ini wajib dilakukan
dan kepentingannya tergantung oleh skala pula, semakin besar skala nya semakin besar tahapan pengujian tersebut,
jika sudah menyangkut dengan perusahan yang besar dan mencakup skala yang besar pula maka saya katakan tahapan ini
wajib dilakukan untuk menemukan banyak kesalahan sebelum digunakan oleh orang banyak dan apalagi yang dapat menimbulkan
kerugikan  pada pihak lain dan pengujian ini lebih spesifiknya dilakukan oleh QA.
2.	Perbedaan unit test dan integration test terdapat pada tempat serta bagian pengujiannya maka, menurut pendapat saya terkait pernyataan diatas, untuk unit test jika tidak dilakukan
maka ketika publishing akan terdapat error maupun bug atau kesalahan, boros biaya, developer kurang paham code dibanding yang melakukan testing. Pada integration test agak sama namun
kesalahannya yaitu akan banyak error di bagian service-service pada luar sistem aplikasi kita misalnya yang bekerjasama dengan REST api atau service thrift (service third party),
kedua hal tersebut bila tidak dilakukan maka mungkin akan mengakibatkan ketidakakuratan aplikasi.
Sumber: https://www.testim.io/blog/unit-test-vs-integration-test/
3.	Pendapat saya mengenai QA Engineer yaitu berdasarkan sumber yang saya baca seorang Quality Assurance merupakan orang yang bertanggung jawab untuk memastikan software atau
aplikasi yang diciptakan oleh sebuah perusahaan dapat bekerja dengan baik. Selain itu, seorang Quality Assurance juga bekerja untuk menjabarkan bagian mana dari sebuah
software yang perlu diperbaiki. QA juga dapat membantu dalam meminimalisir terjadinya pengerjaan ulang, memotivasi anggota tim, meningkatkan kepercayaan konsumen, dan lain-lain.
Sumber: https://glints.com/id/lowongan/apa-itu-quality-assurance/#.YmZNwU7P1PY
4.  Menurut https://testfort.com/blog/business-logic-in-qa-and-its-role-in-the-development-of-perfect-software,
therefore, business logic is the perfect means that helps QAs in achieving the main purpose of every testing strategy:
make sure that an app does what it is designed and supposed to do. A step counter might have the cutest interface,
but it is not useful if it doesn’t display a user walking activity or makes it not right.
Integrating business logic deeply into the testing process allows testing teams to prevent such unpleasant issues.
Menurut https://www.testim.io/blog/ui-testing-beginners-guide/, there are many reasons why UI testing is important.
First of all, if your app has a faulty UI, your users won’t be able to perform the tasks they need. More often than not,
the UI is the only way users can interact with the application. They can’t interact directly with the application’s
internals and get what they want. So, a malfunctioning UI is an insurmountable obstacle for your users.
Menurut penulis berdasarkan sumber yang telah dibaca, tes-tes tersebut berguna agar software dapat berjalan
dengan baik dan user dapat menggunakannya tanpa merasakan kebingungan.
5.  untuk menjawab apakah kita masih memerlukan testing secara manual setelah adanya testing secara otomatisasi kita
perlu tahu apa saja kelebihan dari masing-masing test, disini saya membaca website
"https://www.perfecto.io/blog/automated-testing-vs-manual-testing-vs-continuous-testing" untuk mengetahui apa kekurangan
dan kelebihan dari masing-masing test,
menurut pendapat saya setelah melihat beberapa dari kekurangan dan kelebihan dari masing-masing test kapan kita
memerlukan test otomatisasi ? kapan kita menggunakan manual ? apakah manual test perlu ? kelebihan dari otomatisasi
sendiri yaitu cepat, efisien, mudah sedangkan manual mempunyai kelebihan tertentu dalam keadaan tertentu yaitu saat
menangani test yang rumit dan memerlukan perasaan seperti test UX kita pasti memerlukan perasaan/pendapat dari diri
kita sendiri karena ini menyangkut rasa kenyamanan pengguna bukan robot.
 */