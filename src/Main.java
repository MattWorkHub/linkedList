import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> fruits = new LinkedList<>();
        Fruit fruit1 = new Fruit("Pera");
        Fruit fruit2 = new Fruit("Arancia");
        Fruit fruit3 = new Fruit("Melograno");
        Fruit fruit4 = new Fruit("Melone");
        Fruit fruit5 = new Fruit("Anguria");
        fruits.add(fruit1);
        fruits.add(fruit2);
        fruits.add(fruit3);
        System.out.println(fruits);
        fruits.addFirst(fruit5);
        fruits.addLast(fruit4);
        System.out.println(fruits);
    }
}