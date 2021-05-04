package Project;

public class Bavaria extends CarShowroom {
    public Bavaria(Car cars) {
        super(cars);
    }

    @Override
    public void shown() {
        System.out.println("This car produced in Bavaria");
    }
}
