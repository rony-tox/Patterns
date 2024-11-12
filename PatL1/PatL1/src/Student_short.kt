class Student_short: The_Student
{
    private var sid: Int = 0
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var sFIO: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var sConnect: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }
    private var sGit: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }

    constructor(s: Student) : super(s)
    {
        val infa = s.getInfo()
        val c = infa.split("|")
        this.sFIO = c[1]
        this.sConnect = c[3]
        this.sGit = c[5]
        this.sid = 0
    }

    constructor(id: Int, infa: String) : super(id, infa)
    {
        this.sid = id
        val c = infa.split("|")
        this.sFIO = c[1]
        this.sConnect = c[3]
        this.sGit = c[5]
    }

    override fun toString(): String {
        return "ФИО: ${sFIO}\n" +
                "Связь: ${sConnect.split(":")[1]}\n" +
                "Гит: ${sGit}\n"
    }

}