package intermediate2.generic.ex5;

import intermediate2.generic.animal.Animal;
import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class WildcardMain2 {

    static void main() {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();

        // Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        // writeBox(dogBox); // 오류!
        // writeBox(catBox); // 오류!
        //
        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 100));

    }
}
