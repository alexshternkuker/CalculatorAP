import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Калькулятор, который может складывать, вычитать, умножать и делить (введите в одну строку через пробел задачу из двух чисел от 1 до 9, например, 2 + 3): ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        if (parts.length != 3) {
            System.out.println("Неверный формат ввода. throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            return;
        }

        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        // Проверка на диапазон чисел от 1 до 9
        if (num1 < 0 || num1 > 9 || num2 < 0 || num2 > 9) {
            System.out.println("Ошибка: Числа должны быть в диапазоне от 1 до 9.");
            return;
        }

        int result;

        switch (operator) {  // метод   switch перебирает все комбинации с числами
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Ошибка: Неверный оператор.");
                return;
        }

        System.out.println("Результат: " + result);
    }
}

// калькулятор поддерживает отрицательные числа и ноль