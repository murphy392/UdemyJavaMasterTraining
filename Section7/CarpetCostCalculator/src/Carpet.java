public class Carpet {
    private double cost = 0.0d;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}
