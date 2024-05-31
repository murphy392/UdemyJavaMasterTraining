public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = false;
    }

    public void retire(){
        terminate("12/12/2025");
        this.isRetired = true;
    }

    public boolean getIsRetired(){
        return isRetired;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary /26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }
}
