package leetcode.array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static int[] getTargetTwoSum(int[] inputArr, int targetVal) {

        int[] result = new int[2];
        if (inputArr == null || inputArr.length < 2) {
            return result;
        }

        for (int i = 0; i < inputArr.length; i++) {
            int complement = targetVal - inputArr[i];
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[j] == complement) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int[] result = getTargetTwoSum(arr,target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }

}

/*
* https://leetcode.com/problems/two-sum/

*/


