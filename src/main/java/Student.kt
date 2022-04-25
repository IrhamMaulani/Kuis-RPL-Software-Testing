import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList
// Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
// Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

class Student {
    // properties student berisikan :
    private var id : Int // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    private var nama : String // Nama bertipe String, Contoh : Joko Tarbiah
    private var tanggalLahir : String // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    private var noTelp : String
    private var nim : String

    constructor(id: int, nama: String, tanggalLahir : String, noTelp: String, nim: String) : this () {
        this.id = id
        this.nama = nama
        this.tanggalLahir = tanggalLahir
        this.noTelp = noTelp
        this.nim = nim

    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019

    fun setTanggalLahir(tanggalLahir: String) : String {
        val format = DateTimeFormatter.ofPattern("d MMMM yyyy", id)
        val date = LocalDate.parse(tanggalLahir, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return hasil
    }

    fun getTanggalLahir() {
        this.tanggalLahir
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12

    fun setNoTelp(noTelp: String) {
        if(noTelp.length == 11 || noTelp.length == 12){
            return noTelp
        } else {
            return null
        }

    }

    fun getNoTelp() {
        this.noTelp
    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    var OrangTua = orangTua("Stephen Sambura", "Stephani Sambruang")


    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    private val hobi: List<String> =
        listOf("Belajar", "Bernyayi", "Jalan-jalan", "Bersepeda", "Makan")


    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    fun getNim (id: Int, nama: String, tanggalLahir: String): String {
        var name: String = nama
            .trim()
            .split(" ")
            .mapNotNull { it.firstOrNull()?.toString() }
            .reduce { acc, s -> acc + s }
            .uppercase()
        var tgl: String = tanggal(tglLahir)
        tgl = tgl.replace("-","")
        return "${id.toString()}${name}${tgl}"
    }

    fun getNim () {
        return nim
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
    val getStudent: ArrayList<Job>
        get() {
            val list = ArrayList<Job>()
            list.add(this)
            return list
        }
}

class orangTua (ayah: String, ibu: String) {}