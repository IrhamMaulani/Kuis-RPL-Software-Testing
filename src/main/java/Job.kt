class Job() {
    var id: String
    var name: String
    var isActive: Boolean

    constructor(id: String, name: String, isActive: Boolean) : this() {
        this.id = id
        this.name = name
        this.isActive = isActive
    }

    private val day: List<String> =
        listOf("Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu")

    init {
        this.id = ""
        this.name = ""
        isActive = false
    }

    fun getFullIdentification(): String = "$id $name $isActive"

    // Param day : Int 1-7
    // return string from index in day : Senin- Minggu
    fun getDayByNumber(day: Int): String = if (day < 0 || day > 7) "Hari Cuma ada 7" else this.day[day - 1]

    fun calculateNumber(vararg numbers: Int): Int = numbers.sum()

    val getJobList: ArrayList<Job>
        get() {
            val list = ArrayList<Job>()
            list.add(this)
            return list
        }
}