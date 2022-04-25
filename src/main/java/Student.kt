import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class Student {
    
    var indonesia = Locale("in", "ID") // Format tanggal lahir menjadi standar tanggal
    var id: Int // ID yang memiliki tipe data INT dan hanya diisi bilangan bulat
    var nama: String // Nama bertipe String
    var tglLahir: String // Tanggal lahir bertipe String
    var noHp: String // Nomor handphone bertipe String
    lateinit var namaAyah: String // Orang tua bertipe Object yang berisi String
    lateinit var namaIbu: String // Orang tua bertipe Object yang berisi String
    lateinit var NIM: String // NIM yang memiliki tipe data String
    
   constructor(id: Int, nama: String, tglLahir: String, noHp: String): this(){
        this.id = id
        this.nama = nama
        this.tglLahir = tglLahir
        this.noHp = noHp
    }

    init {
        this.id = 0
        this.nama = ""
        this.tglLahir = ""
        this.noHp = ""
    }

    fun getFullIdentification(): List<String> = listOf("$id", nama, tglLahir, noHp)

    //Mengubah menjadi format dd-mm-yyyy
    fun formatTanggal(tanggal: String): String {
        val pengubah = DateTimeFormatter.ofPattern("dd MMMM yyyy", indonesia)
        val tanggal = LocalDate.parse(tanggal, pengubah)
        val keluaran = tanggal.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        return (keluaran)
    }
    
    // Fungsi Nomor Hp
    fun getNomorHp(no: String): String {
        if(no.length == 11 || no.length == 12){
            return no
        } else {
            return "Nomor tidak valid"
        }
    }
    
    // Fungsi Hobi
    fun hobi(array: List<String>): List<String> {
        val hobi = array.toList()
        return hobi
    }
    
    // Fungsi NIM
    fun NIM() {
        
    }
    
    // Fungsi Orangtua
    class ortu() {
        
    }
    
    // Fungsi yang dapat mengembalikan nilai berbentuk ArrayList dengan tipe data Object Student
    val getStudentArrayList
    
}
