package Lesson_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Work_4 {
    public static void main(String[] args) {
        //4
        //
        //
        //1. Введи с клавиатуры 10 слов в список строк.
        //
        //
        //2. Метод doubleValues должен удваивать слова по принципу:
        //"альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"
        //
        //
        //3. Выведи результат на экран, каждое значение с новой строки.

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }
        doubleValues(list);
    }

    private static void doubleValues(ArrayList<String> list) {

        List<String> duplicatedList = list.stream()
                .flatMap(u -> Stream.of(u,u))
                .collect(Collectors.toList());

        duplicatedList.forEach(System.out::println);

    }
}
