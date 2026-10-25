package intermediate2.generic.ex4;

import intermediate2.generic.animal.Animal;

public class ComplextBox<T extends Animal> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public <T> T printAndReturn(T t) {
        System.out.println("animal.classname:" + animal.getClass().getName());
        System.out.println("t.classname" + t.getClass().getName());
        System.out.println("제네릭 타입이랑 제네릭 메소드가 겹치게 T로 둘 경우 제네릭 메서드가 우선순위" +
                "를 가진다. (상식적으로 좁은 스코프니까 당연) 모호하게 애초에 같은 이름으로 하지말고 Z 같은거로 하자");
        return t;
    }
}
