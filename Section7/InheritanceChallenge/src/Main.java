public class Main {
    /*
    Create a worker class, the Employee class and/or the salaried employee or the hourly employee class

    For each class, create the attributes and methods shown on the diagram

    create either a salaried employee or hourly employee and call the methods, getAge, collectPay,
    and the method shown for the specific type of class

    ex: salaried = retire. Hourly = getDoublePay
     */
    public static void main(String[] args) {
        SalariedEmployee salary = new SalariedEmployee("Craig", "05/25/1993",10001928, "05/01/2014",100000d);
        System.out.println(salary.collectPay());
        salary.retire();
        System.out.println(salary.getIsRetired());
        System.out.println("Age = " + salary.getAge());
    }
}