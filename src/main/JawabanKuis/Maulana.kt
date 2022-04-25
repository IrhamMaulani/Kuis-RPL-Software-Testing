/*
    # Kuis-RPL-Software-Testing

    # Kuis 1 (90)
    1. Dewasa ini, pembuatan testing pada perangkat lunak umum dilakukan pada saat tahap implementasi yang dilakukan oleh software
    engineer. Berikan opini kalian apakah software engineer pada tahap implementasi wajib melakukan test atau tidak?
    Jawab :
    Menurut sumber website https://blog.azuralabs.id/tentang-software-engineer-job-desk-gaji-dan-kualifikasi/
    Software Engineer merupakan salah satu profesi di bidang teknologi informasi yang bertugas melakukan analisa, membuat rekayasa,
    menyusun spesifikasi, mengimplementasikan dan memvalidasi suatu rancangan sistem perangkat lunak untuk menjawab suatu permasalahan.
    Software engineer harus menguasai Software Development Life Cycle (SDLC) sebagai modal dalam mengembangkan perangkat lunak,
    mulai requirement sampai maintenance.
    Menurut sumber website https://www.indiumsoftware.com/blog/why-software-testing/#:~:text=For%20the%20identification%20of%20the,the%20software%20product%20is%20delivered.
    Pengujian perangkat lunak penting karena jika ada bug atau kesalahan dalam perangkat lunak, mereka dapat diidentifikasi lebih awal
    dan diperbaiki sebelum produk perangkat lunak dikirimkan. Produk perangkat lunak yang diuji dengan benar memastikan keandalan, keamanan,
    dan kinerja tinggi, yang mengarah pada penghematan waktu, efektivitas biaya, dan kepuasan pelanggan.
    Menurut pendapat saya dari kedua sumber diatas adalah seorang software engineer harus menguasai Software Development Life Cycle (SDLC)
    yang mana di dalam SDLC tersebut terdapat tahap implementasi yang wajib dilakukan testing agar seorang software engineer dapat mengetahui
    error atau bug lebih awal dan dapat diperbaiki sehingga software yang dikembangkannya memiliki kualitas yang baik dan terjaga.

    2. Unit test dan integration test merupakan test yang dilakukan pada tahap implementasi. berikan pendapat kalian jika dua test
    ini tidak dilakukan beserta dampak yang akan terjadi pada perangkat lunak
    Jawab :
    Menurut sumber https://www.guru99.com/unit-testing-guide.html unit testing adalah jenis software testing yang bertujuan untuk
    memvalidasi bahwa setiap unit kode perangkat lunak berfungsi seperti yang diharapkan. Unit yang dimaksud bisa berupa fungsi,
    kode, metode, prosedur, modul ataupun objek itu sendiri. Dalam SDLC, unit testing dilakukan sebelum integration testing.
    Menurut sumber https://medium.com/qa-malang/8-jenis-software-testing-5a884e806a6d Integration testing merupakan pengujian
    perangkat lunak di mana masing-masing unit (yang berinteraksi di dalam sebuah software) digabungkan dan diuji untuk memverifikasi
    apakah mereka berfungsi sebagaimana mestinya ketika terintegrasi. Tujuan utama di sini adalah untuk menguji antarmuka antar modul.
    Menurut pendapat saya dari kedua sumber diatas adalah jika kedua test diatas tidak dilakukan, pertama dampak tidak dilakukannya
    unit testing adalah tidak diketahuinya bug pada saat pengembangan aplikasi yang akan berdampak kepada biaya yang dibutuhkan untuk
    memperbaiki bug tersebut di kemudian hari dan akan menyulitkan developer untuk memahami baris kode jika ingin membuat perubahan.
    Kedua dampat tidak dilakukannya integration testing adalah tidak diketahuinya apakah modul atau komponen yang terintegrasi sudah
    berjalan dengan baik atau belum dan tidak dapat mendeteksi kesalahan yang terkait dengan antarmuka.

    3. Berikan pendapat kalian tentang pekerjaan QA Engineer sedangkan disisi lain Software Engineer telah melakukan testing
    Jawab:
    Menurut sumber website https://medium.com/easyread/perbedaan-software-testing-dan-software-quality-assurance-31899237bedb
    sofwate engineer yang melakukan testing fokus pengujiannya yaitu produknya atau perangkat lunaknya, sedangkan QA engineer
    berfokus pada seluruh kegiatan, proses , aktivitas, bahkan metode yang digunakan dalam pembangunan dan pengembangan perangkat
    lunak termasuk fase testing.
    Menurut sumber website https://www.neotys.com/blog/test-engineer-or-qa-engineer/ seorang QA harus memastikan customer
    experience yang baik, berkontribusi diseluruh product lifecycle, dan mempelajari dan meningkatkan kualitas proses dan produk.
    Adapun seorang software engineering yang melakukan testing harus mencari bug dalam software, umumnya berkontribusi di akhir
    product lifecycle, dan memeriksa modul produk.
    Menurut pendapat saya dari sumber diatas adalah seorang software engineer yang melakukan testing hanya berfokus pada penemuan
    bug serta menyelidiki dan melaporkan seberapa baik kinerja perangkat lunak tersebut. Sedangkan seorang quality assurance engineer
    tidak hanya melakukan testing, tapi juga harus memastikan semua SDLC sudah berjalan dengan baik dan memastikan kualitas
    oftware yang dikembangkannya sudah baik sebelum sampai ke customer.

    4. Terdapat banyak test pada perangkat lunak, mulai dari test business logic, UI, UX, Performa, sampai keamanan. Namun tidak
    semuanya dapat dilakukan karena keterbatasan waktu dan mahalnya biaya yang harus dikeluarkan. Berikan pendapat kalian dampak
    apa yang terjadi jika pengujian diatas tidak diberikan pada perangkat lunak
    Jawab:
    Menurut sumber https://biztechacademy.id/manfaat-pengujian-perangkat-lunak/#:~:text=Tujuan%20dan%20Manfaat%20dari%20Software,(requirement)%20yang%20sebelumnya%20ditentukan.
    tujuan utama dari pengujian perangkat lunak sebenarnya sederhana, yaitu untuk memastikan bahwa software yang
    dihasilkan sesuai dengan kebutuhan (requirement) yang sebelumnya ditentukan.
    Jadi menurut saya jenis jenis test yang ada seperti test business logic, UI, UX, Performa, sampai keamanan
    mempunyai peran testing nya masing masing.
    Misalnya pada business logic testing, jika tidak dilakukan pengujian maka perangkat lunak yang dikembangkan
    bisa terjadi kesalahan yang tidak terduga atau perhitungan yang tidak logis.
    Contoh lainnya jika UI UX testing tidak dilakukan maka akan memunculkan kesalahan dalam user interface yang
    tidak diinginkan dan itu akan mempengarui user experience customer.
    Contoh lainnya jika security testing tidak dilakukan maka bisa saja perangkat lunak tersebut dibobol dan
    mengakibatkan  hilangnya informasi atau reputasi organisasi.
    Referensi contoh
    https://testfort.com/blog/business-logic-in-qa-and-its-role-in-the-development-of-perfect-software
    https://www.geeksforgeeks.org/differences-between-interface-and-integration-testing/#:~:text=Interface%20Testing%20is%20a%20type,like%20APIs%2C%20web%20services%20etc.
    https://www.geeksforgeeks.org/software-testing-security-testing/#:~:text=Security%20Testing%20is%20a%20type,that%20can%20cause%20a%20loss.

    5. Berikan pendapat kalian tentang testing perangkat lunak secara manual? Apakah di saat banyaknya testing secara otomatisasi dilakukan testing secara
    manual perlu dilakukan?
    Jawab:
    Menurut sumber https://qatros.com/blog/blog-technology-1/post/perbedaan-manual-testing-dan-automated-testing-27 Dalam manual testing akan memeriksa
    fitur-fitur penting dari software yang tengah diuji. Dalam hal ini, testing dilakukan dengan menjalankan software dan menganalisa apakah semua aspek
    software sudah sesuai dengan rancangan awal (ekspektasi awal pembuatannya) atau tidak. Adapun Untuk melakukan proses automated testing, perlu membuat
    kode atau skrip testing. Skrip tersebut akan dijalankan dengan bantuan automated testing tool. Skrip yang telah tertulis dengan benar dan kemudian
    dijalankan melalui automated testing tool akan melakukan validasi secara otomatis pada software yang sedang di-testing.
    Jika kita melakukan testing secara manual maka kita akan berhadapan langsung dengan interface dimana kita dapat menemukan bug disana, serta mendapatkan
    feedback langsung dari user apa yang disukai dan tidak disukainya, tetepi testing secara manual kurang teliti dibandingkan testing secara otomatis karena
    bisa saja terjadinya human error, serta memakan lebih banyak waktu.
    Adapun jika kita melakukan testing secara otomatis maka kita akan menemukan lebih banyak bug karena menggunakan tools, testingnya bisa dilakukan secara
    berulang, serta lebih cepat dan efisien, tetapi testing secara otomatis akan memakan lebih banyak memakan biaya dan tidak dapat feedback langsung dari user.
    Jadi menurut saya testing secara manual atau otomatis mempunyai kelebihan dan kekurangannya masing-masing sesuai dengan kebutuhan.
    Referensi
    https://medium.com/skyshidigital/perbedaan-manual-testing-dan-automated-testing-9d13373a36e
    http://www.quadras.co.id/2016/03/18/manual-vs-automation-testing-tools-pilih-yang-mana/#:~:text=Pengujian%20manual%20atau%20manual%20testing,oleh%20tools%2C%20script%20dan%20software.
    https://qatros.com/blog/blog-technology-1/post/perbedaan-manual-testing-dan-automated-testing-27
*/