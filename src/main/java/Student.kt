import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.contracts.contract

open class Student {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    var ID : Int = 0

    // Nama bertipe String, Contoh : Joko Tarbiah

    var name : String = ""

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    var tanggallahir : String = ""

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
   fun Tanggal() {
       val format = DateTimeFormatter.ofPattern("dd MMMM, yyyy", Locale.getDefault())
        val date = LocalDate.parse(tanggallahir, format)
   }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    var nohp : String = ""
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "majdi", "Ibu" : "Stephani"}
    */
    var ortu : String = ""
    constructor(ID: Int, name: String, tanggallahir: String, nohp: String, ortu : String) {
        this.ID = ID
        this.name = name
        this.tanggallahir =tanggallahir
        this.nohp = nohp
        this.ortu = ortu
    }

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    val hobi : List<String> = listOf ("Bersepeda","Bernyanyi","Makan","Melukis", "Nonton")

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
    fun student() {
        println("ID = ${ID}")
        println("Nama = ${name}")
        println("Tanggal Lahir = ${tanggallahir}")
        println("No. Hp = ${nohp}")
        println("Orang Tua = ${ortu}")

    }
}
class siswa : Student {
    constructor(ID: Int, name: String, tanggallahir: String, nohp: String, ortu : String) : super(
        ID, name, tanggallahir, nohp, ortu
            )
}

fun main()
{
    val student1 = siswa(1,"Annisa","24 Juni 2001", "0821","Majdi")
    student1.student()
}
