package Project;

public class ToyotaCity extends CarShowroom {
    public ToyotaCity(Car cars) {
        super(cars);
    }

    @Override
    public void shown() {
        System.out.println("This car produced in ToyotaCity");
    }
}
