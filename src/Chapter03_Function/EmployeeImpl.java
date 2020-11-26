package Chapter03_Function;

import Chapter03_Function.impl.CommissionedEmployee;
import Chapter03_Function.impl.HourlyEmployee;
import Chapter03_Function.impl.SalariedEmployee;

public class EmployeeImpl implements EmployeeFactory {

    @Override
    public Employee makeEmployee(EmployeeRecord r) {
        switch (r.type) {
            case COMMISSIONED:
                return new CommissionedEmployee(r);
            case HOURLY:
                return new HourlyEmployee(r);
            case SALARIED:
                return new SalariedEmployee(r);
            default:
                return null;
        }
    }
}
