import java.text.SimpleDateFormat

class Student() {
    // Impelementasikan properties dan fungsi sesuai spesifikasi dibawah
    // Dan buatkan test pada setiap fungsi yang memastikan bahwa fungsi berjalan baik.

    // properties student berisikan :
    // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat Contoh : 5
    val Sid: Int = 5
    // Nama bertipe String, Contoh : Joko Tarbiah
    val Sname: String = "Joko Tarbiah"
    // Tanggal lahir bertipe String, contoh : 10 Agustus 2019
    val Sbirth: String = "10 Agustus 2019"
    // fungsi yang mengubah format tanggal lahir menjadi standar tanggal dd-mm-yyyy. Contoh : 10-08-2019
    fun changeFormatDate(Sbirth: String): String {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy")
        val dateParse = dateFormat.parse(Sbirth)
        val dateFormatFinal = SimpleDateFormat("dd-MM-yyyy")
        return dateFormatFinal.format(dateParse)
    }

    // Nomor handphone bertipe String yang memiliki syarat minimal panjang huruf 11 dan maksimal 12
    val Sphone: String = "081212121212"
    fun createPhoneNumber(Sphone: String): String {
        if (Sphone.length < 11 || Sphone.length > 12) {
            return "Nomor Handphone Tidak Valid"
        }
        return Sphone
    }
    /*
    *  Orang tua bertipe Object yang berisi String nama kedua orang tua.
    *  Contoh : {"ayah" : "Stephen Sambura", "Ibu" : "Stephani Sambruang"}
    */
    val parent: Map<String, String> = mapOf("ayah" to "Stephen Sambura", "Ibu" to "Stephani Sambruang")

    /*
    * Hobi yang bertipe array atau list atau arraylist yang berisikan string
    * contoh : ['Bersepeda', 'Bernyanyi', 'Makan']
    * */
    val hobby: List<String> = listOf("Bersepeda", "Bernyanyi", "Makan")

    /*
    * NIM yang memiliki tipe data String yang bersifat OTOMATIS di generate saat pembuatan object Student
    * dan merupakan kode yang berupa gabungan ID, huruf pertama dan akhir dari nama student,
    * dan tanggal lahir : Contoh ID=5, nama : Joko Tarbiah,
    * Tanggal Lahir : 10 Agustus 2019.
    * NIM nya menjadi : 5JT10082019
    * */
    fun formatNim(Sid: Int, Sname: String, Sbirth: String): String {
        val nim = "$Sid${Sname[0]}${Sbirth.substring(Sbirth.length - 4)}"
        return nim
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