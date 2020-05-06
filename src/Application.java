import com.vehiclemanipulator.AutoVehicle;
import com.vehiclemanipulator.Person;
import com.vehiclemanipulator.Volkswagen;

public class Application {

    public static void main(String[] args) {
        AutoVehicle autoVehicle = new Volkswagen("Golf", 50, "Diesel", 5);
        Person Beni = new Person(autoVehicle);

        autoVehicle.start();

        autoVehicle.drive(10.5);

        Beni.readCurrentFuel(autoVehicle);
        Beni.accelerate();
        Beni.reduceSpeed();
        autoVehicle.stop();
    }
}
