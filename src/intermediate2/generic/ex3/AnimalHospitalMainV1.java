package intermediate2.generic.ex3;

import intermediate2.generic.animal.Animal;
import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV1 {

    static void main() {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 300);
        //Dog dog2 = new Dog("멍멍이2", 10, 60);

        dogHospital.set(dog);
        dogHospital.checkup();
        //dogHospital.bigger(dog2);

        catHospital.set(cat);
        catHospital.checkup();

        // 문제 1 : 개 병원에 고양이 전달
         dogHospital.set(cat); // 매개변수 체크 실패 : 컴파일 오류가 발생하지 않음!!

        // 문제 2 : 개 타입 반환 , 다운캐스팅 필요
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
