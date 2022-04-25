import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class Student {

    var id: Int = 0
        get() = field
        set(value) {
            field = value
        }

    var nama: String = ""
        get() = field
        set(value) {
            field = value
        }

    var tgl_lhr: String = ""
        get() = field
        set(value) {
            field = value
        }

    fun convertDate(tgl_Lhr: String): String {
        val formatter = SimpleDateFormat("dd MMMM yyyy", Locale("in", "ID"))
        val tgl = formatter.parse(tgl_lhr)
        val formatted = SimpleDateFormat("dd-MM-yyyy")
        return formatted.format(tgl)
    }

    var noHP: String = ""
        get() = field
        set(value) {
            if (value.length < 11 || value.length > 12) field = "No Hp Salah"
            else field = value
        }

    val ortu = orangTua("", "")

    val hobi: mutableList<String> = listOf("Bersepeda", "Bernyanyi", "Makan", "Berenang", "Berlari")

    var nim: String = ""
        get() {
            field = formatNim(this.id, this.nama, this.tgl_lhr)
            return field
        }


}