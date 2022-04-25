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
    fun testGetNIMSuccess(){
        val student = Student(8,"Maulana Charalka", "22 Agustus 2000")
        assertEquals("8MC22082000", student.NIM())
    }

    @Test
    fun testFormatTglSuccess(){
        var tanggal = "29 Oktober 2002"
        assertEquals("29-10-2002", student.formatTgl(tanggal))
    }

    @Test
    fun testGetNoHPSuccess1(){
        val student = Student("082212341234")
        assertEquals("082212341234", student.NoHP)
    }

    @Test
    fun testGetNoHPSuccess2(){
        val student = Student("08221234")
        assertEquals("Phone Number Invalid", student.NoHP)
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
        assertEquals("Deadliner", student.hobi[3])
    }

    @Test
    fun testGetListSuccess(){
        val student = Student(4,"Maulana Yaa", "22 Juni 2000")
        assertEquals(student.getList(), arrayListOf(student))
    }
}