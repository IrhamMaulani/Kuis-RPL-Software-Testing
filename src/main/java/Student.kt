
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    // Nama bertipe String, Contoh : Joko Tarbiah

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

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
    
  //JAWABAN///
    
import java.text.SimpleDateFormat
import java.util.*

class Student(var nama1: String, var nama2: String, id : Int,var format: String, var tanggal: String, private var nomor: String) {
    var formatted = " "
    var iD = id
    var hobi = arrayOf<String>(" ")
    fun setPhoneNumber(nomor: String ) {
        this.nomor = if(nomor.length < 11 || nomor.length > 12)" Nomor telpon melebih kapasitas"
        else nomor
    }
    fun setPhoneNumber() = this.nomor
    val sdf  = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())

    fun Konvert(){
        val parseDate = sdf.parse(tanggal)
        formatted =SimpleDateFormat(format).format(parseDate)
    }
    val pertama = nama1.first()
    val kedua =  nama2.first()
    fun Detail(){
        val detail =""" Nama: $nama1$nama2
                        Id: $iD
                        Tanggal Lahir: $tanggal
                        Nomor: $nomor
                        NIM: $iD$pertama$kedua${Konvert()}
                        """
        print(detail)
    }

    fun Hobi(): Array<String> {
        return hobi
    }


}
class Ortu(var ayah : String, var ibu: String) {
    var nAyah = ayah
    var nIbu = ibu

    fun Detail1(){
        val detail1 ="""Nama: $nAyah
                        Nama: $nIbu"""

        print(detail1)
    }
}


