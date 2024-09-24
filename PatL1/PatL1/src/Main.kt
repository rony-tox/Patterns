fun main() {
    // Создание объектов с различными комбинациями заполнения полей
    val student1 = Student(1, "Кто", "Ты", "Вообще")
    val student2 = Student(2, "Ну", "Хоть", "Что-то", hashMapOf("phone" to "88005553535"))
    val student3 = Student(3, "Чел", "Полностью", "Укомплектован", hashMapOf("phone" to "+76669994422", "telegram" to "telejka", "email" to "emyelya@pech.ru", "git" to "githubovy_chel"))

    // Вывод информации о студентах
    println(student1)
    println()
    println(student2)
    println()
    println(student3)
}