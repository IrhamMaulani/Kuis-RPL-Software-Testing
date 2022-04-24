class Student {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var id : Int

    // Nama bertipe String, Contoh : Joko Tarbiah
    var nama : String

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    val tanggalLahir : String

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun date(tanggalLahir:String) : String{
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale("in", "ID"))
        tanggal = LocalDateTime.parse(tanggalLahir, formatter)
        return "$tanggal"
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    val noHp : String = ""
    fun no(noHp : String){
        if (noHp.length >= 11 and noHp.length <= 12){
            return noHp
        }
    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */


    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobi: List<String> = listOf("Bersepeda", "Bernyanyi", "Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
}