package Chapter14.ex2;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static Chapter14.ex2.ArgsException.ErrorCode.MISSING_STRING;


public class StringArgumentMarshaler implements ArgumentMarshaler {
    private String stringValue = "";

    @Override
    public void set(Iterator<String> currentArgument) throws ArgsException {
        try {
            stringValue = currentArgument.next();
        } catch (NoSuchElementException e) {
            throw new ArgsException(MISSING_STRING);
        }
    }

    @Override
    public Object get() {
        return stringValue;
    }

    public static String getValue(ArgumentMarshaler am) {
        if (am != null && am instanceof StringArgumentMarshaler) {
            return ((StringArgumentMarshaler) am).stringValue;
        } else  {
            return "";
        }
    }
}
