package intermediate2.generic.ex4;

import intermediate2.generic.animal.Animal;
import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class MethodMain3 {

    static void main() {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        ComplextBox<Dog> hospital = new ComplextBox<>();

        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
