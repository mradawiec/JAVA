public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("canis");
        Car ride = new Car("BMW","E36", "Nardo Grey", 1.6);
        Human jobFunds = new Human();

        Human Marek = new Human();
        Marek.pet=dog;
        Marek.pet.takeForAWalk();
        Marek.pet.feed();

        ride.newRide();
        Marek.car=ride;

        Marek.moneyFromJob=jobFunds;
        jobFunds.setSalary(3000.69);
        jobFunds.getSalary();
        jobFunds.setSalary(4001.69);
        jobFunds.getSalary();

    }
}