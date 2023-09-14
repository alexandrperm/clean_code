public class Rabbit extends Animal{

    public Rabbit(int height, int weight) {
        super(height,weight);
    }
    public void eatCarrots(){

    }
    @Override
    public void born(){
        System.out.println("Кролик родился");
    }
    @Override
    public void say(){
        System.out.println("хр-хр");
    }
    @Override
    public void die(){
        System.out.println("Кролик умер");
    }
}
