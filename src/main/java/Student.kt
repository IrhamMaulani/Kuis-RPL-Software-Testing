import java.lang.StringBuilder
import java.text.SimpleDateFormat

class Student {

    var id:Int = 0
        get() = field
        set(value) {
            field = value
        }
    var nama:String = ""
        get() = field
        set(value) {
            field = value
        }
    var tanggal:String = ""
        get() = field
        set(value) {
            field = value
        }

    fun dateFormat(): String{
        val format1 = SimpleDateFormat("dd-MM-yyyy")
        val format2 = SimpleDateFormat("d MMMM yyyy")
        val date = format1.format(format2.parse(tanggal))
        return date
    }
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :

    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5

    // Nama bertipe String, Contoh : Joko Tarbiah

    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019

    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019

    var nomorHp : String = ""
        get() {
            if (field.length == 11 || field.length == 12) return field
            else return "No salah "
        }
    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12

    class orangTua (
        var ayah:String ,
        var ibu :String
    )
    val Orangtua = orangTua("stephen Kurniawan","Stephani Kurniawati")
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    fun tampilhobi(): String{
        val a = StringBuilder()
        val hobi: List<String> =
            listOf("Swimming", "Basketball", "Volleyball", "Cooking", "Running")
        for (list in hobi){
            a.append(list).append(", ")
        }
        val Hobi = a.toString().substring(0,a.length-2)
        println(Hobi)
        return Hobi
    }
    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */

    fun getNim(): String {
        val df1 = SimpleDateFormat("ddMMyyyy")
        val df2 = SimpleDateFormat("dd MMMM yyyy")
        val tgl = df1.format(df2.parse(tanggal))
        val inisial = nama.trim().splitToSequence(" ").take(2).map { println(it); it.first().uppercase()}.joinToString("")
        return "$id$inisial$tgl"
    }
    var nimId : String = ""
         get() = field
         set(value) {
             field = getNim()
         }


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
}
