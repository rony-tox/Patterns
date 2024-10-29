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

    constructor(contacts: String)
    {
        val c = contacts.split(",", limit = 8)
        for (i in c)
        {
            val j = i.split("=")
            if (j[0]=="phone")
            {
                val phone = j[1]
                if (phone != null && isValidPhone(phone))
                    this.phone = phone
                else
                    this.phone = "отсутствует"
            }
            else if (j[0]=="telegram")
            {
                val telegram = j[1]
                if (telegram!=null && isValidTelegram(telegram))
                    this.telegram=telegram
                else
                    this.telegram = "отсутствует"
            }
            else if (j[0]=="email")
            {
                val email = j[1]
                if (email!=null && isValidEmail(email))
                    this.email=email
                else
                    this.email = "отсутствует"
            }
            else if (j[0]=="git")
            {
                val git = j[1]
                if (git!=null && isValidGit(git))
                    this.git=git
                else
                    this.git = "отсутствует"
            }
            else if (j[0]=="id")
            {
                this.id = j[1].toInt()
            }
            else if (j[0]=="lastName")
            {
                this.lastName = j[1]
            }
            else if (j[0]=="firstName")
            {
                this.firstName = j[1]
            }
            else if (j[0]=="middleName")
            {
                this.middleName = j[1]
            }
        }
        if (this.firstName=="" || this.firstName=="" || this.firstName=="" || this.id <=0)
        {
            println("Произошла потеря ключевых данных. Проверьте введённые данные.")
            this.firstName == "______"
            this.middleName == "______"
            this.lastName == "______"
            this.id == -1
        }
    }

    fun setContacts(contacts: HashMap<String, String>): Void?
    {
        val phone = contacts["phone"]
        if (phone!=null && isValidPhone(phone))
            this.phone=phone


        val telegram = contacts["telegram"]
        if (telegram!=null && isValidTelegram(telegram))
            this.telegram=telegram


        val email = contacts["email"]
        if (email!=null && isValidEmail(email))
            this.email=email


        val git = contacts["git"]
        if (git!=null && isValidGit(git))
            this.git=git

        return null;
    }


    fun validate(): Void?
    {
        if (this.telegram == "отсутствует")
        {
            if (this.phone == "отсутствует")
                if (this.email == "отсутствует")
                    if (this.git == "отсутствует")
                    {
                        println("Ничего нет")
                        return null
                    }
            println("Телеграма нет, проверьте информацию о других методах связи.")
        }
        return null
    }

    fun validateContact(): Boolean
    {
        if (this.telegram == "отсутствует")
            if (this.phone == "отсутствует")
                if (this.email == "отсутствует")
                    if (this.git == "отсутствует")
                        return false
        return true
    }

    fun validateTelegram(): Boolean {
        if (this.telegram == "отсутствует")
            return false
        return true
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
