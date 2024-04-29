public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();

        Car car = new Car();
        car.setMake("Porsche");
        car.setColor("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("Black");
        car.describeCar();

//        porsche.setModel("Carrera");
//        System.out.println("Model is " + porsche.getModel());
    }
}