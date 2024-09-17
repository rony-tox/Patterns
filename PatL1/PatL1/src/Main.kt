fun main() {
    // Создание объектов с различными комбинациями заполнения полей
    val student1 = Student(1, "Кто", "Ты", "Вообще")
    val student2 = Student(2, "Ну", "Хоть", "Что-то", "88005553535")
    val student3 = Student(3, "Чел", "Полностью", "Укомплектован", "+76664422", "telegram_username", "email@example.com", "github_username")

    // Вывод информации о студентах
    println(student1)
    println()
    println(student2)
    println()
    println(student3)
}