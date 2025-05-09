/*
Problem:

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

*/
// Date: 03-24-2025

public class TwoSum{
    static void Two()
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int target;
        int targetReq = 3;
        
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                target = nums[i] + nums[j];
                if (target == targetReq)
                {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
    public static void main(String... args)
    {
        Two();
    }
}

