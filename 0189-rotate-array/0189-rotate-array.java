class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        arrrev(nums,0,nums.length-1);
        arrrev(nums,0,k-1);
        arrrev(nums,k,nums.length-1);
    }
    private static void arrrev(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}