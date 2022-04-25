import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mockito.mock
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

internal class JobTest {
    private lateinit var job: Job

    @BeforeEach
    fun beforeEach() {
        job = Job()
    }

    @Test
    fun testFullIdentificationSuccess() {
        val job = Job("3", "Pekerjaan Ketiga", true)
        assertEquals("3 Pekerjaan Ketiga true", job.getFullIdentification())
    }

    @Test
    fun testGetDayByNumberSuccess() {
        assertEquals("Minggu", job.getDayByNumber(7))
    }

    @Test
    fun testGetDayByNumberError() {
        assertEquals("Hari Cuma ada 7", job.getDayByNumber(12))
    }

    @Test
    fun testGetDayNumberFailed() {
        assertEquals(job.getDayByNumber(10), "Hari Cuma ada 7")
    }

    @Test
    fun testJobArrayList() {
        val job = Job("3", "Pekerjaan Ketiga", true)
        assertEquals(job.getJobList, arrayListOf(job))
    }

    @Test
    fun testCalculateSuccess() {
        assertEquals(job.calculateNumber(10, 10, 10), 30)
    }

    @Test
    fun assertEqualIsTrue() {
        val result = 5 + 5
        assertEquals(result, 10, "Hasil harus hasil pertambahan")
    }

    @Test
    fun `assert Equal Is Error`() {
        val result = 5 + 5
        assertNotEquals(12, result)
    }

    @Test
    fun testStringLength() {
        val input = "BanDung"
        val inputLength = input.length - 1
        val strArray = input.split("").filter { it != "" }
        var full = ""
        for (i in 0..inputLength) {
            full += strArray[i].uppercase()
            for (j in 1..inputLength) {
                full += strArray[i].lowercase()
            }
        }
        assertEquals(full, "BbbbbbbAaaaaaaNnnnnnnDddddddUuuuuuuNnnnnnnGgggggg")
    }
}