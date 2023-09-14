// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //1
        Cat cat = new Cat(30,3);
        Dog dog = new Dog(40,20);
        Elephant elephant = new Elephant(300,5000);
        Wolf wolf = new Wolf(40,20);
        Rabbit rabbit = new Rabbit(30,7);

        rabbit.born();
        wolf.howlVolume = 7;
        wolf.say();
        rabbit.die();

        //2
        Gazelle gazelle = new Gazelle();
        gazelle.seats = 3;
        gazelle.loadCargo(1500);

        Moto moto = new Moto();
        moto.model = "CB750";
        moto.makeWroomWroom();
    }
}