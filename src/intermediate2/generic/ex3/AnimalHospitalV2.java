package intermediate2.generic.ex3;

import intermediate2.generic.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드 정의 시점엔 알 수 없다.. Object의 기능만 사용가능
        animal.toString();

        // 컴파일 오류 발생
//        System.out.println("동물 이름 : " + animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T animal) {

        // 컴파일 오류 발생
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }
}
