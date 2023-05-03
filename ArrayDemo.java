class Employee {
    int eId;
    String name;
    int salary;
}

public class ArrayDemo {
    public static void main(String[] args) {
        int nums[] = { 1, 9, 10, 16, 21 };
        // int nums1[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }

        Employee e1 = new Employee();
        e1.eId = 1;
        e1.name = "Sandeep";
        e1.salary = 25000;

        Employee e2 = new Employee();
        e2.eId = 2;
        e2.name = "Rohit";
        e2.salary = 24000;

        Employee e3 = new Employee();
        e3.eId = 3;
        e3.name = "Harsh";
        e3.salary = 25000;

        Employee empArr[] = new Employee[3];
        empArr[0] = e1;
        empArr[1] = e2;
        empArr[2] = e3;

        for (Employee employee : empArr) {
            System.out.println(employee);
            System.out.println(employee.eId + " " + employee.name + " " + employee.salary);
        }

    }
}