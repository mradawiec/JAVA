import java.util.Date;
public class Human {
    Animal pet;
    Car car;
    Human moneyFromJob;
    Date dateOfChange = new Date();
    private Double salary;
    public Double getSalary() {
        System.out.println("Last info about seeing your salary was: " +dateOfChange+ "and salary was: "+ salary + "\n");
        return salary;
    }
    public void setSalary(Double salary) {
        if(salary>0) {
            this.salary = salary;
            System.out.println("New salary sent to HR department");
            System.out.println("Need to collect an annex to the contract from Mrs. Hania of dept. HR");
            System.out.println("ZUS and US already now about new salary");
            System.out.println("Well done, your new salary is: " + salary + "\n");
        }else
        {
            System.out.println("New salary must be higher than 0 pesos" + "\n");
        }

    }



}
