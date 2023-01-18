package devices;

import java.util.List;


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
    void installAnnApp(String appName)
    {
       this.installAnnApp(appName);
    }
    void installAnnApp(String appName, double version)
    {
        this.installAnnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }
    void installAnnApp(String nameOfApp, double version, String ipAdress)
    {
        System.out.println("Instaluje aplikacje: "+nameOfApp+ " wersja: "+version+ " ip adress: "+ipAdress);
        System.out.println("Zainstalowano");
    }
    public void installAnnApp(List<String> appNames)
    {
        for(String appName: appNames)
        {
            this.installAnnApp(appName);
        }
    }

    private static final String DEFAULT_SERVER_ADDRESS = "https://milosz.appserver.com";
    private static final String DEFAULT_APP_VERSION = "latest-stable";


}
