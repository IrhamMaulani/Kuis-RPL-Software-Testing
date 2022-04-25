import java.text.SimpleDateFormat
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

class Student() {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    // Nama bertipe String, Contoh : Joko Tarbiah
    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    var Sid: Int
    var Sname: String
    var Snphone: String
    var Sbirth: String

    init {
        Sid = 0
        Sname = ""
        Sbirth = ""
        Snphone = ""
    }

    constructor(Sid: Int, Sname: String, Sbirth: String, Snphone: String) : this() {
        this.Sid = Sid
        this.Sname = Sname
        this.Sbirth = Sbirth
        this.Snphone = Snphone
    }


    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy dari input 10 Agustus 2019
    fun formatTgl(Sbirth: String): String {
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale("in", "ID"))
        val dateParse = dateFormat.parse(Sbirth)
        val dateFormatFinal = SimpleDateFormat("dd-MM-yyyy")
        return dateFormatFinal.format(dateParse)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun getStudentNPhone(Snphone: String){
        if (Snphone.length < 11 || Snphone.length > 12) "Nomor Telepon Tidak Valid"
        else Snphone
    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    val parent: Map<String, String> = mapOf("ayah" to "Stephen Sambura", "Ibu" to "Stephani Sambruang")

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    val hobby: List<String> = listOf("Bersepeda", "Bernyanyi", "Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    fun formatNim(Sid: Int, Sname: String, Sbirth: String): String {
        val birth = formatTgl(Sbirth)
        val format = birth.replace("-".toRegex(), "")
        val length = Sname.length - 1
        val str = Sname.split("")
        var singkat = ""
        for (i in 0..length) {
            if (str[i] == " "){
                singkat += str[1]
                singkat += str[i+1]
            }
        }
        return "$Sid$singkat$format"
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