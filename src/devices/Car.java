package devices;

public class Car extends Devices{
    Double millage;

    public Car(String model, String producer, Integer yearOfProduction, Double value) {
        super(model, producer, yearOfProduction, value);
        this.millage = 0.0;
    }

    @Override
    public void turnOn() {
        System.out.println("Wciskam guzik");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Czekam");
        System.out.println("Telefon wlaczony");
        this.isOn = true;
    }

    public boolean equals(Car obj){
        return (this == obj);
    }
    public String toString(){
        return producer + " " +  model + " " + yearOfProduction + " " + value + " " + millage + "\n";
    }

}
