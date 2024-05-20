public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    //create retire method


    public SalariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire(){
        this.isRetired = true;
    }
}
