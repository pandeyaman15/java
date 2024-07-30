import java.util.*;
import java.util.Arrays;
public class numeric {
    public static void main(String[] args) {
        int[] nums={5,6,1,2,3,4};
        // Arrays.sort(nums);
        // for(int i=0;i<=nums.length;i++){
        //     System.out.println(nums[i]);
        // }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    j++;
                }
                else{
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }    
        }
        System.out.println(nums[i]);
    }
}
}
