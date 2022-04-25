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
  fun testGetNoHPSuccess1(){
      val student = Student("083812345545")
      assertEquals("083812345545", student.NoHP)
  }
  
  @Test
  fun testGetNoHPSuccess2(){
      val student = Student("0838")
      assertEquals("No Hp Salah", student.NoHP)
  }
  
  @Test
  fun testGetObjectAyahSuccess(){
      assertEquals("Cristiano Ronaldo", student.ortu.ayah)
  }
  
  @Test
  fun testGetObjectIbuSuccess(){
      assertEquals("Kimberly Rider", student.ortu.ibu)
  }
  
  @Test
  fun testGetHobiSuccess() {
      assertEquals("Musik", student.hobi[5])
  }
  
  @Test
  fun testGetNIMSuccess(){
      val student = Student(7,"Kun Aguero", "4 April 1999")
      assertEquals("7KA04041999", student.nim())
  }
  
  @Test
  fun testGetListSuccess(){
      val student = Student(4,"Maulana Yaa", "22 Juni 2000")
      assertEquals(student.getList(), arrayListOf(student))
  }
}
