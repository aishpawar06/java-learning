//Second largest element using a function without any sorting


public class Slargest {
    public static int SecondLar(int[] nums){
        int Slargest = -1;
        int largest = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>largest){
                Slargest = largest;
                largest = nums[i];
            }
            else if(nums[i]<largest && nums[i]>Slargest){

                Slargest=nums[i];
            }
        }
        return Slargest;
    }

    public static void main(String[] args){
        int[] nums = {23,43,2,45,22,100,99,4,35,6,32};
        System.out.println("Second largest element in the array is : " + SecondLar(nums));
    }
    
}
