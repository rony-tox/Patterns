open class Student: The_Student
{
    private var lastName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                throw IllegalArgumentException("Некорректные ключевые данные объекта.")
            else
                field = value
        }
    private var firstName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                throw IllegalArgumentException("Некорректные ключевые данные объекта.")
            else
                field = value
        }
    private var middleName: String = ""
        get() = field
        set(value)
        {
            if(value==null)
                throw IllegalArgumentException("Некорректные ключевые данные объекта.")
            else
                field = value
        }
    private var phone: String? = "отсутствует"
        get() = field
        set(value)
        {
            if (phone!=null && isValidPhone(phone))
                field = value
        }
    private var telegram: String? = "отсутствует"
        get() = field
        set(value)
        {
            if (telegram!=null && isValidTelegram(telegram))
                field = value
        }
    private var email: String? = "отсутствует"
        get() = field
        set(value)
        {
            if (email!=null && isValidEmail(email))
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
        this.phone=phone
        val telegram = contacts["telegram"]
        this.telegram=telegram
        val email = contacts["email"]
        this.email=email
        val git = contacts["git"]
        this.git=git
    }

    constructor(contacts: String)
    {
        val c = contacts.split(",", limit = 9)
        for (i in c)
        {
            val j = i.split("=")
            if (j[0]=="phone")
            {
                val phone = j[1]
                this.phone = phone
            }
            else if (j[0]=="telegram")
            {
                val telegram = j[1]
                this.telegram=telegram
            }
            else if (j[0]=="email")
            {
                val email = j[1]
                this.email=email
            }
            else if (j[0]=="git")
            {
                val git = j[1]
                this.git=git
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

    public fun getInfo(): String
    {
        var FIO = this.middleName + " " + this.firstName[0] + "." + this.lastName[0] + "."
        var ss = "";
        if (this.telegram!="отсутствует")
            ss = "|телеграм:" + this.telegram + "|"
        else
            if (this.phone!="отсутствует")
                ss = "|телефон:" + this.phone + "|"
            else
                if (this.email!="отсутствует")
                    ss = "|почта:" + this.email + "|"
                else
                    ss = "|способ связи:отсутствует|"
        val fin = "ФИО: |" + FIO + "|, " + ss + ", гит: |" + this.git +"|"
        //println(fin)
        return fin
    }

    fun convert_for_txt(): String
    {
        //id=11,firstName=Ana,middleName=Annotich,lastName=Annichna,phone=123,git=anagit,email=anamail@mail.ru
        var s = "id="+this.id+",firstName="+this.firstName+",middleName="+this.middleName+",lastName="+this.lastName+",phone="+this.phone+",git="+this.git+",email="+this.email+"\n"
        return s
    }
    override fun toString(): String {
        return "ФИО: ${lastName} $firstName $middleName\n" +
                "Телефон: ${phone}\n" +
                "Телеграм: ${telegram}\n" +
                "Почта: ${email}\n" +
                "Гит: ${git}\n"
    }

}
