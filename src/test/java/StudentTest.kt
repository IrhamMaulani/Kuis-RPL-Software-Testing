import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.BeforeEach

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach(){
        student = Student()
    }

    @Test
    fun testFormatTanggal(){
        var tanggal = "10 Agustus 2019"
        val hasil = student.tanggal(tanggal)
        Assertions.assertEquals(hasil, "10-08-2019", "Hasil tidak sama")
    }
}