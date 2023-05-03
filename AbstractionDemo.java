abstract class Car {
    abstract void show();
}

class Function extends Car {

    @Override
    void show() {
        System.out.println("Abstraction Demo");
    }

}

public class AbstractionDemo {
    public static void main(String[] args) {
        Car car = new Function();
        car.show();
    }
}
