import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class p04_appliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String line = scanner.nextLine();

        Function<int[], int[]> add = arr -> Arrays
                .stream(arr)
                .map(e -> ++e)
                .toArray();

        UnaryOperator<int[]> sub = arr -> Arrays
                .stream(arr)
                .map(e -> --e)
                .toArray();


        UnaryOperator<int[]> multiply = arr -> Arrays
                .stream(arr)
                .map(e -> e *= 2)
                .toArray();

        Consumer<int[]> printer = arr-> Arrays
                .stream(arr)
                .forEach(e -> System.out.print(e + " "));


        while (!line.equals("end")) {

            switch (line) {
                case "add":
                    numbers = add.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiply.apply(numbers);
                    break;
                case "subtract":
                    numbers = sub.apply(numbers);
                    break;
                case "print":
                    printer.accept(numbers);
                    System.out.println();
                    break;
            }

            line = scanner.nextLine();
        }
    }
}
