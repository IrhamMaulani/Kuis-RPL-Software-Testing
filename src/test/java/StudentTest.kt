import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class StudentTest {
    private lateinit var student: Student

    @BeforeEach
    fun beforeEach() {
        student = Student()
    }

    @Test
    fun getFullIdentitySuccess(){
        student = Student(1, "Maulana AlkaChar", "29 Oktober 2002", "082256401111")
        assertEquals(listOf("1", "Maulana AlkaChar", "29 Oktober 2002", "082256401111"), student.getFullIdentification())
    }

    @Test
    fun testGetNIMSuccess(){
        val student = Student(1,"Maulana Charlesalka", "29 Oktober 2002", "082212341234")
        assertEquals("1MC29102002", student.NIM(student.id, student.nama, student.tglLahir))
    }

    @Test
    fun testFormatTglSuccess(){
        val tanggal = "29 Oktober 2002"
        assertEquals("29-10-2002", student.formatTgl(tanggal))
    }

    @Test
    fun testGetNoHPSuccess1(){
        val student = Student(2,"Maulana Yaa", "22 Agustus 2000", "082212341234")
        assertEquals("082212341234", student.getNoHP(student.noHP))
    }

    @Test
    fun testGetNoHPFailed(){
        val student = Student(3,"Charles Okee", "22 Mei 2000", "0822")
        assertEquals("Phone Number Invalid", student.getNoHP(student.noHP))
    }

    @Test
    fun testGetObjectAyahSuccess(){
        assertEquals("Charles William", Student.orangTua.ayah)
    }

    @Test
    fun testGetObjectIbuSuccess(){
        assertEquals("Evelyn Jessica", Student.orangTua.ibu)
    }

    @Test
    fun testGetHobiSuccess() {
        assertEquals("Deadliner", student.hobi[2])
    }

    @Test
    fun testGetListSuccess(){
        val student = Student(1,"Maulana Yaa", "22 Juni 2000", "086212345678")
        assertEquals(student.getList(), arrayListOf(student))
    }
}