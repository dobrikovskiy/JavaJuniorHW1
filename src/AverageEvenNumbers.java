import java.util.Arrays;
import java.util.List;

public class AverageEvenNumbers {
    public static void main(String[] args) {
        // Исходный список чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Вычисление среднего значения четных чисел
        double average = calculateAverageOfEvenNumbers(numbers);

        // Вывод результата
        System.out.println("Среднее значение четных чисел: " + average);
    }

    public static double calculateAverageOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // Фильтруем четные числа
                .mapToInt(Integer::intValue) // Преобразуем в IntStream
                .average() // Вычисляем среднее значение
                .orElse(0.0); // Если нет четных чисел, возвращаем 0.0
    }
}