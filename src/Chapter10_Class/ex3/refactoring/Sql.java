package Chapter10_Class.ex3.refactoring;

import Chapter10_Class.ex3.Column;

public abstract class Sql {
    public Sql(String table , Column[] columns) {}

    abstract public String generate();
}
