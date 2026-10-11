package intermediate2.generic.ex3;

import intermediate2.generic.animal.Cat;
import intermediate2.generic.animal.Dog;

public class AnimalHospitalMainV2 {

    static void main() {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2();

        // 동물과 전혀 관계없는 타입을 타입 인자로 전달 가능한 문제
        AnimalHospitalV2<String> stringHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Object> objectHospital = new AnimalHospitalV2();
    }
}
