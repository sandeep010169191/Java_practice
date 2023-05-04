package ThreadDemo;

class childThreadOne extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Child thread 1");
        }
    }
}

class childThreadTwo extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Inside Child thread 2");
        }
    }
}

public class multiThreadDemo {
    public static void main(String[] args) {
        childThreadOne ch1 = new childThreadOne();
        childThreadTwo ch2 = new childThreadTwo();

        // System.out.println(Thread.currentThread().getName());

        // // Default
        // ch1.show();
        // ch2.show();

        // Starting new Thread
        ch1.start();
        ch2.start();
    }
}
