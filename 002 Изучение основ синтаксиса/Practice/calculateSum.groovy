def calculateSum(int num1, int num2) { // имя метода
    def sum = num1 + num2 // выражение, которое складывает два переданных аргумента и сохраняет результат в переменной sum
    return sum // оператор return, который возвращает сумму num1 и num2 в вызывающий код
}

// Проверка и вызов метода calculateSum с аргументами 5 и 3
def result = calculateSum(5, 3)
println("Сумма: $result")