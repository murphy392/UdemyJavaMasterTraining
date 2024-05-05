public class Main {
    /*
    create a new class for a bank account
    create fields for account characteristics like:
        account number
        account name
        customer name
        customer e-mail
        customer phone #
    create getters and setters for each field
    create methods for depositing/withdrawing funds from the account
    Do not allow the customer to withdraw funds if the withdrawal makes their account go to a negative balance
    print info to the console that confirms what the balance is after the methods are called
     */
    public static void main(String[] args) {
        Account account = new Account();
        Account craigAccount = new Account("Checking Account", "0000000001A", 1000.00d, "Craig Murphy", "craig.murphy@gmail.com", "123-456-7890");
//        account.setAccountName("Checking Account");
//        account.setAccountNumber("0000000001A");
//        account.setCustomerEmail("craig.murphy@gmail.com");
//        account.setCustomerName("Craig Murphy"); //This would normally be split into first/last name fields
//        account.setCustomerPhoneNo("123-456-7890"); //There would also normally be validation on phone and e-mail
//        account.setAccountBalance(1000.00d);

        System.out.println(account.deposit(.50));
        System.out.println(account.withdraw(500.0));
        //checking initial account creation
        //System.out.println(account.toString());

    }
}