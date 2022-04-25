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
    fun testOT(){
        val ortu = student.orangTua(ayah, ibu)
        Assertion.assertEqauls(ortu, "Stepen Sambura", "Stepani Samburang", "Hasil Tidak sama")
    }

    @Test
    fun testNim() {
        val nim = student.NIM
        assertEquals(nim, "5JT10082019")
    }

    @Test
    fun testFormatTanggal(){
        val tanggal = "10 Agustus 2019"
        val hasil = student.tanggal(tanggal)
        Assertions.assertEquals(hasil, "10-08-2019", "Hasil tidak sama")
    }
}