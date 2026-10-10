package intermediate2.generic.ex1;

public class BoxMain2 {

    static void main() {

        ObjectBox objectBox1 = new ObjectBox();
        objectBox1.set(10);
        Object object1 = objectBox1.get();
        System.out.println("object1 = " + object1);


        ObjectBox objectBox = new ObjectBox();
        objectBox.set("hello");
        Object object = objectBox.get();
        System.out.println("object = " + object);
    }
}
