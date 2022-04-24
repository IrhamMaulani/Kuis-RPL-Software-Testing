import java.text.DateFormatSymbols
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList


class Student {

    var indonesia = Locale("in", "ID")
    var id: Int
    var nama: String
    var tanggalLahir: String
    var nomorHp: String
    var ayah: String
    var ibu: String

    init {
        this.id = 0
        this.nama = ""
        this.tanggalLahir = ""
        this.nomorHp = ""
        this.ayah = ""
        this.ibu = ""
    }

    object orangTua{
        fun takeParams(ayah: String, ibu: String): String {
            return takeParams(ayah,ibu)
        }
    }

    var ortu = orangTua.takeParams("Stepen Sambura", "Stepani Samburang")



    //Fungsi ubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy
    fun tanggal(tanggal: String): String? {
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", indonesia)
        val date = LocalDate.parse(tanggal, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return (hasil)
    }

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    // Nama bertipe String, Contoh : Joko Tarbiah

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun hp(no: String): String {
        if(no.length == 11 || no.length == 12){
            return no
        } else {
            return "kd sesuai oi"
        }
    }


    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobiArrayList = arrayListOf<String>("Bersepeda", "Bernyanyi", "Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */

    fun NIM (id: Int, nama: String, tanggalLahir: String): String {
        val tempNIM = mutableListOf<String>()
        val namaFirst = nama.take(1)
        val namaLast = nama.takeLast(1)
        val tanggal = tanggalLahir.replace("-","")
        tempNIM.add(id.toString())
        tempNIM.add(namaFirst)
        tempNIM.add(namaLast)
        tempNIM.add(tanggal)
        return tempNIM.joinToString("")
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
}
