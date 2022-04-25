import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
    }

    @Test
    fun testFullIdentificationSuccess() {
        val student = Student(5, "Joko Tarbiah", "10 Agustus 2019", "085312345678")
        assertEquals(listOf("5", "Joko Tarbiah", "10 Agustus 2019", "085312345678"), student.getFullIdentification())
    }

    @Test
    fun testGetNomorHpSuccess(){
        val noHp = student.getNomorHp("085312345678")
        assertEquals("085312345678", noHp)
    }

    @Test
    fun testGetNomorHPError(){
        val noHp = student.getNomorHp("0853")
        assertEquals("Syarat nomor yaitu 11 dan 12 angka", noHp)
    }

    @Test
    fun testGetNomorHPFailed(){
        val noHp = student.getNomorHp("0853")
        assertEquals(noHp,"Syarat nomor yaitu 11 dan 12 angka")
    }

    @Test
    fun testGetOrangTuaSuccess(){
        val ortu = student.orangTua("Stephen Sambura", "Stephani Sambruang")
        assertEquals("ayah: Stephen Sambura ibu: Stephani Sambruang", ortu)
    }

    @Test
    fun testSetHobiSuccess(){
        val hobi = listOf("Bersepeda", "Bermain", "Menyanyi")
        assertEquals("[Bersepeda, Bermain, Menyanyi]", student.hobi(hobi).toString())
    }

    @Test
    fun testTanggalLahir(){
        val tanggal = "10 Agustus 2019"

        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale("in", "ID"))
        val date = LocalDate.parse(tanggal, formatter)
        val expectation = date.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("in", "ID")))

        assertEquals(expectation, tanggal, "Penulisan Tanggal Salah")
    }

    @Test
    fun testFormatTanggal(){
        val tanggal = "10 Agustus 2019"

        val formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale("in", "ID"))
        val date = LocalDate.parse(tanggal, formatter)
        val expectation = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        assertEquals(expectation, student.formatTanggal(tanggal))
    }

    @Test
    fun testNIMSuccess(){
        val tanggal = student.formatTanggal("10 Agustus 2019")
        val data = student.NIM(5, "Joko Tarbiah", tanggal)
        assertEquals("5JT10082019", data)
    }

    @Test
    fun testStudentArrayList() {
        val student = Student(5, "Joko Tarbiah", "10 Agustus 2019", "085312345678")
        assertEquals(student.getStudentArrayList, arrayListOf(student))
    }
}