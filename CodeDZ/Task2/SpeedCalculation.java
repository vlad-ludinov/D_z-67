package Task2;

public class SpeedCalculation {

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed() * vehicle.getCoefficientAllowed();
    }
}



