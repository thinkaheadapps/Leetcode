package leetcode.array;

import java.util.Scanner;

public class RemoveDuplicatesFromArray {

    public static int removeDuplicates(int[] inputArray) {
        if(inputArray == null || inputArray.length == 0){
            return 0;
        }
        int k = 1;
        for(int i = 1; i < inputArray.length; i++) {
            if(inputArray[i] != inputArray[i -1]) {
               inputArray[k] = inputArray[i];
               k++;
            }
        }
        return  k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int k = removeDuplicates(arr);
        System.out.println("Number of unique elements :" + k);

        for(int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
