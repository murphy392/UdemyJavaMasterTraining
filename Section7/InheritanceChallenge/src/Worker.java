public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    /*
    create below methods
    public int getAge()
    public double collectPay()
    public void terminate(String endDate) - done
     */

    //There could be another constructor that includes endDate but ONLY for creating historical data
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        //implement logic to get the age
        return 0;
    }

    public double collectPay(){
        //implement logic to collect pay
        return 0.0d;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }
}
