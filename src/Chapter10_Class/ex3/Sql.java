package Chapter10_Class.ex3;

// 변경이 필요해 손대야 하는 클래스
// SRP 위반 (변경할 이유가 1개가 아니라 그 이상임)
public class Sql {
    public Sql(String table , Column[] columns) {}
    public String create() { return null; }
    public String insert(Object[] fields) { return null; }
    public String selectAll() { return null; }
    public String findByKey(String keyColumn , String keyValue) { return null; }
    public String select(Column column , String pattern) { return null; }
    public String select(Criteria criteria) { return null; }
    public String preparedInsert() { return null; }
    private String columnList(Column[] columns) { return null; }
    private String valuesList(Object[] fields , final Column[] columns) { return null; }
    private String selectWithCriteria(String criteria) { return null; }
    private String placeholderList(Column[] columns) { return null; }
}
