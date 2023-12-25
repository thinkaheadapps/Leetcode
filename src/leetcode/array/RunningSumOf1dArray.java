package leetcode.array;

public class RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {
        int N = nums.length;
        int[] rSumArray = new int[N];

        rSumArray[0] = nums[0];

        for(int i = 1; i < N; i++) {
         rSumArray[i] = rSumArray[i -1] + nums[i];
        }

        for (int num : rSumArray) {
            System.out.print(num + " ");
        }
        return rSumArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int[] rSum = runningSum(nums);
        for (int num : rSum) {
            System.out.print(num + " ");
        }
    }



}

/*
https://leetcode.com/problems/running-sum-of-1d-array/
* */
