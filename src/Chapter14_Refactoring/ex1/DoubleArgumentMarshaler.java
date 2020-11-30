package Chapter14_Refactoring.ex1;

import java.util.Iterator;

import static Chapter14_Refactoring.ex1.ArgsException.ErrorCode.MISSING_DOUBLE;

public class DoubleArgumentMarshaler implements ArgumentMarshaler {
    private double doubleValue = 0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            doubleValue = Double.parseDouble(currentArgument.next());
        } catch (NumberFormatException e) {
            throw new ArgsException(MISSING_DOUBLE);
        }
    }

    public static double getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof DoubleArgumentMarshaler) {
            return ((DoubleArgumentMarshaler) am).doubleValue;
        } else  {
            return 0;
        }
    }
}
