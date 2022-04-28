import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.List as List

class Student() {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.
    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    // Nama bertipe String, Contoh : Joko Tarbiah
    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    var id: Int
    var nama: String
    var tglLahir: String
    var noHP: String

    constructor(id: Int, nama: String, tglLahir: String, noHP: String) : this() {
        this.id = id
        this.nama = nama
        this.tglLahir = tglLahir
        this.noHP = noHP
    }

    init {
        this.id = 0
        this.nama = ""
        this.tglLahir = ""
        this.noHP = ""
    }

    fun getFullIdentification(): List<String> = listOf("$id", nama, tglLahir, noHP)

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun formatTgl(tanggal: String): String {
        val formatIncoming = SimpleDateFormat("dd MMMM yyyy", Locale("in", "ID"))
        val formatOutgoing = SimpleDateFormat("dd-MM-yyyy")
        return formatOutgoing.format(formatIncoming.parse(tanggal))
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun getNoHP(noHP: String): String {
        if (noHP.length < 11 || noHP.length > 12) return "Phone Number Invalid"
        else return noHP
    }

    // Orang tua bertipe Object yang berisi String nama kedua orang tua.
    // Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    object orangTua {
        var ayah: String = "Charles William"
        var ibu: String = "Evelyn Jessica"
    }

    // Hobi yang bertipe array atau list atau arraylist yang berisikan string
    // contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    var hobi: List<String> = listOf("Bermain Game", "Badminton", "Deadliner")

    // NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    // dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student, dan tanggal lahir
    // Contoh ID=5, nama : Joko Tarbiah, Tanggal Lahir : 10 Agustus 2019.
    // NIM nya menjadi : 5JT10082019
    fun NIM(id: Int, nama: String, tglLahir: String): String {
        var inisial = nama.split(" ")
            .mapNotNull { it.firstOrNull()?.toString() }
            .reduce { acc, s -> acc + s }
        var tgl: String = formatTgl(tglLahir)
        tgl = tgl.replace("-","")
        return "$id$inisial$tgl"
    }

    //sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    fun getList(): ArrayList<Student> {
        val list = ArrayList<Student>()
        list.add(this)
        return list
    }
}