import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class P01_TakeTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] input = reader.readLine().split(" ");

        Arrays.stream(input)
                .map(x -> Integer.parseInt(x))
                .filter(x -> x >= 10 && x <= 20)
                .distinct()
                .limit(2)
                .forEach(x -> System.out.print(x + " "));

    }
}
