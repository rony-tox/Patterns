// Student.kt
class Student(
    var id: Int,
    var lastName: String,
    var firstName: String,
    var middleName: String,
    var phone: String? = null,
    var telegram: String? = null,
    var email: String? = null,
    var git: String? = null
) {

    // Геттеры
    fun getIdV(): Int {
        return id
    }

    fun getLastNameV(): String {
        return lastName
    }

    fun getFirstNameV(): String {
        return firstName
    }

    fun getMiddleNameV(): String {
        return middleName
    }

    fun getPhoneV(): String? {
        return phone
    }

    fun getTelegramV(): String? {
        return telegram
    }

    fun getEmailV(): String? {
        return email
    }

    fun getGitV(): String? {
        return git
    }

    // Сеттеры
    fun setIdV(id: Int) {
        this.id = id
    }

    fun setLastNameV(lastName: String) {
        this.lastName = lastName
    }

    fun setFirstNameV(firstName: String) {
        this.firstName = firstName
    }

    fun setMiddleNameV(middleName: String) {
        this.middleName = middleName
    }

    fun setPhoneV(phone: String) {
        this.phone = phone
    }

    fun setTelegramV(telegram: String) {
        this.telegram = telegram
    }

    fun setEmailV(email: String) {
        this.email = email
    }

    fun setGitV(git: String) {
        this.git = git
    }
}
