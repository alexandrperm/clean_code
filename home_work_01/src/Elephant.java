public class Elephant extends Animal{
    public Elephant(int height, int weight) {
        super(height,weight);
    }
    public int trunkLength;//длина хобота
    @Override
    public void born(){
        System.out.println("Слон родился");
    }
    @Override
    public void say(){
        System.out.println("ыыы");
    }
    @Override
    public void die(){
        System.out.println("Слон умер");
    }
}
