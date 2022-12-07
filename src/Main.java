public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        dog.takeForAWalk();
        dog.feed();

        Car car = new Car("BMW","E36", "Nardo Grey", 1.6);
        car.newRide();
    }
}