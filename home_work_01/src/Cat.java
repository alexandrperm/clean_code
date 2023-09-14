public class Cat extends Animal {
    public Cat(int height, int weight) {
        super(height,weight);
    }
    public int mouseCatchCnt;//число пойманных мышей
    @Override
    public void born(){
        System.out.println("Кот родился");
    }
    @Override
    public void say(){
        System.out.println("Мяу");
    }
    @Override
    public void die(){
        System.out.println("Кот умер");
    }
}
