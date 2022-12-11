import creatures.Animal;
import devices.Car;

public class Human{
    Animal pet;
    Human cash;
    private Car car;
    Human moneyFromJob;
    private Double salary;

    public Double getSalary() {
        System.out.println("Last info about seeing your salary was: thursday and salary was: "+ salary + "\n");
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("New salary sent to HR department");
            System.out.println("Need to collect an annex to the contract from Mrs. Hania of dept. HR");
            System.out.println("ZUS and US already now about new salary");
            System.out.println("Well done, your new salary is: " + salary + "\n");
        } else {
            System.out.println("New salary must be higher than 0 pesos" + "\n");
        }
    }
 /*      public void setCar (Car car){
            if (this.salary > car.value) {
                System.out.println("devices.Car has been bought");
                this.car = car;
            } else if (this.salary > (car.value / 12) * car.value) {
                System.out.println("devices.Car has been take by installment");
                this.car = car;
            } else {
                System.out.println("Go find job!");
            }
        }*/
        public String toString(){
        return salary + "\n";
        }
}
