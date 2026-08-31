class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        // T: 0(n), S:0(1)
        //=[1,3,0,3,12]
        // i
        // j
        for(int i  = 0; i<nums.length; i=i+1){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j=j+1;

            }
        }
        while(j<nums.length){
            nums[j]=0;
            j=j+1;
        }
        
    }
}