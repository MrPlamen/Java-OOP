public interface Animal {
    void speak();
}

public class Dog implements Animal {
    public void speak() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }
}

public class AnimalFactory {
    public Animal createAnimal(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Unknown animal type: " + type);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");
        dog.speak(); // Output: "Woof!"

        Animal cat = factory.createAnimal("cat");
        cat.speak(); // Output: "Meow!"
    }
}
