import java.text.DateFormatSymbols
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Student {
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

    var id = Locale("in", "ID")
    var dfs = DateFormatSymbols(id)

    var IDStudent: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var nama: String = ""
        get() = field
        set(value) {
            field = value
        }
    var tanggalLahir: String = ""
        get() = field
        set(value) {
            field = value
        }
    var noHP: String = ""
        get() = field
        set(value) {
            if (value.length<11||value.length>12) field = "No Hp Tidak Valid"
            else field = value
        }

    var nim: String = ""
        get() = field
        set(value) {
            field = generateNIM(this.IDStudent, this.nama, this.tanggalLahir)
        }
    var orangTua = OrangTua("Stephen Sambura", "Stephani Sambruang")
    var hobby =  mutableListOf("Bersepeda","Bernyanyi","Makan")

    fun tanggal(tanggal: String): String {
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", id)
        val date = LocalDate.parse(tanggalLahir, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return hasil
    }

    fun generateNIM(ID: Int, nama: String, tglLahir: String): String{
        var inisial: String = nama
            .trim()
            .split(" ")
            .mapNotNull { it.firstOrNull()?.toString() }
            .reduce { acc, s -> acc + s }
            .uppercase()
        var tgl: String = tanggal(tglLahir)
        tgl = tgl.replace("-","")
        return "${ID.toString()}${inisial}${tgl}"
    }
}

class OrangTua(val ayah: String,val ibu: String){
}
