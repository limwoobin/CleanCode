package Chapter03_Function.impl;

import Chapter03_Function.Employee;
import Chapter03_Function.EmployeeRecord;
import Chapter03_Function.Money;

public class HourlyEmployee extends Employee {
    private EmployeeRecord employeeRecord;

    public HourlyEmployee(EmployeeRecord employeeRecord) {
        this.employeeRecord = employeeRecord;
    }

    @Override
    public boolean isPayday() {
        return false;
    }

    @Override
    public Money calculatePay() {
        return null;
    }

    @Override
    public void deliverPay(Money pay) {

    }
}
