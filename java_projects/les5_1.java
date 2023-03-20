package java_projects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class les5_1 {
    public static void main(String[] args) {
        Boolean loop = true;
        Scanner userInput = new Scanner(System.in);
        Integer option = 0;
        HashMap<String, List<Integer>> book = new HashMap<>();

        while (loop) {
            System.out.println("Введите опцию: \n 1) Добавить контакт \n 2) Вывести всё ");
            option = userInput.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите имя: ");
                    String name = userInput.next();
                    System.out.println("Введите номер: ");
                    Integer number = userInput.nextInt();

                    if (book.containsKey(name)) {
                        List<Integer> numberList = book.get(name);
                        numberList.add(number);
                        book.put(name, numberList);
                    } else {
                        List<Integer> numberList = new ArrayList<>();
                        numberList.add(number);
                        book.put(name, numberList);
                    }
                    break;

                case 2:
                    System.out.println(book);
                    break;
            }
        }
        userInput.close();
    }
}


