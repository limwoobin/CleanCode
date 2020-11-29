package Chapter10_Class.ex3.refactoring;

import Chapter10_Class.ex3.Column;

public class SelectSql extends Sql {
    public SelectSql(String table , Column[] columns) {
        super(table , columns);
    }

    @Override
    public String generate() {
        return null;
    }
}
