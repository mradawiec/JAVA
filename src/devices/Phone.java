package devices;

public class Phone extends Devices implements Rechargeable{
    Double screenSize;
    Boolean isAndroid;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize){
        super(producer,model,yearOfProduction,screenSize);
        this.screenSize = screenSize;
        this.isOn = false;
        this.isAndroid = true;
    }
    @Override
    public void turnOn() {
        System.out.println("Przekrecam kluczyk");
        System.out.println("Mam nadzieje ze akumulator nie zdechl");
        System.out.println("Mam nadzieje ze jest paliwo");
        System.out.println("Mam nadzieje ze dojade do pracy");
        System.out.println("Dobra o dziwo odpalil");
        this.isOn = true;
    }

    @Override
    public void recharge() {
        System.out.println("Szukam ładowarki");
        System.out.println("Znalazlem");
        System.out.println("Podlaczam telefon");
        System.out.println("Telefon sie laduje");
    }
}
