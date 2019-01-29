import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class p06_SortLines {
    public static void main(String[] args) {
        String basePath = "C:\\Users\\Hristo Panef\\Desktop\\Java Fundamentals Januar\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputFileName = basePath + "\\06.SortLinesOutput.txt";
        String outputFileName = basePath + "\\p06_output.txt";

        Path inputPath = Paths.get(inputFileName);
        Path outputPath = Paths.get(outputFileName);

        try {
            List<String> allLines = Files.readAllLines(inputPath);
            Collections.sort(allLines);
            Files.write(outputPath, allLines);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
