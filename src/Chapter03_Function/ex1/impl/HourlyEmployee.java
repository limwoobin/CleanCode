package Chapter03_Function.ex1.impl;

import Chapter03_Function.ex1.Employee;
import Chapter03_Function.ex1.EmployeeRecord;
import Chapter03_Function.ex1.Money;

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
