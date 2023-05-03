class Demo {
    private String name;
    private int age;

    public void setMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void display() {
        System.out.println(name + " -> " + age);
    }
}

class staticDemo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setMethod("Sandeep", 24);
        demo.display();
    }
}

// https://teams.microsoft.com/l/meetup-join/19%3ameeting_MWRiZTg0MjgtNzViZS00MzMwLTgzNTQtMmYyY2U4ZmEyYWNk%40thread.v2/0?context=%7b%22Tid%22%3a%225b973f99-77df-4beb-b27d-aa0c70b8482c%22%2c%22Oid%22%3a%22a5b79378-e4c0-4b86-b077-949b0f255251%22%7d