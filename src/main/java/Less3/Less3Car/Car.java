package Less3.Less3Car;

public class Car {
    boolean startElectricity;
    boolean startCommand;
    boolean startFuelSystem;

    public Car(boolean startElectricity, boolean startCommand, boolean startFuelSystem) {
        this.startElectricity = startElectricity;
        this.startCommand = startCommand;
        this.startFuelSystem = startFuelSystem;
    }

    private void startElectricity(){
        if (true)
        System.out.println("Electricity on!");
        if (false)
            System.out.println("Electricity off!");
        return;
    }

    private void setStartCommand(){
        if (true)
            System.out.println("Command on !");
        if (false)
        System.out.println("Command off!");
        return;
    }

    private void setStartFuelSystem(){
        if (true)
            System.out.println("Fuel on!");
        if (false)
            System.out.println("Fuel Off!");
        return;


    }
}




