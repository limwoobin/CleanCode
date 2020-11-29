package Chapter10_Class.ex3.refactoring;

import Chapter10_Class.ex3.Column;

public class InsertSql extends Sql {
    public InsertSql(String table, Column[] columns , Object[] fields) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return null;
    }

    private String valueList(Object[] fields , final Column[] columns) {
        return null;
    }
}
