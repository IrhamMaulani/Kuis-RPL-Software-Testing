import java.text.DateFormatSymbols
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Student {

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    // Nama bertipe String, Contoh : Joko Tarbiah

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    var studentid: Int = 5
    var nama: String = "Joko Tarbiah"
    var tlahir: String = "10 Agustus 2019"
    var id = Locale("in", "ID")
    var dateformat = DateFormatSymbols(id)
    var nohp: String = "081234567891"

    //Member functions of class to set student name
    fun setStudentName(nama:String){
        this.nama=nama
    }

    //Member functions of class to set student age
    fun setStudentAge(tlahir:String){
        this.tlahir=tlahir
    }
    fun setStudentId(id:Int){
        this.studentid=studentid
    }


    //Member functions of class to return student details
    fun getStudentDetails():String{
        return "Name :  $nama, Age : $tlahir"
    }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun tanggal(): String? {
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", id)
        val date = LocalDate.parse(tlahir, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return hasil
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun Phonenum(): String {
        if(nohp.length == 11||nohp.length == 12) {
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

        var ayah: String = "Stephen Sambura" ;
        var ibu: String = "Stephani Sambruang";
        fun displayortu() {
            println("Ayah : $ayah")
            println("Ibu : $ibu")

        }
    }

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    fun arrayhobi() {
        val Hobi: Array<String> = arrayOf("Bersepeda ", "Bernyanyi ", "Makan ")

        val sb = StringBuilder()
        for (element in Hobi) {
            sb.append(element).append(", ")
        }
        val c = sb.toString().substring(0, sb.length-2)
        println(c)
    }
    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    fun genNIM(): String {
        var inisial: String = nama.trim().split(" ").map{it.first()}.joinToString("").uppercase()
        val tlahir = tanggal()
        val tgl = tlahir?.replace("-","")
        /*pake hasil dibagian baris 40 biar udh ke reformat*/

        return "${studentid}$inisial$tgl";
    }
}











    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */