package java_projects;


import java.util.Arrays;
import java.util.LinkedList;

public class les4_2 {
    public static void main(String[] args) {
        LinkedList<Object> myList = new LinkedList<>(Arrays.asList("Василий", "Олег", 12, 45,35,"Мир" ));
        System.out.println(myList);
        System.out.println();

        System.out.println("enqueue:");
        System.out.println(enqueue(myList, "Smile"));
        System.out.println(myList);
        System.out.println();

        System.out.println("dequeue:");
        System.out.println(dequeue(myList));
        System.out.println(myList);
        System.out.println();

        System.out.println("first:");
        System.out.println(first(myList));
        System.out.println(myList);
    }

    public static Object enqueue(LinkedList<Object> list, Object element) {
        // помещает новый элемент в конец очереди
        return list.offer(element);
    }

    public static Object dequeue(LinkedList<Object> list) {
        // возвращает первый элемент из очереди и удаляет его
        return list.poll();
    }

    public static Object first(LinkedList<Object> list) {
        // возвращает первый элемент из очереди, не удаляя
        return list.peek();
    }
}