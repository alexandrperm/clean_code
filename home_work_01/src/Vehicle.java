public class Vehicle {
    private Engine engine;
    private Battery battery;
    public String model;
    public void start(){
        engine.start();
        battery.charge();
    }
}
