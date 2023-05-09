package org.example.hw3;

import org.example.hw3.hw3_1.Items.Items1;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class w1 {

            public static void main(String[] args) {
            Items1 item1 = new Items1("Соль", 32.0, 1);
            Items1 item2 = new Items1("Сахар", 62.99, 1);
            Items1 item3 = new Items1("Крупа гречневая высший сорт", 32.99, 3);
            Items1 item4 = new Items1("Макароны сорт высший ", 529.99, 1);
            Items1 item5 = new Items1("Соль высший спрос йодированная", 62.0, 2);
            Items1 item6 = new Items1("Устрицы высший сорт", 529.99, 2);
            Items1 item7 = new Items1("Креветки королевские высший размер", 649.99, 2);

            List<Items1> itemsList = new ArrayList<>();
            itemsList.add(item1);
            itemsList.add(item2);
            itemsList.add(item3);
            itemsList.add(item4);
            itemsList.add(item5);
            itemsList.add(item6);
            itemsList.add(item7);

            String searchName = "высший";
            Double maxPrice = 0.0;
            String maxPriceSortedNames = "";

            for (Items1 items : itemsList) {
                if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                    if (maxPrice < items.getPrice()) {
                        maxPrice = items.getPrice();
                    }
                }
            }

            for (Items1 items : itemsList) {
                if (items.getName().toLowerCase().contains(searchName) && (items.getSort() == 1 || items.getSort() == 2)) {
                    if (Objects.equals(items.getPrice(), maxPrice)) {

                        maxPriceSortedNames += items.getName() + "\n";
                    }
                }
            }
            System.out.println("Наибольшая цена товаров 1го или 2го сорта, в названии которых есть слово 'высший': ");
            System.out.println(maxPriceSortedNames);
            System.out.println("Наибольшая цена: " + maxPrice);
        }
    }

