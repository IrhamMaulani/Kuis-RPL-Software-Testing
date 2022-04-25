import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student() {

    var indonesia = Locale("in", "ID")
    var id: Int
    var nama: String
    var tanggalLahir: String
    var nomorHp: String
    lateinit var ayah: String
    lateinit var ibu: String
    lateinit var nim: String

    constructor(id: Int, nama: String, tanggalLahir: String, nomorHp: String): this(){
        this.id = id
        this.nama = nama
        this.tanggalLahir = tanggalLahir
        this.nomorHp = nomorHp
    }

    init {
        this.id = 0
        this.nama = ""
        this.tanggalLahir = ""
        this.nomorHp = ""
    }

    fun getFullIdentification(): List<String> = listOf("$id", nama, tanggalLahir, nomorHp)

    //Fungsi ubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy
    fun formatTanggal(tanggal: String): String {
        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", indonesia)
        val date = LocalDate.parse(tanggal, formatter)
        val hasil = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return (hasil)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun getNomorHp(no: String): String {
        if(no.length == 11 || no.length == 12){
            return no
        } else {
            return "Syarat nomor yaitu 11 dan 12 angka"
        }
    }

    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    fun orangTua(ayah: String, ibu: String): String {
        this.ayah = ayah
        this.ibu = ibu
        return "ayah: $ayah ibu: $ibu"
    }


    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    fun hobi(array: List<String>): List<String> {
        val hobi = array.toList()
        return hobi
    }

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    fun NIM (id: Int, nama: String, tanggalLahir: String): String {
        val tempNIM = mutableListOf<String>()
        var x = 0
        val tanggal = tanggalLahir.replace("-","")
        tempNIM.add(id.toString())

        if (" " in nama){
            val namaArray: List<String> = nama.split(" ")
            while (x < namaArray.size) {
                tempNIM.add(namaArray[x].take(1))
                x++
            }
        }
        else {
            tempNIM.add(nama.take(1))
        }
        tempNIM.add(tanggal)
        return tempNIM.joinToString("")
    }

    /*
    * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    * */
    val getStudentArrayList: ArrayList<Student>
    get() {
        val list = ArrayList<Student>()
        list.add(this)
        return list
    }
}
