package intermediate2.generic.ex3;

import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV3 {

    static void main() {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        // 관게 없는 Integer 못 넣도록 제한 완료됨
        //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV2();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();
        //dogHospital.bigger(dog2);

        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
        //dogHospital.set(cat); // 다른 타입 입력 : 컴파일 오류 발생하여 안전해짐

        // 문제 2 : 개 타입 반환 , 다운캐스팅 필요 없어짐
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
