/* Вывести список на экран в перевернутом виде (без массивов и ArrayList)
Пример:
1 -> 2->3->4 */
package org.example.hw4.hw4_1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class w1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер последовательности: ");
        int n = sc.nextInt();
        sc.close();
        Deque<Integer> ourDeque = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            ourDeque.add(i);
        }
        System.out.println("Вот наша последовательность: " + ourDeque);

        System.out.println("Вот перевёрнунатая последовательность: ");
        while (ourDeque.size() > 0) {
            System.out.println(ourDeque.pollLast() + "");
        }
    }
}
