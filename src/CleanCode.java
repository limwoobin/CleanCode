import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CleanCode {
    public static void main(String[] args) {
        System.out.println("This is Clean Code~");

        Set<Integer> set = new HashSet<>(Arrays.asList(5));
        System.out.println(set.toString());
    }
}
