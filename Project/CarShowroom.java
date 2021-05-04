package Project;

public abstract class CarShowroom {
    protected Car cars;
    public CarShowroom(Car cars){
        this.cars = cars;
    }

    public Car getCars() {
        return cars;
    }

    public void setCars(Car cars) {
        this.cars = cars;
    }

    public void make(){
        cars.carinfo();

    }
    public abstract void shown();

}
