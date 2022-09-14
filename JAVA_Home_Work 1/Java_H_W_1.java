public class Java_H_W_1 {
    public static void main(String[] args) {
        // 1. Задан массив, например, nums = [1,7,3,6,5,6]. Написать программу,
        // которая найдет индекс i для этого массива такой,
        // что сумма элементов с индексами < i равна сумме элементов с индексами > i.

        int[] nums = new int[]{1,2,1,7,3,6,5,6,3,11};

        int sum = 0;
        for(int i : nums){
            sum += i;
        }

        int sum1 = 0;
        int sum2 = 0;
        int count = 0;

        while(sum1 == sum2){
            for(int i = 1; i < nums.length - 2; i++){
                sum1 += nums[i];
                sum2 += nums[nums.length - 1];
                count++;
            }
        }
        System.out.println(count);
    }
}