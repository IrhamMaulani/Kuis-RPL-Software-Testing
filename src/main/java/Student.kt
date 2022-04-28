import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student()
{
    var indonesia = Locale("in", "ID")
    var id:Int
    var name: String
    var tanggal: String
    var phoneNum: String
    lateinit var ayah: String
    lateinit var ibu: String
    constructor(id: Int, name: String, tanggal: String, phoneNum: String) : this() {
    this.id = id
    this.name = name
    this.tanggal = tanggal
    this.phoneNum = phoneNum
    }

    init{
        this.id = 0
        this.name = ""
        this.tanggal = ""
        this.phoneNum = ""
    }

    fun getFullIdentification(): String = "$id $name $tanggal $phoneNum"
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    //--
    // Nama bertipe String, Contoh : Joko Tarbia
    //--
    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    //--
    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun formattedTanggalLahir(tanggal: String): String {

        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", indonesia)
        val date = LocalDate.parse(tanggal, formatter)
        val formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        return (formattedDate)
    }
    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    fun getPhoneNumber(phoneNumber: String): String{
        return if (phoneNumber.length == 11 || phoneNumber.length == 12) {
            return phoneNumber
        } else return "Number Invalid"
    }

    //  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    //  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}

    var orangTua = OrangTua("Stephen Sambura", "Stephani Sambruang")

    /*NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    Tanggal Lahir : 10 Agustus 2019.
    NIM nya menjadi : 5JT10082019
    */
    fun setNIM(id: Int, name: String, tanggal: String): String{
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
        val tempTanggal: String = formattedTanggalLahir(tanggal)
            .replace("-","")
        return "${id.toString()}${tempName}${tempTanggal}"
    }
    /* Hobi yang bertipe array atau list atau arraylist yang berisikan string
       contoh : ['Bersepeda', 'Bernyanyi', 'Makan'] */

    fun hobi(array: List<String>): List<String>{
        val hobi = array.toList()
    return hobi
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

class OrangTua(var ayah: String, var ibu: String){
    fun show (): String {
        return("ayah: $ayah, ibu: $ibu")
    }
}
