import creatures.Animal;
import creatures.Pet;
import devices.Car;
import devices.Devices;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Human jobFunds = new Human();

        Human Marek = new Human();
        Pet dog = new Pet("canis");
        Marek.pet = dog;
        Marek.pet.takeForAWalk();
        Marek.pet.feed();

        Marek.moneyFromJob=jobFunds;
        jobFunds.setSalary(3000.69);
        jobFunds.getSalary();
        jobFunds.setSalary(4001.69);
        jobFunds.getSalary();

        Human h = new Human();
        Car car1 = new Car("E36", "BMW", 1999, 1500.0);
        Car car2 = new Car("E36", "BMW", 1999, 1500.0);

        if( !car1.equals(car2) ){
            System.out.println("Takie same");
        }
        else{
            System.out.println("Inne");
        }
        System.out.println(car1);


        Car car = new Car("E36", "BMW", 1999, 1500.0);
        System.out.println(car);
        Phone nokia = new Phone("Nokia", "3310", 1980, 1.2);
        System.out.println(nokia);

        Car fiat = new Car("Doblo", "Fiat", 2017, 15000.0);
        fiat.turnOn();
    }
}