import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var id: Int = 0
        get() = field
        set(value) {field=value}

    // Nama bertipe String, Contoh : Joko Tarbiah
    var nama : String = ""
        get() = field
        set(value) {field=value}

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    var tanggalLahir : String = ""
        get() = field
        set(value) {field=value}

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun convertDate(tanggalLahir:String) : String{
        val formatter = SimpleDateFormat("dd MMMM yyyy", Locale("in", "ID"))
        val tanggal = formatter.parse(tanggalLahir)
        val formatted = SimpleDateFormat("dd-MM-yyyy")
        return formatted.format(tanggal)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    var noHp : String = ""
        get() = field
        set(value) {if (value.length<11||value.length>12) field="Phone Number Is Not Valid"
        else field = value}


    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    var Ortu: Map<String, String> = mapOf("ayah" to "Stephen Sambura", "ibu" to "Stephani Sambruang")

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobi: Array<String> = arrayOf("Travelling","Nonton Film","Olahraga")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    fun generateNIM(id: Int, nama: String, tanggalLahir: String): String {
        val inisial = nama.split(" ")
        val satu = inisial[0].toCharArray()
        val dua = inisial[1].toCharArray()
        val tl = convertDate(tanggalLahir)
        val format = tl.replace("-", "")

        val nim = "$id${satu[0]}${dua[0]}${format}"
        return nim
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
    fun getListStudent(): ArrayList<Student> {
        val listStudent = ArrayList<Student>()
        listStudent.add(Student())
        return listStudent
    }

}

fun main() {
    val student = Student()

    println(student.convertDate("15 Maret 2002"))
    println(student.Ortu)
    println(student.hobi[0])
    println(student.generateNIM(1, "Lail Rahmah", "10 November 2002"))
    println(student.getListStudent())

    student.noHp = "123456789"

}