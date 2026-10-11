package intermediate2.generic.ex2;

import intermediate2.generic.animal.Animal;
import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class AnimalMain2 {

    static void main() {

        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
