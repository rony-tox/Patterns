class Student
{
    private var id: Int = 0
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var lastName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var firstName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var middleName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                print ("Некорректный ввод.")
            else
                field = value
        }
    private var phone: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }
    private var telegram: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }
    private var email: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }
    private var git: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }


    constructor(id: Int, lastName: String, firstName: String, middleName: String)
    {
        this.id = id
        this.lastName = lastName
        this.firstName = firstName
        this.middleName = middleName
    }

    constructor(id: Int, lastName: String, firstName: String, middleName: String, contacts: HashMap<String, String>): this(id, lastName, firstName, middleName)
    {
        val phone = contacts["phone"]
        if (phone!=null && isValidPhone(phone))
            this.phone=phone
        else
            this.phone = "отсутствует"

        val telegram = contacts["telegram"]
        if (telegram!=null && isValidTelegram(telegram))
            this.telegram=telegram
        else
            this.telegram = "отсутствует"

        val email = contacts["email"]
        if (email!=null && isValidEmail(email))
            this.email=email
        else
            this.email = "отсутствует"

        val git = contacts["git"]
        if (git!=null && isValidGit(git))
            this.git=git
        else
            this.git = "отсутствует"

    }



    override fun toString(): String {
        return "ФИО: ${lastName} $firstName $middleName\n" +
                "Телефон: ${phone}\n" +
                "Телеграм: ${telegram}\n" +
                "Почта: ${email}\n" +
                "Гит: ${git}\n"
    }

    companion object
    {
        fun isValidPhone(phone: String?): Boolean
        {
            return ( phone!!.matches(Regex("""^8\d{10}|\+7\d{10}$""")) )
        }
        fun isValidTelegram(telegram: String?): Boolean
        {
            return ( telegram!!.matches(Regex("""^[@]\w+$""")) )
        }
        fun isValidEmail(email: String?): Boolean
        {
            return ( email!!.matches(Regex("""^\w+[@]\w+\.\w+$""")) )
        }
        fun isValidGit(git: String?): Boolean
        {
            return ( git!!.matches(Regex("""^\w+$""")) )
        }

    }

}
