package Chapter10_Class.ex2;

// 리팩토링하여 응집도를 높임.
public class PrimePrinter2 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1000;
        int[] primes = PrimeGenerator.generate(NUMBER_OF_PRIMES);

        final int ROWS_PER_PAGE = 50;
        final int COLUMNS_PER_PAGE = 4;
        RowColumnPagePrinter tablePrinter = new RowColumnPagePrinter(ROWS_PER_PAGE,
                COLUMNS_PER_PAGE, "The First " + NUMBER_OF_PRIMES + " Prime Numbers");

        tablePrinter.print(primes);
    }
}
