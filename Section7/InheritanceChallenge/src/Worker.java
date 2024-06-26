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

    public Worker(){}

    //There could be another constructor that includes endDate but ONLY for creating historical data
    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay(){
        return 0.0d;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
