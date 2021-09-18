package Transportation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        FireEngine fireEngine = new FireEngine();
        FireEngine fireEngine2 = null;

        fireEngine.fire();
        fireEngine2 = (FireEngine) car;
        fireEngine2.fire();
    }
}
