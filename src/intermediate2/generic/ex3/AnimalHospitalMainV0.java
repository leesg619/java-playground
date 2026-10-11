package intermediate2.generic.ex3;

import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV0 {

    static void main() {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 300);
        //Dog dog2 = new Dog("멍멍이2", 10, 60);

        dogHospital.set(dog);
        dogHospital.checkup();
        //dogHospital.bigger(dog2);

        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        // dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류

        // 문제 2 : 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
