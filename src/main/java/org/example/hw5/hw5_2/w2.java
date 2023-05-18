package org.example.hw5.hw5_2;
import java.util.*;
public class w2 {
            public static void main(String[] args) {
            String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                    "Мария Федорова", "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"};

            Map<String, Integer> nameCountMap = new HashMap<>();

            for (String name : employees) {
                if (nameCountMap.containsKey(name)) {
                    nameCountMap.put(name, nameCountMap.get(name) + 1);
                } else {
                    nameCountMap.put(name, 1);
                }
            }

            List<Map.Entry<String, Integer>> nameCountList = new ArrayList<>(nameCountMap.entrySet());
            nameCountList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));

            for (Map.Entry<String, Integer> entry : nameCountList) {
                if (entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " - " + entry.getValue());
                }
            }
        }
    }