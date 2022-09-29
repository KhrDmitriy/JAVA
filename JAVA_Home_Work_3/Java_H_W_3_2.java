package JAVA_H_W_3;
//2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.


import java.util.ArrayList;

import java.util.Collections;
import java.util.Random;


public class Java_H_W_3_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 4; i++) {
            numbers.add(rd.nextInt(11));
        }
        System.out.println(numbers);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        double sum = 0;
        for (Integer i : numbers) {
            sum+= i;
        }
        System.out.println("AVG: " + sum/numbers.size());
    }


}



