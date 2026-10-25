package intermediate2.generic.ex4;

import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class MethodMain2 {

    static void main() {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이", 200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
