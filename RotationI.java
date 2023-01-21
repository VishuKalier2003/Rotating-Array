/* Suppose an array of length n sorted in ascending order is rotated between 1 and n times... For example, the array nums = [0,1,2,4,5,6,7] might become:
* [4,5,6,7,0,1,2] if it was rotated 4 times...
* [0,1,2,4,5,6,7] if it was rotated 7 times...
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]]... Given the sorted rotated array nums of unique elements, return the minimum element of this array...
  * Eg 1: nums = [2,3,1]                             minimum = 1
  * Eg 2: nums = [15,18,24,29,3,5,7,12]              minimum = 3
  * Eg 3: nums = [11,15,17,19]                       minimum = 11
  * Eg 4: nums = [3,4,5,1,2]                         minimum = 1
  */
import java.util.*;
public class RotationI
{
    public int FindMinimum(int nums[])
    {
        for(int i = 0; i < nums.length-1; i++)
        {
            if(nums[i] > nums[i+1])   // If the array is rotated the first decreasing number is the minimum...
                return nums[i+1];
        }
        return nums[0];    // If array is not rotated the first number is the minimum...
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the length of the sorted array : ");
        x = sc.nextInt();
        int array[] = new int[x];
        for(int i = 0; i < array.length; i++)
        {
            System.out.print("Enter data : ");
            array[i] = sc.nextInt();
        }
        RotationI rotationI = new RotationI();    // Object creation...
        System.out.println("The Minimum number is : "+rotationI.FindMinimum(array));
        sc.close();
    }
}

// Time Complexity  - O(n) time...
// Space Complexity - O(1) space...

/* DEDUCTIONS :- 
 * 1. If the array is rotated the minimum number is between the array or at its end, otherwise the minimum  number is the first number itself...
*/