public class Car {
    private Engine engine;
    private Battery battery;

    public void start(){
        engine.start();
        battery.charge();
    }
}
