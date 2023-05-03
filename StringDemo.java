class StringDemo {
    public static void main(String[] args) {
        String name = "Sandeep";

        System.out.println(name.hashCode());
        name = name + " 7001024709";

        System.out.println(name.hashCode());

        String s1 = new String("Sandeep");
        String s2 = new String("Chakraborty");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println(s1.charAt(5));
        System.out.println(s1.substring(2));

        String s3 = "Java";
        String s4 = "Java";
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));
    }
}