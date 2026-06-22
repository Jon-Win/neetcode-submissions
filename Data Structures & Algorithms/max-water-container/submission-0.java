class Solution {
    public int maxArea(int[] heights) {
        int l = 0; 
        int r = heights.length - 1; 
        int ret = 0; 

        while(l<r){
            int area = (r-l) * Math.min(heights[r], heights[l]);
            ret = Math.max(ret, area);
            if(heights[l]<heights[r]){
                l++;
            } else if (heights[r]>heights[l]){
                r--;
            } else {
                r--;
            }
        }

        return ret;
    }
}
