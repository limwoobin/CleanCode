package Chapter14_Refactoring.ex1;

import java.util.Iterator;

public class IntegerArgumentMarshaler implements ArgumentMarshaler {
    private int intValue = 0;

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            intValue = Integer.parseInt(currentArgument.next());
        } catch (NumberFormatException e) {
            throw new ArgsException(ArgsException.ErrorCode.MISSING_INTEGER);
        }
    }

    public static int getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof IntegerArgumentMarshaler) {
            return ((IntegerArgumentMarshaler) am).intValue;
        } else  {
            return 0;
        }
    }
}
