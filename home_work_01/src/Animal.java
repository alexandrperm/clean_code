public abstract class Animal {
    private int height;
    private int weight;

    public Animal(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public abstract void born();
    public abstract void say();
    public abstract void die();
}
