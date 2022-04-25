import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

internal class StudentTest {
    private lateinit var student: Student

    @Test
    fun testSetPhoneNumberSuccess(){
        val noHp = student.setPhoneNum("085312345678")
        assertEquals("085312345678", noHp)
    }

    @Test
    fun testSetPhoneNumberError(){
        val noHp = student.setPhoneNum("0853")
        assertEquals("Syarat nomor yaitu 11 dan 12 angka", noHp)
    }

    @Test
    fun testSetPhoneNumberFailed(){
        val noHp = student.setPhoneNum("0853")
        assertEquals(noHp,"Syarat nomor yaitu 11 dan 12 angka")
    }

    @Test
    fun testTanggalLahir(){
        val ttl = "10 Agustus 2019"

        val format = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale("in", "ID"))
        val tanggal = LocalDate.parse(ttl, format)
        val expectation = tanggal.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("in", "ID")))

        assertEquals(expectation, ttl, "Penulisan Tanggal Salah")
    }

    @Test
    fun testFormatTanggal(){
        val ttl = "10 Agustus 2019"

        val format = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale("in", "ID"))
        val tanggal = LocalDate.parse(ttl, format)
        val expectation = tanggal.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        assertEquals(expectation, student.formattedTTL(ttl))
    }

    @Test
    fun testNIMSuccess(){
        val data = student.setNIM(5, "Joko Tarbiah", "10 Agustus 2019")
        assertEquals("5JT10082019", data)
    }

    @Test
    fun testStudentArrayList() {
        val student = Student(5, "Joko Tarbiah", "10 Agustus 2019", "085312345678")
        assertEquals(student.studentArrayList, arrayListOf(student))
    }
}
