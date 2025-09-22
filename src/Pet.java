abstract class Pet {
    protected String name;
    protected int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();

    public void displayInfo() {
        System.out.println("Pet Name: " + name + ", Age: " + age);
    }
}

class Dog extends Pet {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

class Cat extends Pet {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow! Meow!");
    }
}

class Bird extends Pet {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: Tweet! Tweet!");
    }
}

public class Main {
    public static void main(String[] args) {
        Pet buddy = new Dog("Buddy", 3);
        Pet whiskers = new Cat("Whiskers", 2);
        Pet tweety = new Bird("Tweety", 1);

        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("===============================");
        buddy.displayInfo();
        buddy.makeSound();
        whiskers.displayInfo();
        whiskers.makeSound();
        tweety.displayInfo();
        tweety.makeSound();
    }
}

