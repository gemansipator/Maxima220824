package Lesson_11;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //4
        //
        //
        //1. Создай список строк в методе main.
        //2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
        //3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.

        LinkedList<String> listStrings = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            listStrings.addFirst(scanner.nextLine());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(listStrings.get(i));
        }
    }
}
