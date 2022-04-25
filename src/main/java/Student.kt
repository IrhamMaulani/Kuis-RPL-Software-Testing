import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class Student {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    var id = Locale("in", "ID")

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var stduentID: Int = 0
        get() = field
        set(value) {
            field = value
        }

    // Nama bertipe String, Contoh : Joko Tarbiah
    var nama: String = ""
        get() = field
        set(value) {
            field = value
        }

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    var tanggalLahir: String = ""
        get() = field
        set(value) {
            field = value
        }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun formatTanggalLAhir(tanggal: String): String {
        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", id)
        val date = LocalDate.parse(tanggalLahir, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        return hasil
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    var nomorHP: String = ""
        get() = field
        set(value) {
            if (value.length<11||value.length>12) field = "Tidak Valid"
            else field = value
        }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    var orangTua = OrangTua("Stephen Sambura", "Stephani Sambruang")

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobby =  mutableListOf("Bersepeda","Bernyanyi","Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    var nim: String = ""
        get() = field
        set(value) {
            field = generateNIM(this.stduentID, this.nama, this.tanggalLahir)
        }

    fun generateNIM(ID: Int, nama: String, tglLahir: String): String{
        val inisial: String = nama
            .trim()
            .split(" ")
            .mapNotNull { it.firstOrNull()?.toString() }
            .reduce { acc, s -> acc + s }
            .uppercase()
        var tgl: String = formatTanggalLAhir(tglLahir)
        tgl = tgl.replace("-","")
        return "$ID${inisial}${tgl}"
    }
}

class OrangTua(val ayah: String,val ibu: String){
}