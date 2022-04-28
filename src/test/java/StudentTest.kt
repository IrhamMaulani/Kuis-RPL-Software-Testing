import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student
    private lateinit var orangtua: Student.Orangtua

    @BeforeEach
    fun beforeEach(){
        student = Student()
        student.studentid = 5
        student.nama = "Biahlil Akbar"
        student.nohp = "083150195537"
        student.tlahir = "14 Februari 2002"
        orangtua = Student.Orangtua()
        orangtua.ayah = "Joko Tarbiah"
        orangtua.ibu = "Siti Amanah"
    }

    //Masih Error Tanggalnya
    @Test
    fun testTangalSuccess() {
        val expected = "14-02-2002"
        assertEquals(expected,student.tanggal())
    }

    @Test
    fun testPhonenumFailed() {
        student.nohp = "0831501955371"
        val expected = "Panjang nomor tidak sesuai"
        assertEquals(expected,student.Phonenum())
    }

    @Test
    fun testPhonenumSuccess() {
        student.nohp = "083150195537"
        val expected = "083150195537"
        assertEquals(expected,student.Phonenum())
    }

    @Test
    fun testOrangtuaSuccess() {
        val ayah = "Joko Tarbiah"
        val ibu = "Siti Amanah"
        assertEquals(Pair(ayah,ibu),orangtua.displayortu())
    }

    @Test
    fun testArrayHobiSuccess() {
        val expected = "Bersepeda , Bernyanyi , Makan "
        assertEquals(expected,student.arrayhobi())
    }

    @Test
    fun testGenNIMSucces() {
        val expected = "5BA14022002"
        assertEquals(expected,student.genNIM())
    }

}

