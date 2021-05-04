package Project;

public class Main {
    public static void main(String[] args) {

        Power power = new Adapter();
        power.power();

        CarShowroom car = new Bavaria(new BMW());
        car.make();
        car.shown();
        Details aboutcar = new Details.CarBuilder("M5","Black",2020).build();
        System.out.println(aboutcar);

        CarShowroom car1 = new ToyotaCity(new Toyota());
        car1.make();
        car1.shown();
        Details aboutcar1 = new Details.CarBuilder("Camry","White",2020).build();
        System.out.println(aboutcar1);
    }
}
