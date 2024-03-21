def calculateFactorial(int number) {
    if (number < 0) {
        return "Факториал не определен для отрицательных чисел"
    } else if (number == 0 || number == 1) {
        return 1
    } else {
        def factorial = 1
        for (int i = 2; i <= number; i++) {
            factorial *= i
        }
        return factorial
    }
}

// Пример вызова функции calculateFactorial
def result = calculateFactorial(5)
println("Факториал числа 5: $result")

