class Student
{
    //private var _id : Int = 0

    var id: Int = 0
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    var lastName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    var firstName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    var middleName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    var phone: String? = null
        get() = field
        set(value)
        {
            if(value!=null)
                field = value
        }
    var telegram: String? = null
        get() = field
        set(value)
        {
            if(value!=null)
                field = value
        }
    var email: String? = null
        get() = field
        set(value)
        {
            if(value!=null)
                field = value
        }
    var git: String? = null
        get() = field
        set(value)
        {
            if(value!=null)
                field = value
        }

    constructor(id: Int, lastName: String, firstName: String, middleName: String)
    {
        this.id = id
        this.lastName = lastName
        this.firstName = firstName
        this.middleName = middleName
    }

    constructor(id: Int, lastName: String, firstName: String, middleName: String, phone: String?): this(id, lastName, firstName, middleName)
    {
        this.phone = phone
    }

    constructor(id: Int, lastName: String, firstName: String, middleName: String, phone: String?, telegram: String?, email: String?, git: String?): this(id, lastName, firstName, middleName)
    {
        this.phone = phone
        this.telegram = telegram
        this.email = email
        this.git = git
    }






    override fun toString(): String {
        return "ФИО: ${lastName} $firstName $middleName\n" +
                "Телефон: ${phone?: "отсутствует"}\n" +
                "Телеграм: ${telegram?: "отсутствует"}\n" +
                "Почта: ${email?: "отсутствует"}\n" +
                "Гит: ${git?: "отсутствует"}\n"
    }

    companion object
    {
        fun isValidPhone(phone: String?): Boolean
        {
            return phone != null && phone.matches(Regex("^\\+7\\d{10}$"))
        }
    }

}
