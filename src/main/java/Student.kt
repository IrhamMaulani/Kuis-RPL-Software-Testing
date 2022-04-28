import java.text.DateFormatSymbols
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Student() {


    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    // Nama bertipe String, Contoh : Joko Tarbiah
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    // properties student berisikan :
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah

    var id = Locale("in", "ID")
    var dateformat = DateFormatSymbols(id)

    var studentid: Int
    var nama: String
    var tlahir: String
    var nohp: String


    constructor(id: Int, nama: String, tanggalLahir: String, nomorHp: String): this(){
        this.studentid = studentid
        this.nama = nama
        this.tlahir = tlahir
        this.nohp = nohp
    }

    init {
        this.studentid = 0
        this.nama = ""
        this.tlahir = ""
        this.nohp = ""
    }
    fun getStudentDetails():String{
        return "ID : $studentid Nama :  $nama, Tanggal lahir : $tlahir, Nomor hp : $nohp"
    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun tanggal(): String? {
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", id)
        val date = LocalDate.parse(tlahir, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return (hasil)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun Phonenum(): String {
        if(nohp.length == 11|| nohp.length == 12) {
            var Nomor = nohp
            return Nomor;

        }
        else {
            return "Panjang nomor tidak sesuai"
        }
    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    class Orangtua() {

        var ayah :String = ""
            get() = field
            set(value) { field = value }
        var ibu:String = ""
            get() = field
            set(value) { field = value }
        fun displayortu() :Pair<String,String> {
            println("Ayah : $ayah")
            println("Ibu : $ibu")
            return Pair(ayah,ibu)
        }
    }

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    fun arrayhobi(): String {
        val Hobi: Array<String> = arrayOf("Bersepeda ", "Bernyanyi ", "Makan ")

        val sb = StringBuilder()
        for (element in Hobi) {
            sb.append(element).append(", ")
        }
        val c = sb.toString().substring(0, sb.length-2)
        println(c)
        return c

    }
    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    fun genNIM(): String {
        val inisial: String = nama.trim().split(" ").map{it.first()}.joinToString("").uppercase()
        val tlahir = tanggal()
        val tgl = tlahir?.replace("-","")
        /*pake hasil dibagian baris 40 biar udh ke reformat*/

        val nim = "$studentid$inisial$tgl"
        return nim;

    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */

    fun getStudentArray(): ArrayList<Student> {
            val Studentlist = ArrayList<Student>()
            Studentlist.add(Student())

            return Studentlist
        }
}











