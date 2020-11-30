package Chapter14.ex1;

public class Test {
    public static void main(String[] args) {
        args = new String[]{"-x" , "42.3"};

        try {
            Args arg = new Args("x##" , args);
//            assertTrue(arg.isValid());
        } catch (ArgsException e) {
            e.errorMessage();
        }
    }
}
