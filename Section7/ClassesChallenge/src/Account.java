public class Account {
    private String accountName;
    private String accountNumber;
    private double accountBalance = 0.0d;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNo;

    //Constructors video start
    public Account () {
        this("Test","0", 0.0d, "Test", "test@test.com","000-000-0000");
        System.out.println("Empty constructor called");
    }

    public Account(String accountName, String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNo){
        System.out.println("Account constructor with parameters called");
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerPhoneNo() {
        return customerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.customerPhoneNo = customerPhoneNo;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double withdraw(double amt){
        if (this.accountBalance <= 0.0d || (this.accountBalance - amt < 0.0d)) {
            System.out.println("Cannot withdraw more than the current balance.");
            return this.accountBalance;
        } else {
            System.out.println("Current balance = " + this.accountBalance);
            this.accountBalance = this.accountBalance - amt;
            return this.accountBalance;
        }
    }

    public double deposit(double amt){
        this.accountBalance = this.accountBalance + amt;
        return this.accountBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountName='" + accountName + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", accountBalance=" + accountBalance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhoneNo='" + customerPhoneNo + '\'' +
                '}';
    }
}
