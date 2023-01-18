package devices;

public abstract class Devices{
    final String model;
    final String producer;
    Integer yearOfProduction;
    String color;
    Boolean isOn;
    Double value;

    public Devices(String model, String producer, Integer yearOfProduction, Double value) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }
    public abstract void turnOn();

}
