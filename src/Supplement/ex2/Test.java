package Supplement.ex2;

public class Test {

    public static void main(String[] args) {
        IntegerIterator iterator = new IntegerIterator();

        while (iterator.hasNext()) {
            int nextValue = iterator.next();

            // nextValue 로 뭔가를 한다
        }


        // 수정 후
        while (true) {
            int nextValue;
            synchronized (iterator) {
                if (!iterator.hasNext()) {
                    break;
                }
                nextValue = iterator.next();

                // nextValue 로 뭔가를 한다
            }
        }
    }
}
