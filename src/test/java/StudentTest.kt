import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

internal class StudentTest {
    private lateinit var student: Student
    private lateinit var ortu: OrangTua

    @BeforeEach
    fun beforeEach() {
        student = Student()
        ortu = OrangTua("Stephen Sambura", "Stephani Sambruang")
    }

    @Test
    fun testFullIdentificationSuccess() {
        val student = Student(5, "Jaka Tarbiah", "10 Agustus 2019", "085312345678")
        assertEquals("5 Jaka Tarbiah 10 Agustus 2019 085312345678", student.getFullIdentification())
    }

    @Test
    fun testTanggal(){
        val tanggal = "10 Agustus 2019"

        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale("in", "ID"))
        val date = LocalDate.parse(tanggal, formatter)
        val expectation = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        assertEquals(expectation, student.formattedTanggalLahir("10 Agustus 2019"))
    }

    @Test
    fun testFormattedDate(){
        val result = student.formattedTanggalLahir("10 Agustus 2019")
        val expectation = "10-08-2019"
        assertEquals(expectation, result)
    }

    @Test
    fun testSetHobiSuccess(){
        val hobi = listOf("Bersepeda", "Bermain", "Menyanyi")
        assertEquals("[Bersepeda, Bermain, Menyanyi]", student.hobi(hobi).toString())
    }

    @Test
    fun testOrtu(){
        val expectation = "ayah: Stephen Sambura, ibu: Stephani Sambruang"
        assertEquals(expectation, ortu.show())
    }

    @Test
    fun testGetPhoneNumberSuccess(){
        val noHp = student.getPhoneNumber("085312345678")
        assertEquals("085312345678", noHp)
    }

    @Test
    fun testGetPhoneNumberHPError(){
        val noHp = student.getPhoneNumber("0853")
        assertEquals("Number Invalid", noHp)
    }

    @Test
    fun testGetPhoneNumberFailed(){
        val noHp = student.getPhoneNumber("0853")
        assertEquals(noHp,"Number Invalid")
    }

    @Test
    fun testNIMSuccess(){
        val data = student.setNIM(5, "Joko Tarbiah", "10 Agustus 2019")
        assertEquals("5JT10082019", data)
    }

    @Test
    fun testStudentArrayList() {
        val student = Student(5, "Joko Tarbiah", "10 Agustus 2019", "085312345678")
        assertEquals(student.getStudentArrayList, arrayListOf(student))
    }
}