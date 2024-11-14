abstract class The_Student
{
    public var id: Int = 0
        get() = field
        protected set(value)
        {
            if(value==null)
                throw IllegalArgumentException("Некорректный ключ id.")
            else if (value<=0)
                throw IllegalArgumentException("Некорректный ключ id.")
            else
                field = value
        }
    protected var git: String? = "отсутствует"
        get() = field
        set(value)
        {
            if (value!=null && isValidGit(value))
                field = value
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