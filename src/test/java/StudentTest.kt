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
}