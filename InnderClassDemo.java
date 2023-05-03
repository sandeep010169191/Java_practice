class A {
    public void display() {
        System.out.println("Display method in A");
    }

    public class B {
        public void show() {
            System.out.println("Show method in B");
        }
    }
}

class InnderClassDemo {
    public static void main(String[] args) {
        A a = new A();
        a.display();

        // Method 1 for B
        a.new B().show();

        // Method 2 for B
        A.B b = a.new B();
        b.show();

        // Method 3 for B
        A.B c = a.new B();
        c.show();
    }
}
