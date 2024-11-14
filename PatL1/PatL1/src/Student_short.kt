class Student_short: The_Student
{
    private var FIO: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                throw IllegalArgumentException("Некорректные ключевые данные объекта.")
            else
                field = value
        }
    private var Connect: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }

    constructor(s: Student): this(s.id, s.getInfo())
    { }

    constructor(id: Int, infa: String)
    {
        this.id = id
        val c = infa.split("|")
        this.FIO = c[1]
        this.Connect = c[3]
        this.git = c[5]
    }

    override fun toString(): String {
        return "ФИО: ${FIO}\n" +
                "Связь: ${Connect.split(":")[1]}\n" +
                "Гит: ${git}\n"
    }

}