interface P1 {
    int display(int i, int j);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        /*
         * P1 p = (int i) -> System.out.println("display" + " " +i);
         * p.display(76);
         */
        P1 p1 = new P1() {
            public int display(int i, int j) {
                return i + j;
            }
        };
        P1 p2 = (int i, int j) -> i + j;
        int res = p1.display(10, 34);
        System.out.println(res);
        int res1 = p2.display(9, 1);
        System.out.println(res1);
    }
}