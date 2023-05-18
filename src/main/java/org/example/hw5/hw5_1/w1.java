package org.example.hw5.hw5_1;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class w1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Разбить текст на слова и удалить знаки препинания
        String[] words = Pattern.compile("[^A-Za-zА-Яа-я0-9]+").split(text);

        // Подсчитать количество каждого слова
        for (String word : words) {
            if (!word.isEmpty()) {
                String lowercaseWord = word.toLowerCase();
                if (wordCountMap.containsKey(lowercaseWord)) {
                    wordCountMap.put(lowercaseWord, wordCountMap.get(lowercaseWord) + 1);
                } else {
                    wordCountMap.put(lowercaseWord, 1);
                }
            }
        }

        // Вывести результаты подсчета
        System.out.print("Введите искомое слово: ");
        String searchWord = scanner.next().toLowerCase();
        if (wordCountMap.containsKey(searchWord)) {
            int wordCount = wordCountMap.get(searchWord);
            System.out.printf("Слово \"%s\" встретилось %d раз(а)\n", searchWord, wordCount);
        } else {
            System.out.printf("Слово \"%s\" не найдено\n", searchWord);
        }
    }
}