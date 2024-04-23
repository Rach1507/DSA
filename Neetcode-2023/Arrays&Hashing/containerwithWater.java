class containerwithWater {
    public int maxArea(int[] height) {

        // similar to max profit best time to sell

        int area = 0, maxArea = 0;
        // brute force , 1,1 1,2, 1,3,1,4 1,5 ,1, height.length-1 , maintain maxArea
        // for(int i =0 ; i < height.length-1; i++)
        // for(int j =0 ; j < height.length; j++){
        // area = Math.min(height[i],height[j]) * (j-i);
        // if(area > maxArea) maxArea = area;
        // }
        // [1,8,6,2,5,4,8,3,7]
        // [0,8,6,2,5,4,8,3,7]


        // area - reverse engineer
        // lowest of the heights * (indexOf1 - indexOf2)

        // heart mind saaf

        int l = 0, r = height.length - 1;

        while (l < r) {
            area = Math.min(height[l], height[r]) * (r - l);
            if (area > maxArea)
                maxArea = area;

            if (height[l] > height[r])
                r--;
            else
                l++;

        }
        return maxArea;
    }

}