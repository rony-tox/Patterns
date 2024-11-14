import java.io.File
fun read_from_txt(pathway: String): Array<Student>
{
    var nabor = emptyArray<Student>();
    var con = File(pathway).readLines()
    //println(con)
    for (i in con)
    {
        nabor += Student(i)
    }
    return nabor;
}
fun write_to_txt(nab: Array<Student>, pathway: String): Void?
{
    File(pathway).printWriter()
    var s = ""
    for (i in nab)
    {
        s = i.convert_for_txt()
        File(pathway).appendText(s)
    }
    return null;
}

fun main() {
    // Создание объектов с различными комбинациями заполнения полей
    val student1 = Student(1, "Кто", "Это", "Вообще")
    val student2 = Student(2, "Ну", "Хоть", "Что-то", hashMapOf("phone" to "88005553535"))
    val student3 = Student(3, "Чел", "Полностью", "Укомплектован", hashMapOf("phone" to "+76669994422", "telegram" to "@telejka", "email" to "emyelya@pech.ru", "git" to "githubovy_chel"))
    val student4 = Student("id=4,firstName=Awa,middleName=Awawowush,lastName=Awawowich,phone=88888,git=awawa,email=awawanya@awa.wa")
    student3.setContacts(hashMapOf("phone" to "+7666999j4422"))
    student2.setContacts(hashMapOf("telegram" to "@wow_tg"))

    // Вывод информации о студентах
    println(student1)
    println()
    println(student2)
    println()
    println(student3)
    println()
    println(student4)
    println()

    println(student1.getInfo())
    println()

    val shst1 = Student_short(1, student2.getInfo())
    println()
    println(shst1)
    val shst2 = Student_short(student3)
    println()
    println(shst2)

    var first_nab = read_from_txt("C:\\ъяъ\\УНИВЕРСИТЕТ\\Patterns\\PatL1\\PatL1\\read_from.txt")
    println(first_nab.contentToString())
    write_to_txt(first_nab,"C:\\ъяъ\\УНИВЕРСИТЕТ\\Patterns\\PatL1\\PatL1\\write_to.txt")
}

