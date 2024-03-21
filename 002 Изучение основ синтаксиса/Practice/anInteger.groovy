// Создаем объект Scanner для ввода данных
def scanner = new Scanner(System.in)

// Запрашиваем у пользователя ввод целого числа
println("Введите целое число:")
def userInput = scanner.nextInt()

// Выводим на экран числа от 1 до введенного пользователем числа
println("Числа от 1 до $userInput включительно:")
for (int i = 1; i <= userInput; i++) {
    println(i)
}
