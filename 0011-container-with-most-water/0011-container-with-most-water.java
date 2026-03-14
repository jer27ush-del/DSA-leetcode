class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int rigth=height.length-1;
        int max=0;
        while(left<rigth){
            int h = Math.min(height[left], height[rigth]);
            int width=rigth-left;
            int area=h*width;
            max=Math.max(area,max);
            if(height[left]<height[rigth]){
                left++;
            }
            else{
                rigth--;
            }
        }
            return max;
        
    }
}