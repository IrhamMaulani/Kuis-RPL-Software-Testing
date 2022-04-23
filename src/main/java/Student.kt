import java.text.SimpleDateFormat

class Student {

    var id:Int = 6
    var nama:String = "Joko Tingkir"
    var tanggal:String = "23 April 2022"

    fun dateFormat(): String{
        val format1 = SimpleDateFormat("dd-MM-yyyy")
        val format2 = SimpleDateFormat("dd MMMM yyyy")
        val date = format1.format(format2.parse(tanggal))
        return date
    }
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    // Nama bertipe String, Contoh : Joko Tarbiah

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12

    val orangTua = object {
        var ayah = "Stephen Sambura"
        var ibu = "Stephani Sambruang"

        override fun toString() = "$ayah dan $ibu"
    }
    
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */

    private val hobi: List<String> =
        listOf("Swimming", "Basketball", "Volleyball", "Cooking", "Running")
    
    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    fun getNim(): String {
        val df1 = SimpleDateFormat("ddMMyyyy")
        val df2 = SimpleDateFormat("dd MMMM yyyy")
        val tgl = df1.format(df2.parse(tanggal))
        val inisial = nama.trim().splitToSequence(" ").take(2).map { println(it); it.first().uppercase()}.joinToString("")
        return "$id$inisial$tgl"
    }
    
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
