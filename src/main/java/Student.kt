import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student
{
    private var id:Int
    private var name: String
    private var ttl: String
    private var phoneNum: String
    constructor(id: Int, name: String, ttl: String, phoneNum: String){
    this.id = id
    this.name = name
    this.ttl = ttl
    this.phoneNum = phoneNum
}
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    fun setId(id: Int){
        this.id = id
    }
    private fun getId() = this.id


    // Nama bertipe String, Contoh : Joko Tarbiah

    fun setName(name: String){
        this.name = name
    }
    fun getName() = this.name


    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    fun setTtl(ttl: String){
        this.ttl = ttl
    }
    private fun getTtl() = this.ttl


    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019



    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun setPhoneNumber(phoneNumber: String){this.phoneNum = phoneNumber}
    fun getphoneNumber(): String {
        return if (phoneNum.length == 11 || phoneNum.length == 12) {
            phoneNum
        } else return "Number Invalid"
    }


    fun GetFullIdentification(): String {
        return "$id $name $ttl $phoneNum"
    }


    //  Orang tua bertipe Object yang berisi String nama kedua orang tua.

    //  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}


    /*NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    Tanggal Lahir : 10 Agustus 2019.
    NIM nya menjadi : 5JT10082019
    */


    /* Hobi yang bertipe array atau list atau arraylist yang berisikan string
       contoh : ['Bersepeda', 'Bernyanyi', 'Makan'] */

    var hobi = mutableListOf<String>("Bersepeda", "Bernyanyi", "Makan")
    /*
     * sebuah fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
     * */
    val studentArrayList: ArrayList<Student>
        get() {
            val list = ArrayList<Student>()
            list.add(this)
            return list
        }
}

class OrangTua(private var ayah: String, private var ibu: String){
    private fun getAyah() = this.ayah
    private fun getIbu() = this.ibu
    fun show (): String {
        return("${getAyah()}, ${getIbu()}")
    }
}
