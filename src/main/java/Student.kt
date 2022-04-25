import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student {
    constructor(id: Int, name: String, ttl: String, phoneNum: String){
        this.id = id
        this.name = name
        this.ttl = ttl
        this.phoneNum = phoneNum
    }
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    private var id: Int = 0
    public fun setId(id: Int){
        this.id = id
    }
    public fun getId() = this.id
    // Nama bertipe String, Contoh : Joko Tarbiah
    private var name: String = ""
    public fun setName(name: String){
        this.name = name
    }
    public fun getName() = this.name
    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    private var ttl: String = ""
    public fun setTTL(ttl: String){
        this.ttl = ttl
    }
    public fun getTTL() = this.ttl
    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    var ind = Locale("in", "ID")
    fun formattedTTL(ttl: String): String{
        val format = DateTimeFormatter.ofPattern("dd MMMM yyyy", ind)
        val tanggal = LocalDate.parse(ttl, format)
        val formattedTTL = tanggal.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return formattedTTL
    }
    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    private var phoneNum: String = ""
    public fun setPhoneNum(phoneNum: String){
        this.phoneNum = if (phoneNum.length < 11 || phoneNum.length > 12) "Phone Number Invalid"
        else phoneNum
    }
    public fun getPhoneNum() = this.phoneNum
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    val orangTua = OrangTua("Stephen Sambura", "Stephani Sambruang")
    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    var hobi = mutableListOf<String>("Bersepeda", "Bernyanyi", "Makan")
    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    private val nim: String = setNIM(id, name, ttl)
    public fun setNIM(id: Int, name: String, ttl: String): String{
        var tempName = ""
        if (" " in name){
            var x = 0
            val tempArray: List<String> = name.split(" ")
            while (x < tempArray.size) {
                tempName += tempArray[x].take(1)
                x++
            }
        }
        else tempName = name.take(1)
        val tempTTL: String = formattedTTL(ttl)
            .replace("-","")
        return "${id.toString()}${tempName}${tempTTL}"
    }
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
class OrangTua(val ayah: String, val ibu: String){}
