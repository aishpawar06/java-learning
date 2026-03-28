//Find the second largest element in an array
import java.util.Arrays;
public class SecondLargest {
    public static int SecLar(int[] nums){
        Arrays.sort(nums);
            return nums[nums.length-2];
    }
    public static void main(String args[]){
        int[] nums = {2,3,4,21,4,3,2,76,1};
        int number = SecLar(nums);
        System.out.println(number);
    }
}
