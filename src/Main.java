import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        // Задание по билету
        System.out.println("Задание по билету");
        String[] someArray = {"Hello","World","Sarah","Hello","World","John","Hello","World","Carl"};
        someArray = new LinkedHashSet<>(Arrays.asList(someArray)).toArray(new String[0]);
        String array = Arrays.toString(someArray);
        System.out.println(array);
    }
}