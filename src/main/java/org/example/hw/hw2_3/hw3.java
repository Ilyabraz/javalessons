/* Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива. */
package org.example.hw.hw2_3;

import java.util.Arrays;
public class hw3 {

        public static void main(String[] args) {
            int[] arr = {1, -3, 20, 45, -8, 12, -15, 30};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 10 && arr[i] <= 99) {
                    sum += i;
                } else if (arr[i] < 0) {
                    arr[i] = sum;
                    sum = 0;
                }
            }

            System.out.println(Arrays.toString(arr));
        }

    }


