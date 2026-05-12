import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class NumberUtils {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }
    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
    }
    public static int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
    public static double averageOfNumbers(List<Integer> numbers) {
        return sumOfNumbers(numbers) / (double) numbers.size();
    }
    public static int maxNumber(List<Integer> numbers) {
        return numbers.stream().max(Integer::compareTo).orElseThrow();
    }
    public static int minNumber(List<Integer> numbers) {
        return numbers.stream().min(Integer::compareTo).orElseThrow();
    }
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }
    public static List<Integer> sortNumbers(List<Integer> numbers) {
        return numbers.stream().sorted().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filterEvenNumbers(numbers));
        System.out.println(filterOddNumbers(numbers));
        System.out.println(sumOfNumbers(numbers));
        System.out.println(averageOfNumbers(numbers));
        System.out.println(maxNumber(numbers));
        System.out.println(minNumber(numbers));
        System.out.println(squareNumbers(numbers));
        System.out.println(sortNumbers(numbers));
    }
}
