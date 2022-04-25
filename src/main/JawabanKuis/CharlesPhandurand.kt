/*
    # Kuis-RPL-Software-Testing

    # Kuis 1 (90)
    1. Dewasa ini, pembuatan testing pada perangkat lunak umum dilakukan pada saat tahap implementasi yang dilakukan oleh software
    engineer. Berikan opini kalian apakah software engineer pada tahap implementasi wajib melakukan test atau tidak?

    Jawab:
    Menurut sumber website https://campus.quipper.com/careers/insinyur-perangkat-lunak-software-engineering software engineer pada tahap
    implementasi wajib melakukan test, karena  seorang software engineer bertanggung jawab penuh pada keseluruhan proyek dan harus menguasai
    Software Development Life Cycle (SDLC) dimana dalam SDLC tersebut terdapat testing dalam mengembangkan software, sehingga menghasilkan output
    dengan sistem yang berkualitas tinggi sesuai ekspektasi. Selanjutnya, menurut sumber website https://socs.binus.ac.id/2020/06/30/software-testing/
    menjelaskan bahwa dengan adanya software testing, software engineer mampu mengenali error atau kecacatan yang ada dari suatu software.
    Sedangkan, menurut pendapat saya setelah penyimpulan dari dua sumber sebelumnya, pengujian atau testing ini wajib dilakukan dengan berdasarkan
    besar kecilnya projek yang kita kerjakan. Apabila projek yang kita kerjakan berskala kecil, maka software engineer pada tahap implementasi wajib
    melakukan test, sedangkan apabila projek berskala besar, testing ini sangat wajib dilakukan oleh Quality Assurance Engineer, karena projek yang
    besar tersebut tentu akan sering dijumpai banyak bug, sehinggga apabila tidak diuji secara seksama akan menyebabkan kerugian.

    2. Unit test dan integration test merupakan test yang dilakukan pada tahap implementasi. berikan pendapat kalian jika dua test
    ini tidak dilakukan beserta dampak yang akan terjadi pada perangkat lunak

    Jawab:
    Menurut sumber yang dipaparkan pada website https://glints.com/id/lowongan/unit-testing-adalah/#.YmLDck5BzIV dan
    https://glints.com/id/lowongan/system-integration-testing-sit-adalah/#.YmC7Y05BzIU, jika unit test dan integration test tidak dilakukan maka
    kita tidak dapat memastikan apakah setiap unit kode yang terdapat pada software bisa berjalan normal atau tidak, serta tidak dapat memastikan
    apakah semua komponen yang berinteraksi dapat berjalan dengan baik atau tidak. Kesimpulan saya berdasarkan kedua sumber tersebut jika dua test
    ini tidak dilakukan, pertama dari segi unit test sistem yang kita bangun akan memiliki banyak bug yang tidak diketahui, belum siapnya program,
    dan paling parahnya program menjadi gagal, serta memperburuk biaya dan membuang waktu, karena pengembang tidak memahami baris kode. Sedangkan,
    apabila integration test tidak dilakukan, maka akan terdapat bug dari segi service di luar aplikasi, seperti API. Sehingga jika dua test ini tidak
    dilakukan dampak yang akan terjadi pada perangkat lunak adalah keambiguannya suatu aplikasi.

    3. Berikan pendapat kalian tentang pekerjaan QA Engineer sedangkan disisi lain Software Engineer telah melakukan testing

    Jawab:
    Menurut pendapat saya, pekerjaan QA Engineer (Quality Assurance Engineer) tetap terlibat sejak awal pembuatan software hingga aplikasi akhirnya
    dirilis, seperti yang disebutkan pada sumber website https://glints.com/id/lowongan/qa-quality-assurance-engineer/#.YmDF5k5BzIU. Untuk proses
    testing yang dilakukan oleh Software Engineer, QA Engineer dapat membantu dan memantau setiap fase pengetesan suatu software, serta memastikan
    kalau suatu software sudah sesuai dengan standar. Sehingga, dapat disimpulkan berdasarkan sumber
    https://www.ekrut.com/media/8-skill-ini-kamu-butuhkan-untuk-menjadi-qa-engineer-handal bahwa pekerjaan QA Engineer tetap melakukan testing
    bersama dengan Software Engineer, serta melakukan pemantauan lainnya, seperti menyampaikan laporan masalah dari hasil pengetesan suatu software
    dan hal lainnya yang merupakan cakupan dari pekerjaan QA Engineer itu sendiri.

    4. Terdapat banyak test pada perangkat lunak, mulai dari test business logic, UI, UX, Performa, sampai keamanan. Namun tidak
    semuanya dapat dilakukan karena keterbatasan waktu dan mahalnya biaya yang harus dikeluarkan. Berikan pendapat kalian dampak
    apa yang terjadi jika pengujian diatas tidak diberikan pada perangkat lunak

    Jawab:
    Menurut sumber website https://testfort.com/blog/business-logic-in-qa-and-its-role-in-the-development-of-perfect-software yang menjelaskan
    pentingnya business logic dalam pengembangan software, seperti kalkulasi data yang logikal dalam suatu aplikasi untuk mendapatkan hasil yang akurat,
    serta mengatur komunikasi antara end-user dengan database. Lalu, menurut sumber website https://www.guru99.com/usability-testing-tutorial.html yang
    menjelaskan pentingnya pengujian UI/UX untuk menyajikan antarmuka yang interaktif dan fungsional yang baik bagi pengalaman user agar sesuai
    ekspektasi ketika pemakaiannya. Jadi, menurut saya dampak yang akan terjadi jika pengujian-pengujian yang disebutkan pada soal tidak diberikan
    pada perangkat lunak, maka dari segi business logic-nya akan menyebabkan kesalahan data, sehingga menyebabkan rusaknya reputasi pada suatu aplikasi
    dan kerugian bagi seluruh pihak yang terlibat. Dari segi UI/UX, antarmuka akan berkemungkinana tidak berjalan semestinya dan tidak ada feedback yang
    didapatkan dari pengalaman user. Terakhir untuk segi performa dan keamanannya, tentu kita tidak tahu bagaimana performa sistem ketika melayani
    banyak client dan akan mudah dibobol oleh pihak tidak bertanggung jawab dibandingkan dengan aplikasi yang sudah teruji, sehingga meminimalisir
    masalah yang tidak diinginkan.

    5. Berikan pendapat kalian tentang testing perangkat lunak secara manual? Apakah di saat banyaknya testing secara otomatisasi dilakukan testing secara
    manual perlu dilakukan?

    Jawab:
    Menurut sumber website https://medium.com/skyshidigital/perbedaan-manual-testing-dan-automated-testing-9d13373a36e yang membahas mengenai
    perbedaan pengujian manual dengan pengujian otomatis dari segi kekurangan maupun kelebihan keduanya. Dapat saya disimpulkan, testing perangkat
    lunak secara manual tentu akan memakan banyak waktu, karena penguji perlu melakukan pengecekan secara manual tanpa menggunakan bantuan tools/scripts
    untuk memastikan jika aplikasi yang di uji bebas dari bug dan aplikasi perangkat lunak dapat bekerja sesuai apa yang diharapkan. Namun, manual
    testing menggunakan biaya yang murah, karena tidak menggunakan tools/software yang mahal. Sedangkan, pada testing perangkat lunak secara otomatisasi
    dapat menemukan bug lebih banyak dari manual testing, karena menggunakan script, lebih cepat, dan efisien. Namun, kekurangannya lebih mahal,
    kurangnya human element, dan tidak adanya feedback mengenai UI. Jadi, di saat banyaknya testing secara otomatisasi dilakukan, testing secara
    manual perlu dilakukan, karena manual testing dapat mengetahui feedback UI/UX dari orang secara langsung yang tidak bisa dilakukan menggunakan
    tools, karena melibatkan perasaan manusia.
*/