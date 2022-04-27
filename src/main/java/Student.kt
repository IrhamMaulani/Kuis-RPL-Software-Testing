import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList
// Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
// Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

class Student {
    // properties student berisikan :
    var IND = Locale("in", "ID")
    var id : Int // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var nama : String // Nama bertipe String, Contoh : Joko Tarbiah
    var tanggalLahir : String // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    private var noTelp : String

    constructor(id: Int, nama: String, tanggalLahir: String, noTelp: String) {
        this.id = id
        this.nama = nama
        this.tanggalLahir = tanggalLahir
        this.noTelp = noTelp

    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019

    fun formatTanggal(formatTanggal: String) : String {
        val format = DateTimeFormatter.ofPattern("d MMMM yyyy", IND)
        val date = LocalDate.parse(formatTanggal, format)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return hasil
    }


    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12

    fun getNoTelp(noTelp: String): String? {
        if(noTelp.length < 11 || noTelp.length > 12){
            return null
        } else {
            return noTelp
        }

    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    lateinit var ayah: String
    lateinit var ibu: String

    fun getorangTua(): String {
        var OrangTua = orangTua("Stephen Sambura", "Stephani Sambruang")
        this.ayah = OrangTua.ayah
        this.ibu = OrangTua.ibu
        return "ayah: $ayah ibu: $ibu"
    }


    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    fun getHobi(array: List<String>): List<String> {
        val hobi = array.toList()
        return hobi
    }

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    fun generateNim (id: Int, nama: String, tglLahir: String): String {
        var name: String = nama
            .trim()
            .split(" ")
            .mapNotNull { it.firstOrNull()?.toString() }
            .reduce { acc, s -> acc + s }
            .uppercase()
        var tgl: String = formatTanggal(tglLahir)
        tgl = tgl.replace("-","")
        return "${id.toString()}${name}${tgl}"
    }

    fun setNim(): String {
        return generateNim(this.id, this.nama, this.tanggalLahir)
    }
    fun getNim (): String {
        return generateNim(this.id, this.nama, this.tanggalLahir)
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
    val getStudent: ArrayList<Student>
        get() {
            val list = ArrayList<Student>()
            list.add(this)
            return list
        }
}

class orangTua (val ayah: String, val ibu: String) {

}