//Return the majority element appearing in an array 
//Majority element is the one which appears more than n/2 times in the array
//Assume that there is one majority element in the array

public class MajorityEl {
    public static int Majority(int[] nums){
        int MajorityEl=-1;
        for(int i = 0; i<nums.length ; i++){
            int count = 0;
            for(int j = 0; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                MajorityEl = nums[i];
                break;
            }
        }
        return MajorityEl;
    }

    public static void main(String[] args){
        int[] nums = {34,54,2,2,44,5,2,5,2,2,2,2,2};
        System.out.println(Majority(nums));
    }
    
}
