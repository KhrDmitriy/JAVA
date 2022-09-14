
// 2. Напишите функцию, для поиска наиболее длинного общего префикса среди массива строк.
// Если общего префикса нет, то возвращать пустую строку.
// Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"

import java.lang.String;
import java.lang.Character;

public class Java_H_W_1_2 {
    public static void Prefix(String[] arr) {
        String word1 = arr[0];
        int count = 0;
        boolean flag = true;

        for (int i = 0; i < word1.length(); i++) {
            for (String line : arr) {
                if(flag == false) break;
                // int x = Character.compare(word1.charAt(i), line.charAt(i));
                Character c1 = word1.charAt(0);
                Character c2 = line.charAt(i);
                flag = c1.equals(c2);
                if (flag) {
                    continue;
                }
                else {
                    flag = false;
                }
            }
            if(flag == false) break;
            count++;
        }
        String str = arr[0];
        StringBuilder sb = new StringBuilder();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                sb.append(str.charAt(0));
            }
            System.out.print(sb.toString());
        }
        else {
            System.out.println("нет общего префикса");
        }
    }
    public static void main(String[] args) {
        String[] arrStr = new String[]{"aabb", "aabbb", "aaabb"};
        Prefix(arrStr);
    }
}
