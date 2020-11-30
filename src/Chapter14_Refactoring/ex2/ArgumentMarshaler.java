package Chapter14_Refactoring.ex2;

import java.util.Iterator;

public interface ArgumentMarshaler {
    void set(Iterator<String> currentArgument) throws ArgsException;

    Object get();
}
