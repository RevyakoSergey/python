package java_projects;

import java.util.Arrays;
import java.util.LinkedList;


public class les4_1 {
    public static void main(String[] args) {
        LinkedList<Object> myList = new LinkedList<>(Arrays.asList("Василий", "Олег", 12, 45,35,"Мир" ));
        System.out.println(myList);
        System.out.println(reverseList(myList));
    }

    public static Object reverseList (LinkedList<Object> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(list.size() - i, list.get(0));
            list.remove();
        }
        return list;
    }
}