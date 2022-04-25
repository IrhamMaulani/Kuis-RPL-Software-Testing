import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class Student() {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var id : Int = 0

    // Nama bertipe String, Contoh : Joko Tarbiah
    var nama : String = ""

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    var tanggalLahir : String = ""

//    constructor(id: Int, nama: String, tanggalLahir: String, noHp: String){
//        this.id = id
//        this.nama = nama
//        this.tanggalLahir = tanggalLahir
//        this.noHp = noHp
//    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun date(tanggalLahir:String) : String{
        val formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale("in", "ID"))
        val tanggal = LocalDateTime.parse(tanggalLahir, formatter)
        return tanggal.toString()
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
//    var noHp : String =""
//        get() {
//            if (noHp.length < 11 || noHp.length > 12) return "Phone Number Is Not Valid"
//            else return noHp
//        }

//    init {
//        this.id = 0
//        this.nama = ""
//        this.tanggalLahir = ""
//        this.noHp = ""
//    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    var Ortu = OrangTua("","")
    class OrangTua(var ayah : String, var ibu : String) {

    }

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobi : Array<String> = arrayOf("Bersepeda","Bernyanyi","Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
//    var nim: String = generateNIM(id,nama, tanggalLahir)
//    fun generateNIM(id: Int, nama: String, tanggalLahir: String): String{
//        val inisial: String = nama
//            .trim()
//            .split(" ")
//            .mapNotNull { it.firstOrNull()?.toString() }
//            .reduce { acc, s -> acc + s }
//            .uppercase()
//        var tgl: String = date(tanggalLahir)
//        tgl = tgl.replace("-","")
//        return "${id.toString()}${inisial}${tgl}"
//    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */

}

fun main() {
    var student = Student()

    student.date("10 November 2002")
}