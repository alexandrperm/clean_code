public class Dog extends Animal{
    public Dog(int height, int weight) {
        super(height,weight);
    }
    public int trainingDegree;//степень послушания
    @Override
    public void born(){
        System.out.println("Собака родилась");
    }
    @Override
    public void say(){
        System.out.println("Гав");
    }
    @Override
    public void die(){
        System.out.println("Собака умерла");
    }
}
