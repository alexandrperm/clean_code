public class Wolf extends Animal{

    public Wolf(int height, int weight) {
        super(height,weight);
    }
    public int howlVolume;//громкость воя
    @Override
    public void born(){
        System.out.println("Волк родился");
    }
    @Override
    public void say(){
        System.out.println("yyyy");
    }
    @Override
    public void die(){
        System.out.println("Волк умер");
    }
}
