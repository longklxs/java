package check;

public class Test {
    public static void check(Animal animal){
        if(animal.getClass() == Dog.class){
            ((Dog) animal).eat();
        }else{
            ((Cat)animal).play();
        }
    }


    public static void main(String[] args) {
        Animal dog = new Dog();
        check(dog);
        Animal cat = new Cat();
        check(cat);
    }
}
