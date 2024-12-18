public class Main {
    public static void main(String[] args) {
            Car car = new Car();
            Bicycle bike = new Bicycle();

            bike.stop();
            System.out.println(car.price);
            System.out.println(bike.defaultSpeed);
            System.out.println(bike.gears);
    }
}