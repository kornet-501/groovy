def scanner = new Scanner(System.in)

while (true) {
    println("Введите номер дня недели (1 - понедельник, 2 - вторник и т.д.):")
    def dayOfWeek = scanner.nextInt()

    switch (dayOfWeek) {
        case 1:
            println("Понедельник")
            break
        case 2:
            println("Вторник")
            break
        case 3:
            println("Среда")
            break
        case 4:
            println("Четверг")
            break
        case 5:
            println("Пятница")
            break
        case 6:
            println("Суббота")
            break
        case 7:
            println("Воскресенье")
            break
        default:
            println("Некорректный номер дня недели")
    }

    println("Хотите ввести еще один день? (yes/no):")
    def response = scanner.next()
    if (response.toLowerCase() != "yes") {
        break
    }
}
