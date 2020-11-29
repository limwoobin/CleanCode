package Chapter10_Class.ex3.refactoring;

import Chapter10_Class.ex3.Column;

public class SelectWithCriterialSql extends Sql {

    public SelectWithCriterialSql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return null;
    }
}
