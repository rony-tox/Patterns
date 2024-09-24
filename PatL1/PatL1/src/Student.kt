class Student
{

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
    var contacts: HashMap <String, String?> = hashMapOf(
        "phone" to "отсутствует",
        "telegram" to "отсутствует",
        "email" to "отсутствует",
        "git" to "отсутствует",
        )


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
        if (isValidPhone(phone))
            this.contacts["phone"]=phone

        val telegram = contacts["telegram"]
        if (telegram!=null)
            this.contacts["telegram"]=telegram

        val email = contacts["email"]
        if (email!=null)
            this.contacts["email"]=email

        val git = contacts["git"]
        if (git!=null)
            this.contacts["git"]=git

    }





    override fun toString(): String {
        return "ФИО: ${lastName} $firstName $middleName\n" +
                "Телефон: ${contacts["phone"]}\n" +
                "Телеграм: ${contacts["telegram"]}\n" +
                "Почта: ${contacts["email"]}\n" +
                "Гит: ${contacts["git"]}\n"
    }

    companion object
    {
        fun isValidPhone(phone: String?): Boolean
        {
            return ( phone!=null && phone.matches(Regex("""^8\d{10}|\+7\d{10}$""")) )
        }
    }

}
