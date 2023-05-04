package CollectionsDemo.ListInterface;

import java.util.ArrayList;

class arrayList {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        list.add(1, "Rohit");

        // // Ways to Print ArrayList
        // // 1. Simple println
        // System.out.println(list);

        // // 2. Using Iterator
        // Iterator<String> itr = list.iterator();
        // while (itr.hasNext()) {
        // System.out.println(itr.next());
        // }

        // System.out.println();

        // // 3. Using for-each loop
        // for (String n : list) {
        // System.out.println(n);
        // }

        // Methods in ArrayList
        // 1. set(index, new_element) for editing elements in ArrayList
        list.set(0, "Sandeep");
        System.out.println(list);

        // 2. get(index) for getting the element of the given index
        System.out.println(list.get(0));

        // 3. indexOf(element) for getting index of the given element
        System.out.println(list.indexOf("Ravi"));

        // 4. contains(element) for getting bool if given element exists in the
        // ArrayList
        System.out.println(list.contains("Sandeep"));

        // 5. remove(element/index) for removing the given element/index
        list.remove(0);
        System.out.println(list);

        // size() for getting the size of the ArrayList
        System.out.println(list.size());
    }
}
