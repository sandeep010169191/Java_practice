package Calc_pack;

public class WrapperDemo {
    static Integer i = Integer.parseInt("1");
    static int j = (Integer) 34;

    public static void main(String[] args) {
        System.out.println("Integerwith parseInt:" + i);
        System.out.println("Integer with typecast:" + j);
    }
}
