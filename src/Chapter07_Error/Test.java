package Chapter07_Error;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// null 대신 빈 객체
public class Test {
    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        return employees.size() == 0 ? Collections.EMPTY_LIST : employees;
    }

    public static void main(String[] args) {
        long totalPay = 0;

        List<Employee> employees = getEmployees();
        for (Employee e : employees) {
            totalPay += e.getPay();
        }

        System.out.println(totalPay);
    }
}
