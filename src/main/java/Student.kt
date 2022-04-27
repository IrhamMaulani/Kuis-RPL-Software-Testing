import java.text.SimpleDateFormat
import java.util.*

class Student {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.
    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    var id: Int = 0
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
    var tglLhr: String = ""
        get() = field
        set(value) {
            field = value
        }

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun formatTanggal(tglLhr: String): String {
        val dateFormat = SimpleDateFormat("dd MMMM yyyy", Locale("in", "ID"))
        val dateParse = dateFormat.parse(tglLhr)
        val dateFormatFinal = SimpleDateFormat("dd-MM-yyyy")
        return dateFormatFinal.format(dateParse)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    var noHP: String = ""
        get() = field
        set(value) {
            if (value.length<11||value.length>12) field = "No Hp Tidak Valid"
            else field = value
        }

    /*
    *  Orang tua bertipe  Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    var orangTua: Map<String, String> = mapOf("ayah" to "Budi", "ibu" to "Siti")

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    val hobi: List<String> = listOf("Main Game", "Mendengarkan Musik", "Membaca Komik", "Nonton Anime")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    var nim: String = ""
        get() {
            field = formatNim(this.id, this.nama, this.tglLhr)
            return field
        }


    fun formatNim(id: Int, nama: String, tglLhr: String): String {
        val tgl: String = formatTanggal(tglLhr)
        val ganti = tgl.replace("-", "")
        val pnjng = nama.length - 1
        val strArray = nama.split("")
        var singkatan = ""
        for(i in 0..pnjng){
            if (strArray[i]==" "){
                singkatan += strArray[1]
                singkatan += strArray[i+1]
            }
        }
        return "$id$singkatan$ganti"
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
