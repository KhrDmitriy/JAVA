package JAVA_H_W_3;
//1. Пусть дан произвольный список целых чисел, удалить из него четные числа.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_H_W_3_1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        Integer[] arr = list.toArray(new Integer[0]);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0) {
                System.out.println("Нечетное число: "+arr[i]);
            }
        }
    }
}
