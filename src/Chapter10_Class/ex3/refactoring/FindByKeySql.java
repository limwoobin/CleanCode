package Chapter10_Class.ex3.refactoring;

import Chapter10_Class.ex3.Column;

public class FindByKeySql extends Sql {
    public FindByKeySql(String table, Column[] columns) {
        super(table, columns);
    }

    @Override
    public String generate() {
        return null;
    }
}
