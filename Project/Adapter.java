package Project;

public class Adapter extends CarPower implements Power{
    @Override
    public void power() {
        measure();
    }
}
