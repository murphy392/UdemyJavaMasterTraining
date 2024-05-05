public class Main {
    /*
    Create a new class called customer with 3 fields
    name, credit limit, e-mail address
    only getter methods
    create three constructors
    1. Create a constructor for all three fields which assign the arguments directly to the field
    2. Create a no args constructor, passing some literal values for each argument
    3. Create a constructor with just name and email parameters, which also calls another constructor
     */
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        //System.out.println(customer1.getEmail());
        Customer craig = new Customer("Craig Murphy", 10000.00d, "craig.murphy@email.com");
//        System.out.println(craig.getCreditLimit());
//        System.out.println(craig.getName());
//        System.out.println(craig.getEmail());
        Customer tim = new Customer("Tim", "tim@email.com");
        System.out.println(tim.getCreditLimit());
    }
}