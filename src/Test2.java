public class Test2 {
    public static void main(String[] args) {

        for (int i=0; i<10; i++) {
            long current = System.nanoTime();
            String s = solution("1234" , "5678");
            System.out.println(s);
            System.out.println(System.nanoTime() - current);
        }
    }

    // 35900
    public static String solution(String a, String b) {
        int value1 = Integer.parseInt(a);
        int value2 = Integer.parseInt(b);

        value1 = value1 + value2;
        return Integer.toString(value1);
    }

    // 28900
    public static String solution2(String a, String b) {
        return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
    }

    // 49100
    public static String solution3(String a, String b) {
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
