open class The_Student
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
    protected open var git: String = "отсутствует"
        get() = field
        set(value)
        {
            field = value
        }
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

    constructor(s: Student)
    {
        val infa = s.getInfo()
        val c = infa.split("|")
        this.sFIO = c[1]
        this.sConnect = c[3]
        this.sGit = c[5]
        this.sid = 0
    }

    constructor(id: Int, infa: String)
    {
        this.sid = id
        val c = infa.split("|")
        this.sFIO = c[1]
        this.sConnect = c[3]
        this.sGit = c[5]
    }

    constructor(id: Int, lastName: String, firstName: String, middleName: String)
    {
        if (firstName=="" || firstName=="" || firstName=="" || id <=0)
        {
            throw IllegalArgumentException("Некорректные ключевые данные были использованы при создании [1] объекта.")
        }
        this.id = id
        this.lastName = lastName
        this.firstName = firstName
        this.middleName = middleName
    }

    constructor(id: Int, lastName: String, firstName: String, middleName: String, contacts: HashMap<String, String>)
    {
        if (firstName=="" || firstName=="" || firstName=="" || id <=0)
        {
            throw IllegalArgumentException("Некорректные ключевые данные были использованы при создании [2] объекта.")
        }
        val phone = contacts["phone"]
        if (phone!=null)
            this.phone=phone
        else
            this.phone = "отсутствует"

        val telegram = contacts["telegram"]
        if (telegram!=null)
            this.telegram=telegram
        else
            this.telegram = "отсутствует"

        val email = contacts["email"]
        if (email!=null)
            this.email=email
        else
            this.email = "отсутствует"

        val git = contacts["git"]
        if (git!=null)
            this.git=git
        else
            this.git = "отсутствует"

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
                if (phone != null)
                    this.phone = phone
                else
                    this.phone = "отсутствует"
            }
            else if (j[0]=="telegram")
            {
                val telegram = j[1]
                if (telegram!=null)
                    this.telegram=telegram
                else
                    this.telegram = "отсутствует"
            }
            else if (j[0]=="email")
            {
                val email = j[1]
                if (email!=null)
                    this.email=email
                else
                    this.email = "отсутствует"
            }
            else if (j[0]=="git")
            {
                val git = j[1]
                if (git!=null)
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
            throw IllegalArgumentException("Некорректные ключевые данные были использованы при создании [3] объекта.")
        }
    }

}