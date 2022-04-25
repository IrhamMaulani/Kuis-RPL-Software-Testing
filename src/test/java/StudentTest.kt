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
        assertEquals("5 Joko Tarbiah 10 Agustus 2019 085312345678", student.getFullIdentification(), "Tidak Sesuai")
    }

    @Test
    fun testGetNomorHpSuccess(){
        assertEquals("085312345678", student.getNomorHp("085312345678"))
    }

    @Test
    fun testGetNomorHPError(){
        assertEquals("Digit nomor HP tidak memenuhi syarat (11 - 12)", student.getNomorHp("08532"))
    }

    @Test
    fun testGetNomorHPFailed(){
        assertEquals(student.getNomorHp("08532"),"Digit nomor HP tidak memenuhi syarat (11 - 12)")
    }

    @Test
    fun testGetOrangTuaSuccess(){
        assertEquals("ayah: Stephen Sambura ibu: Stephani Sambruang",
            student.orangTua("Stephen Sambura", "Stephani Sambruang"))
    }

    @Test
    fun testSetHobiSuccess(){
        val hobi = listOf("Bersepeda", "Bermain", "Menyanyi")
        assertEquals("[Bersepeda, Bermain, Menyanyi]", student.hobi(hobi).toString())
    }

    @Test
    fun testTanggalLahir(){
        val tanggal = student.tanggalLahir

        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("in", "ID"))
        val date = LocalDate.parse(tanggal, formatter)
        val expectation = date.format(DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("in", "ID")))

        assertEquals(expectation, tanggal, "Penulisan Tanggal Salah")
    }

    @Test
    fun testFormatTanggal(){
        val tanggal = student.tanggalLahir
        val hasil = student.formatTanggal(tanggal)

        val formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale("in", "ID"))
        val date = LocalDate.parse(tanggal, formatter)
        val expectation = date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))

        assertEquals(expectation, hasil, "Hasil tidak sama")
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